package com.knowledgekart.spark_learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.knowledgekart.spark_learning.context.ContextProvider;

/**
 * Hello world!
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spark.applicationcontext.xml");
    	AppManager manager = (AppManager)context.getBean(AppManager.class);
    	manager.startJob();
    }
}
