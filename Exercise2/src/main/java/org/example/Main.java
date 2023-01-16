package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        NotificationService notificar = (NotificationService) context.getBean("notificationService");
        String notificación = notificar.notificationService();
        System.out.println(notificación);


        UserService usuario = (UserService) context.getBean("userService");
        System.out.println(usuario.notificationService.notificationService());
    }

}