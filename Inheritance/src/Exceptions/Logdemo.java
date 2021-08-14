package Exceptions;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import java.io.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.*;
public class Logdemo {
	static Logger obj=Logger.getLogger(Logdemo.class.getName());
	public static void main(String args[]) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		String S=dtf.format(now); 
		BasicConfigurator.configure();
		obj.debug(S+"  Hello this is debug message ");
		System.out.println("log4j program executed successfully");
	}
}
