package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class metierimpl implements Imetier{
    //depend de IDAO

   private IDao dao;
    public metierimpl(IDao dao) {
        this.dao = dao;
    }
    //injectiond e variable dao
/*    public void setDao(IDao dao) {
        this.dao = dao;
    }*/
    @Override
    public double getcalcul() {
        double d = dao.getdate();
        double res=  (d*11.4);
    return res;

    }



}
