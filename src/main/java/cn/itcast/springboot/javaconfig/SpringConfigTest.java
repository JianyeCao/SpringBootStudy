package cn.itcast.springboot.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class SpringConfigTest {
    public static void main(String[] args){
        AnnotationConfigApplicationContext beanFactory=new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource=beanFactory.getBean(DataSource.class);
//        System.out.println(userService.getUsers());
    }
}
