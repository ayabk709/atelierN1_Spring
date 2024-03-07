package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presentationspring {


    public static void main(String[] args) {
        //appel le spring
        //on va allez lire le fichier xml
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
       //il me donne la reference de l'objet qui implmente Imetier
        //donner une instance du bean qui implémente l'interface Imetier.
        Imetier metier = ctx.getBean(Imetier.class);
        System.out.println(metier.getcalcul());

    }
}
