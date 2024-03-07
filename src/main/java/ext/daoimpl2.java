package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class daoimpl2 implements IDao {
    @Override
    public double getdate() {
        System.out.println("verson de base de donnes");
        double data=15;
        return data;
    }
}
