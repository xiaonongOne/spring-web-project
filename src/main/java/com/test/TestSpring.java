package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Dumplings; 
import com.pojo.Hotel;

public class TestSpring {

//    @Test
//    public void test(){
//        ApplicationContext context = new ClassPathXmlApplicationContext(
//                new String[]{"applicationContext.xml"}
//        );
//
//        Dumplings dumplings = (Dumplings) context.getBean("dumplings");
//        System.out.println(dumplings.getPie());
//        System.out.println(dumplings.getSize());
//    }
    
    @Test
    public void saveOrderTest(){
    	ApplicationContext context = new ClassPathXmlApplicationContext(
    			new String[]{"applicationContext.xml"}
    			);
    	
    	Hotel hotel = (Hotel) context.getBean("hotel");
    	System.out.println(hotel.getOrderInfo());
    }
    
    
}
