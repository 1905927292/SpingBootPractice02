package com.guigu.boot;

import com.guigu.boot.POJO.Pet02;
import ch.qos.logback.core.db.DBHelper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Import(DBHelper.class)
//通过import导入组件
@Configuration(proxyBeanMethods = false)
@ImportResource("classpath:Beans.xml")
//必须是false才能配合生产
public class Config02 {
    @Bean("Pet02")
    @ConditionalOnBean(name = "Pet03")
    public Pet02 pet02(){
        return new Pet02("dada");
    }
    @Bean("Pet03")
    public Pet02 pet03(){
        return new Pet02("dada02");
    }
}
