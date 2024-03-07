package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presversionannotation {
    public static void main(String[] args) {
        //on place le nom de package
        ApplicationContext ctx = new AnnotationConfigApplicationContext("dao","metier") ;
       //cherche une instance qui implemente Imetier
        Imetier metier = ctx.getBean(Imetier.class);
        System.out.printf("le resultat "+metier.getcalcul());


    }
}
