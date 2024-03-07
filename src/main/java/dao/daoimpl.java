package dao;

import org.springframework.stereotype.Component;

@Component
public class daoimpl implements IDao{

    @Override
    public double getdate() {
        System.out.println("verson de base de donnes");
        double data=34;
        return data;
    }


}
