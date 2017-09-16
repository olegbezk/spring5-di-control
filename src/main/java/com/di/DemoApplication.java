package com.di;

import com.di.controllers.ConstructorInjectedController;
import com.di.controllers.GetterInjectedController;
import com.di.controllers.MyController;
import com.di.controllers.PropertyInjectedController;
import com.di.examplebeans.FakeDataSource;
import com.di.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        final MyController myController = (MyController) ctx.getBean("myController");

        final FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);

        final FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);

        System.out.println(fakeDataSource.getUser());

        System.out.println(fakeJmsBroker.getUser());

        System.out.println(myController.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
