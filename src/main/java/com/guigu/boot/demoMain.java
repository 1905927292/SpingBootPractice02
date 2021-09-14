package com.guigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class demoMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(demoMain.class, args);
        System.out.println("SpringBoot运行成功");
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("=======================");


       /* Pet tom = ioc.getBean("tom", Pet.class);
        System.out.println(tom);
        System.out.println("======================");
        Config config=ioc.getBean(Config.class);
        //获取配置类组件
        User user = config.user01();
        User user1=config.user01();
        Pet pet = config.tomcatPet();
        Pet pet1 = config.tomcatPet();
        //获取容器中的实例
        System.out.println("此刻Configuration的属性为ture为单例模式，所以应该为True");
        System.out.println(user==user1);
        System.out.println(pet==pet1);
        System.out.println("=================");
        Config02 config02=ioc.getBean(Config02.class);
        Pet02 pet02 = config02.pet02();
        Pet02 pet021=config02.pet02();
        System.out.println("此刻的proxyBeanMethods为false所以为多实例，输出为false");
        System.out.println(pet02==pet021);
        System.out.println(pet02);
        System.out.println(pet021);*/

        boolean user01 = ioc.containsBean("Pet02");
        System.out.println("容器中是否存在Pet02组件"+user01);
        //确实存在user01组件
        boolean haha = ioc.containsBean("HAHA");
        System.out.println("引入资源配置文件时候IOC容器中是否存在haha的bean"+haha);

    }
}
