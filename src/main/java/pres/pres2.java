package pres;

import dao.IDao;
import metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

Scanner sc = new Scanner(new File("config.txt"));
/*Scanner sc = new Scanner(System.in);
        System.out.println("donner le nom de la classe dao");*/
//lecture de premier ligne
String daoClassName = sc.nextLine();
     //charger dans la memoire
       Class cDao = Class.forName(daoClassName);
        //puis on instancie
// equivalene a new daoimpl()
        IDao dao = (IDao) cDao.getConstructor().newInstance();
        System.out.println(dao.getdate());
///metier
     System.out.println("donner le nom de la classe metier");

     String metierClassName = sc.nextLine();
        Class cMetier = Class.forName(metierClassName);
        //puis on instancie
/*        Imetier metier = (Imetier) cMetier.getConstructor().newInstance();*/
        //injection de dependance
        //par constuctuer
        Imetier metier = (Imetier) cMetier.getConstructor(IDao.class).newInstance(dao);
        //apple de set d une maniere dynamique
        //ou le type de parametre soit IDAO
      //  Method m = cMetier.getDeclaredMethod("setDao",IDao.class);
        //injection des independances
        //m.invoke(metier,dao);//first object means the object lequel la méthode doit être invoquée of the method second object means parameter of the method
        System.out.println(metier.getcalcul());

    }
}
