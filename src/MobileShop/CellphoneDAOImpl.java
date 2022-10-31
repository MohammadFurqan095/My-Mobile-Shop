package MobileShop;

import java.sql.*;
import java.util.*;

import com.mysql.cj.xdevapi.Schema.CreateCollectionOptions;
public class CellphoneDAOImpl implements CellphoneDAO{
	private String driver="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/my shop";
	private String username="root",password="";
	Connection con=null;
	void createConnection() {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public String create(Cellphone cellphone) {
		// TODO Auto-generated method stub
		String result=" ";
		try {
			createConnection();
			String insertquery="insert into mobileshop(mobileid,brandname,modelname,ram,"
					+ "rom,processor,buydate,priceofcellphone,currentstatus) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(insertquery);
			ps.setInt(1, cellphone.getMobileid());
			ps.setString(2, cellphone.getBrandname());
			ps.setString(3, cellphone.getModelname());
			ps.setString(4, cellphone.getRam());
			ps.setString(5, cellphone.getRom());
			ps.setString(6, cellphone.getProcessor());
			ps.setString(7,cellphone.getBuydate());
			ps.setDouble(8, cellphone.getPriceofcellphone());
			ps.setString(9, "Available");
			int res=ps.executeUpdate();
			result=res+"record/s insert in mobileshop table";
			ps.close();
			con.close();
		}
		catch(Exception e) {
			result=e.toString();
		}
		return result;
	}

	@Override
	public String fatchAll() {
		// TODO Auto-generated method stub
		String result=" ";
		try {
			createConnection();
			String query="select * from mobileshop "+
			"where currentstatus='Available' " ;
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()==true) {
				for(int i=1;i<=10;i++) {
					result+=rs.getString(i)+"\t ";
				}
				result+="\n";
			}
			rs.close();
			stmt.close();
		}
		catch (Exception e) {
			result=e.toString();
		}
		return result;
	}

	@Override
	public Cellphone input() {
		// TODO Auto-generated method stub
		Cellphone cellphone=new Cellphone();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter cellphone brand name: ");
		cellphone.setBrandname(sc.nextLine());
		System.out.print("Enter cellphone model name: ");
		cellphone.setModelname(sc.nextLine());
		System.out.print("Enter cellphone RAM: ");
		cellphone.setRam(sc.nextLine());
		System.out.print("Enter cellphone ROM: ");
		cellphone.setRom(sc.nextLine());
		System.out.print("Enter cellphone processor: ");
		cellphone.setProcessor(sc.nextLine());
		System.out.print("Enter cellphone buydate (yyyy/mm/dd): ");
		cellphone.setBuydate(sc.nextLine());
		System.out.print("Enter price of cellphone: ");
		cellphone.setPriceofcellphone(sc.nextDouble());
		System.out.print("Enter mobile id: ");
		cellphone.setMobileid(sc.nextInt());
		
		return (cellphone);
	}

	@Override
	public String update(Cellphone cellphone) {
		// TODO Auto-generated method stub
		String result=" ";
		try {
			String query="update mobileshop set "+
			"brandname=?, "+
					"modelname=?, "+
			"ram=?, "+  "rom=?, "+
					"processor=?, "+
			"buydate=?, "+
					"priceofcellphone=? "+
			" where mobileid=? ";
			createConnection();
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, cellphone.getBrandname());
			ps.setString(2, cellphone.getModelname());
			ps.setString(3, cellphone.getRam());
			ps.setString(4, cellphone.getRom());
			ps.setString(5,cellphone.getProcessor());
			ps.setString(6, cellphone.getBuydate());
			ps.setDouble(7, cellphone.getPriceofcellphone());
		    ps.setInt(8, cellphone.getMobileid());
			int res=ps.executeUpdate();
			result=res+"Record update in  mobileshop table ";
		}
		catch(Exception e) {
			result=e.toString();
		}
		return result;
	}
	
	@Override
	public Cellphone inputforsale() {
		// TODO Auto-generated method stub
		Cellphone cellphonesale=new Cellphone();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter cellphone sale date (yyyy/mm/dd): ");
		cellphonesale.setSelldate(sc.nextLine());
		System.out.print("Enter mobile id: ");
		cellphonesale.setMobileid(sc.nextInt());
		
		return (cellphonesale);
	}

	@Override
	public String delete(Cellphone cellphonesale) {
		// TODO Auto-generated method stub
		String result=" ";
		try {
			String query="update mobileshop set "+
					"currentstatus='sold ', "+
					"selldate=?"+
					"where mobileid=? ";
			createConnection();
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, cellphonesale.getSelldate());
			ps.setInt(2, cellphonesale.getMobileid());
			int res=ps.executeUpdate();
			result=res+" Record/s sold from mobileshop table ";
			ps.close();
			con.close();
		}
		catch(Exception e) {
			result=e.toString();
		}
		return result;
	}	
}