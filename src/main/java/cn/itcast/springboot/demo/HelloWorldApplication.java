package cn.itcast.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//标识该类为SpringBoot的入口类
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@Configuration
public class HelloWorldApplication {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }

    public static void main(String[] args){
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}
