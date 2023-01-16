package org.example;

import com.Ejemplos.Saludo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static <ApplicationContext> void main(String[] args) {
        org.springframework.context.ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //EJERCICIO 1
        Saludo saludo = (Saludo) context.getBean("imprimirSaludo");

        String texto = saludo.saludoHola();
        System.out.println(texto);
    }

}
