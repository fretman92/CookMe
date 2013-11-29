package bean;

import java.sql.*;
import java.util.Random;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class PageManager {
	private Random generator;
	private String[] pageList= {"helloSample/hello1","helloSample/hello2","helloSample/hello3"};
	
	public PageManager() {
		generator=new Random();
	}
	
	public String goToPage() throws ClassNotFoundException, SQLException{
		System.out.println();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnx = DriverManager.getConnection("jdbc:mysql://dp-tp.cpe.fr:3306/cookme_binome07","binome28","binome28");
		
		Statement query = cnx.createStatement();
		
		ResultSet rs = query.executeQuery("SELECT * FROM cookme_binome07.receipes");
		while( rs.next() )
		{
		
			System.out.println("Chaine : " + rs.getString( "nom" ) );
		}
		rs.close();
		query.close();
		cnx.close();
 
		
		return 	pageList[generator.nextInt(2)];
	}
}
