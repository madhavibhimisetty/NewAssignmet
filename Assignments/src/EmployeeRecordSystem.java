package Assignment6;
import java.sql.*;
import java.io.*;
import javax.sql.*;
public class EmployeeRecordSystem {
	public static void main(String args[])
	    {     
		Connection con;
	     Statement state;
	     ResultSet rs;
	     int ch;
	     boolean flag=true;
	     String decision;
	     int no;
	     try
	    { 
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    con=DriverManager.getConnection("jdbc:oracle:thin:@myhost:1521:orcl", "scott", "tiger");;
	     System.out.println("Statement object created");
	    do
	    {    System.out.println("\n");
	    System.out.println("Menu:");
	    System.out.println("1.Insert Record into the table");
	    System.out.println("2.Update the Existing Record.");
	    System.out.println("3.Display all the records from the table");
	    System.out.println("4.Exit");
	    System.out.println("Enter your choice:");
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    ch=Integer.parseInt(br.readLine());
	     switch(ch)
	    {
	    case 1:
	     System.out.println("Enter Employee No:");
	     no=Integer.parseInt(br.readLine());
	     System.out.println("Enter Employee Name:");
	    String name=br.readLine();
	    System.out.println("Enter Employee Salary:");
	    int sal=Integer.parseInt(br.readLine());
	    String sql="Insert into employee1 values(?,?,?)";
	    PreparedStatement p=con.prepareStatement(sql);
	    p.setInt(1,no);
	    p.setString(2,name);
	    p.setInt(3,sal);
	    p.executeUpdate();
	    System.out.println("Record Added");
	    break;   
	    case 2:
	    state=con.createStatement();
	    while(flag)
	    {    
	    	
	    System.out.println("Enter Employee no. for the record you wish to update:");
	     no=Integer.parseInt(br.readLine());
	    System.out.println("Enter new name:");
	    name=br.readLine();
	    System.out.println("Enter new Salary:");
	    sal=Integer.parseInt(br.readLine());
	    sql="Update employee1 set employee1.name='"+name+"',employee1.sal="+sal+" where(((employee1.[no])="+no+"))";
	    System.out.println(sql);
	    int rows=state.executeUpdate(sql);
	    System.out.println(rows+"rows successfully updated");
	     System.out.println("Do you want to update more data:y/n:");
	    decision=br.readLine().toLowerCase();
	    if(decision.charAt(0)=='n')
	    flag=false;
	    }    break;
	    case 3:
	    state=con.createStatement();
	    sql="Select * from employee1";
	    rs=state.executeQuery(sql);
	    while(rs.next())
	    {
	    System.out.println("\n");
	    System.out.println("\t"+rs.getInt(1));
	    System.out.println("\t"+rs.getString(2));
	    System.out.println("\t"+rs.getInt(3));
	    }
	    break;
	    case 4:  System.exit(0);          
	    default:  System.out.println("Invalid Choice");
	    break;   
	    } }                          
	    while (ch!=4);
	    }
	    catch(Exception e)
	    {
	     System.out.println(e);
	    }
	    }
	}