package com.example.learin_spring_0701;

//@SpringBootApplication
public class Spring0701Application {

    public static void main(String[] args) {

        // MVC 패턴
        User model = new User("max@gmail.com", "dlthwjd", 27);
        UserView userView = new UserView();
        UserController userController = new UserController(model, userView);
        userController.updateView();
        userController.setUserName("김승조랑말");
        userController.setUserAge(31);
        System.out.println("=======================");
        userController.updateView();
//        SpringApplication.run(Spring0701Application.class, args);
    }

}
