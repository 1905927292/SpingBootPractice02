package com.guigu.boot;

import com.guigu.boot.POJO.Pet;
import com.guigu.boot.POJO.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * configuration为配置类
 * 必须在Controller包下被扫描否则单独配置
 * proxyBeanMethods true为单例模式
 * false可以多次调用
 */
@Configuration(proxyBeanMethods = true)

//当Bean中有name为Tom的组件，该配置类才生效
public class Config {
    @Bean //给容器中添加组件。以方法名作为组件的id。返回类型就是组件类型。返回的值，就是组件在容器中的实例
    public User user01(){
        //User组件依赖了Pet组件 true 都是来自容器中
        User userZhang=new User("three",18);
        userZhang.setPet(tomcatPet());
        //此时同为容器中对象，使用true进行组件依赖，所以User的Pet和@Bean的Pet是一个对象
        return new User("zhangsan", 18);

    }
    @Bean("tom")
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }
}


