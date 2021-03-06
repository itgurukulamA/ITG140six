package com.example.demo.Sms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SmsController {  
	private static final String TOPIC_DESTINATION = "/lesson/sms";
	@Autowired 
	SmsService obj; 
	 @Autowired
	 private SimpMessagingTemplate webSocket;
	
	 
	@RequestMapping(value="/sendmail", method=RequestMethod.POST)
	public String Sendmail(@RequestBody Mail obj1)
	{
		return obj.sendMail1(obj1);
		
	} 
	@PostMapping("/otp")
	public ResponseEntity<String> ValidateToken(@RequestBody TempOTP otp){
		
		int sentotp=OTPpojo.getOtp();
		System.out.println(sentotp+":"+otp.getOtp());
		if(sentotp==otp.getOtp()) {
		    return new ResponseEntity<String>("Success otp", HttpStatus.OK );	
		}
		return new ResponseEntity<String>("faliure",HttpStatus.OK);
	}
	 @RequestMapping(value = "/smscallback", method = RequestMethod.POST,
	            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public void smsCallback(@RequestBody MultiValueMap<String, String> map) {
	       obj.receive(map);
	       webSocket.convertAndSend(TOPIC_DESTINATION, getTimeStamp() + ": Twilio has made a callback request! Here are the contents: "+map.toString());
	    }
	 @RequestMapping(value = "/rajesh", method = RequestMethod.POST)
	  public ResponseEntity<Boolean> smsSubmit(@RequestBody SmsPojo sms) {
	        try{
	        	System.out.println("hello");
	            obj.send(sms);  
	            System.out.println("hello");
	            
	        }
	        catch(Exception e){
	        	System.out.println(e);
	        	return new ResponseEntity<Boolean>(false,HttpStatus.INTERNAL_SERVER_ERROR);
	        }
			webSocket.convertAndSend(TOPIC_DESTINATION, getTimeStamp() + ": SMS has been sent!: "+sms.getTo());
	        return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	 }
	 private String getTimeStamp() {
	       return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
	    } 
	 @RequestMapping(value="/verifypassword",method=RequestMethod.POST)
	 public String verifyOtp(@RequestBody Verify obj1) 
	 {
		 return obj.checkOtp(obj1);
	 }
	 
	  

}
