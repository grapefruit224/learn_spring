package com.example.learn_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringApplication {

    @Value("${kakao.api.key}")
    private String name;

    public static void main(String[] args) {

        // 싱글톤 패턴
        // 아래 3개는 따로 선언했지만 같은 인스턴스다! == 싱글톤
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println("====================================");
        System.out.println(singleton1);
        System.out.println("====================================");
        System.out.println(singleton2);

        // 
//        Singleton singleton3 = new Singleton();
//        System.out.println(singleton3);
//        System.out.println("====================================");
//        Singleton singleton4 = new Singleton();
//        System.out.println(singleton4);



//        SpringApplication.run(BasicApplication.class, args);
    }

}
