package com.example.demo.Sms;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.sun.xml.messaging.saaj.packaging.mime.internet.ParseException;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class SmsService {  
	private final String ACCOUNT_SID ="ACe793f04f0f71ee5bbc36fe2f877a18fd";

    private final String AUTH_TOKEN = "7dea07564d333c97ea1b987779129720";

    private final String FROM_NUMBER = "+16626726609";
	
	@Autowired  
	private JavaMailSender javaMailSender;   
	
	@Autowired 
	NamedParameterJdbcTemplate namedJdbcTemplate;
	
	public String sendOtp(TempOTP s) 
	{
		return null;
	}
    public String sendMail1(Mail obj)
    {
    	String to=obj.getTo();
    	String subject=obj.getSubject(); 
    	String body=obj.getBody();
    	SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(to);
        msg.setSubject(subject);
        msg.setText(body); 
        try {
        javaMailSender.send(msg);
        return "Mail Sent Successfully"; 
        }
        catch(Exception e)
        {
        	return "mail Not Sent";
        }
    } 
    public void send(SmsPojo sms) throws ParseException {
    	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        int min = 100000;  
         int max = 999999; 
        int number=(int)(Math.random()*(max-min+1)+min);
      
        
        String msg ="Your OTP - "+number+ " please verify this OTP in your Application by Dharmisetty Rajesh";
       
        
        Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER), msg).create();
          
         String sql="insert into otps values(:otp,:phone)";  
         Map<String,Object> in=new HashMap<String,Object>();
         in.put("otp", number);
         in.put("phone", sms.getTo());
         int i=namedJdbcTemplate.update(sql,in);
      /*  Date myDate=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = sdf. parse(myDate.toString()); 
        long millis = date. getTime(); 
        System.out.println(millis);
       OTPpojo.setOtp(number);
        System.out.println("here is my id:"+message.getSid());// Unique resource ID created to manage this transaction
*/ 
    } 
    public void receive(MultiValueMap<String, String> smscallback) {
    	   
    } 
    public String checkOtp(Verify obj)
    { 
    	 int otp=obj.getOtp();
    	 String no=obj.getNumber(); 
    	 String sql="select count(*) from otps where Phoneno=:number";
    	 Map<String,Object> in=new HashMap<String,Object>(); 
    	 in.put("number", no);
    	 int res=namedJdbcTemplate.queryForObject(sql,in,Integer.class);
    	 if(res>0)
    	 { 
    		  sql="select count(*) from otps where otp=:number";
        	 Map<String,Object> in1=new HashMap<String,Object>(); 
        	 in1.put("number", otp);
        	  res=namedJdbcTemplate.queryForObject(sql,in1,Integer.class);
    		 if(res>0)
    		 { 
    			 sql="delete from otps where Phoneno=:number";
    			 int i=namedJdbcTemplate.update(sql, in);
    			 return "Authenticated..........";
    		 }
    		 else
    		 {
    			 return "You are not a authenticated person please enter the otpcorrectly";
    		 }
    		 
    	 }
    	 else
    	 {
    		 return "Your Number DoesNot Exist";
    	 }
    	 
    	 
    	 
    }
    
}
