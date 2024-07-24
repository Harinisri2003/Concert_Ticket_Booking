package com.skcet.liveConcert.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ConcertAspect {
	
//	@Before(value = "execution(* com.skcet.liveConcert.controller.*.*(..))")
//	public void beforeAdvice() {
//		System.out.println("Hello");
//	}
	
//	@Before(value = "execution(* com.skcet.liveConcert.controller.BookingController.*(..))")
//	public void beforeAdvice() {
//		System.out.println("Hello");
//	}
	
	@Before(value = "execution(* com.skcet.liveConcert.controller.BookingController.getBookings(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature() +  " started at " + System.currentTimeMillis());
	}
	
//	@After(value = "execution(* com.skcet.liveConcert.controller.*.*(..))")
//	public void afterAdvice() {
//		System.out.print("World");
//	}
	
//	@After(value = "execution(* com.skcet.liveConcert.controller.BookingController.*(..))")
//	public void afterAdvice() {
//		System.out.println("Hello");
//	}
	
	@After(value = "execution(* com.skcet.liveConcert.controller.BookingController.getBookings(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature() +  " ended at " + System.currentTimeMillis());
	}
}
















