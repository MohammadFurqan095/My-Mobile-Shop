package MobileShop;

public interface CellphoneDAO {
         String create(Cellphone cellphone);
         String fatchAll();
         Cellphone input();
         String update(Cellphone cellphone);
         Cellphone inputforsale();
         String delete(Cellphone cellphone);
}
