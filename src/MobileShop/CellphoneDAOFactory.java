package MobileShop;

public class CellphoneDAOFactory {
              	public static CellphoneDAO createCellphoneDAO() {
  				return(new CellphoneDAOImpl());
			}
}
