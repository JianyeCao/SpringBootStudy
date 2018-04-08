package cn.itcast.springboot.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext beanFactory=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService=beanFactory.getBean(UserService.class);
        System.out.println(userService.getUsers());
    }
}
