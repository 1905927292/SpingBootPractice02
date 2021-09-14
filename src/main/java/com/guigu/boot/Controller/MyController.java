package com.guigu.boot.Controller;

import com.guigu.boot.POJO.Car;
import com.guigu.boot.POJO.PersonY;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    Car car;
    @RequestMapping("/car")
    public Car car(){
        return car;
    }

    //http://localhost:8080/car
    @Autowired
    PersonY personY;
    @RequestMapping("/Person")
    public PersonY personY(){
        return personY;
    }
}
