package com.springfwcourse.didemo;

import com.springfwcourse.didemo.springframework.controllers.ConstructorInjectedController;
import com.springfwcourse.didemo.springframework.controllers.MyController;
import com.springfwcourse.didemo.springframework.controllers.PropertyInjectedController;
import com.springfwcourse.didemo.springframework.controllers.SetterInjectedController;
import com.springfwcourse.didemo.springframework.examplebeans.FakeDataSource;
import com.springfwcourse.didemo.springframework.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import javax.naming.ldap.Control;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker =(FakeJmsBroker)ctx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUsername());
	}
}
