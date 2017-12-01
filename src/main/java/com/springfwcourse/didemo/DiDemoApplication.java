package com.springfwcourse.didemo;

import com.springfwcourse.didemo.springframework.controllers.ConstructorInjectedController;
import com.springfwcourse.didemo.springframework.controllers.MyController;
import com.springfwcourse.didemo.springframework.controllers.PropertyInjectedController;
import com.springfwcourse.didemo.springframework.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import javax.naming.ldap.Control;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springfwcourse.services","com.springfwcourse.didemo"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		//MyController controller = (MyController) ctx.getBean("myController");

		//controller.hello();
		System.out.println(ctx.getBean(MyController.class).hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
