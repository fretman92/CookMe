package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDb {
	Connection conn;
	
	public ConnectionDb() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		conn = DriverManager.getConnection("jdbc:mysql://db-tp.cpe.fr:3306/binome03" , "binome03", "binome03");
		
	}
	
	public String openBb() throws SQLException   {
		Statement query = conn.createStatement();
		ResultSet rs;
		try {
			rs = query.executeQuery( "SELECT * FROM recipes");
		} catch (SQLException e) {
			query.executeUpdate( "CREATE  TABLE `binome03`.`recipes` ("
			 +"`idrecipes` INT NOT NULL AUTO_INCREMENT ,"
			 +"`name` VARCHAR(45) NOT NULL , "
			 +"`description` LONGTEXT NULL ,"
			 +"`rating` INT NULL ,"
			 +"`duration` INT NULL ,"
			 +"`persons` INT NULL ,"
			 +"PRIMARY KEY (`idrecipes`) )"
			 +"ENGINE = InnoDB; ");
			
			query = conn.createStatement();
			query.executeUpdate( "INSERT INTO `binome03`.`recipes` ( `name`, `description`, `rating`, `duration`, `persons`) VALUES ( 'La recette 1', 'La description 1', 1, 2, 3);");
			/*query.executeUpdate( "INSERT INTO `binome03`.`recipes` ( `name`, `description`, `rating`, `duration`, `persons`) VALUES ( 'Choux aux pruneaux', 'La description 1', 1, 2, 3);",1);
			query.executeUpdate( "INSERT INTO `binome03`.`recipes` ( `name`, `description`, `rating`, `duration`, `persons`) VALUES ( 'Choucroute de lasagnes', 'La description 1', 1, 2, 3);",1);
			query.executeUpdate( "INSERT INTO `binome03`.`recipes` ( `name`, `description`, `rating`, `duration`, `persons`) VALUES ( 'Boudin aux bananes', 'La description 1', 1, 2, 3);",1);
*/
			rs = query.executeQuery( "SELECT * FROM recipes");
			e.printStackTrace();
		}
		String result = "";
		while( rs.next() )
		{
			result += rs.getString( "name" );
			System.out.println("Chaine : " + rs.getString( "name" ) );
		}
		rs.close();
		query.close();
		conn.close();
		return result;
	}
}
