package pres;

import dao.IDao;
import dao.daoimpl;
import ext.daoimpl2;

import metier.metierimpl;

public class Pres1 {
    public static void main(String[] args) {

            //instancaiation statique
            System.out.println("Hello World");
            IDao dao = new daoimpl();
            metierimpl metier = new metierimpl(dao);
            //injection de dependance
           // metier.setDao(dao);
            System.out.println(metier.getcalcul());
    }
}
