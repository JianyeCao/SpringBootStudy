package cn.itcast.springboot.demo;

import cn.itcast.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

@Controller
//标识该类为SpringBoot的入口类
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@ComponentScan(basePackages = "cn.itcast.springboot")
public class HelloWorldApplication {
    @Autowired
    UserService userService;

    @Autowired
    DataSource dataSource;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(userService.getUsers());
        return "Hello World";
    }

    public static void main(String[] args){
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}
