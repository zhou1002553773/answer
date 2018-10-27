package com.answer.framework.plantform.configuration;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@Order(3)
public class ControllerLogAspect {

    private static final Logger logger = LoggerFactory.getLogger(ControllerLogAspect.class);

    ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(public * com.answer.framework.*.*.controller.*.*( .. ))")
    public void controllerLog(){

    }

    @Before("controllerLog()")
    public void doBefore(JoinPoint joinPoint){
        logger.info("请求进入：");
        startTime.set(System.currentTimeMillis());

        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        logger.info("URL：" + request.getRequestURL());
//        logger.info("METHOD: " + request.getMethod());
        logger.info("CLASS_METHOD：" + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("ARGS: " + JSON.toJSON(joinPoint.getArgs()));

    }

    @AfterReturning(returning = "object",pointcut = "controllerLog()")
    public void doAfter(Object object){
        logger.info("返回的数据： " + JSON.toJSONString(object));
        logger.info("所用时间(ms)：" + (System.currentTimeMillis() - startTime.get()));
    }

}
