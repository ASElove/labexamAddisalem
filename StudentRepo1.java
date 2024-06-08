
package com.naven.diioc;
import java.sql.*;
public class StudentRepo1 {
public static void main(String[] args) throws SQLException {
String jdbcURL = "jdbc:mysql://localhost:3306/addis";
String username = "addis";
String pwd = "12345";
Connection connection = DriverManager.getConnection(jdbcURL,
username, pwd);
Statement statement = connection.createStatement();
String query = "Select * from student_name";
String createTableSQL = "CREATE TABLE student_name (" +
"id int auto_increment primary key," +
"name varchar(255)," +
"email varchar(255),)";
statement.executeUpdate(createTableSQL);
System.out.println("Ttable ‘student_name’ created successfully.");

// define SQL insert statements for each row of data
String[] insertStatements = {

"insert into teacher1(name, email) values('Aster', 'aster@gmail.com')",
"insert into teacher1(name, email) values('Jemal', 'jemal@gmail.com')"

};



	for(String stmt : insertStatements) {
		statement.executeUpdate(stmt);
	}
	System.out.println("Data Inserted Successfullly.");
	}
}




