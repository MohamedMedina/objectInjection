package org.mohamed.com;

import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	

	public static void main(String[] args) {
		// firstly by using the traditional  way to instanciate  the object
		//Triangle triangle  = new Triangle();
        // triangle .draw();
		// secondly we use bean factory
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		//Triangle triangle = (Triangle)factory.getBean("traingle");
		
		// Another way instead of using xmlbeanfactory is the applicationContext like the next
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
	}

}
