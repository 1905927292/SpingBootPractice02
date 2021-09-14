package com.guigu.boot.POJO;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 加入到Spring容器中
 */
@ToString
@Data
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private Integer price;
    private String brand;
}
