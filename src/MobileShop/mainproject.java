package MobileShop;

import java.util.*;
public class mainproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CellphoneDAO cellphoneDAO=CellphoneDAOFactory.createCellphoneDAO();
		while(true) {
			try {
				int choice;
				System.out.println("1, Create new entry ");
				System.out.println("2, Retreive");
				System.out.println("3, Update");
				System.out.println("4, For sell");
				System.out.println("5, Exit program***");
				
				System.out.print("Enter your choice? 1/2/3/4/5: ");
				choice=sc.nextInt();
				
				switch(choice) {
				case 1:
					Cellphone cellphone=cellphoneDAO.input();
					String result=cellphoneDAO.create(cellphone);
					System.out.println(result);
					break;
				case 2:
					result=cellphoneDAO.fatchAll();
					System.out.println(result);
					break;
				case 3:
					System.out.println("Enter values of existing record only****");
					cellphone=cellphoneDAO.input();
					result=cellphoneDAO.update(cellphone);
					System.out.println(result);
					break;
				case 4:
					System.out.println("Enter existing cellphone id to sold: ");
					cellphone=cellphoneDAO.inputforsale();
					result=cellphoneDAO.delete(cellphone);
					System.out.println(result);
					break;
				case 5:
					System.out.println("Thanks for using my software******");
					System.exit(0);
					//break;
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
