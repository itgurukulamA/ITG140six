package com.example.demo.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	private static final Logger log = LoggerFactory.getLogger(EmployeeAspect.class);
	@After(value= "execution(* com.example.demo.Aspect.EmployeeService.*(..)) and args(e)")
	//@Around(value= "execution(* com.example.demo.Aspect.EmployeeService.*(..)) and args(e)")
	public void beforeAdvice(JoinPoint joinPoint,Employee e)
	{
	log.info(e.getName());
	log.debug(e.getEmail());
	log.warn(e.getName());
	System.out.println("After method:" + joinPoint.getSignature());
	System.out.println(e.getAge()+" "+e.getEmail());
	}
	}
