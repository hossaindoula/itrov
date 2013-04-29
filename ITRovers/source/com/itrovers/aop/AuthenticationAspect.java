package com.itrovers.aop;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wings4.security.model.User;
import com.wings4.util.ERPConstants;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.wings4.security.SessionUtil;

@Aspect
public class AuthenticationAspect {
	
	@Pointcut("within(@org.springframework.stereotype.Controller *) " +
			"&& !within(@org.springframework.stereotype.Controller com.wings4.guest.AuthenticationController) ")
	public void allControllers(){}
	
	@Pointcut("execution(* *(..))")
    public void methodPointcut() {}

	@Around("allControllers() && methodPointcut()")
	public Object proceedToAction(ProceedingJoinPoint proceedJoinPoint) throws Throwable {
		if(SessionUtil.getSession().getAttribute(ERPConstants.SESSION_USER) instanceof User){
            return proceedJoinPoint.proceed();
		} else {
            return new ModelAndView("redirect:/");
		}
	}

}
