/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schoolmapping;

/**
 *
 * @author oliver
 */
import java.util.*;
import java.sql.*;
public class SchoolMapping {

    /**
     * @param args the command line arguments
     */
    
    public static final String url = "jdbc:mysql://localhost:3306/db_mapping";
    public static final String userName = "root";
    public static final String passWord = "";
    Database db = new Database();
    public static void main(String[] args) {
        // TODO code application logic here
        SchoolMapping _this = new SchoolMapping();
        //_this.addCoordinates(50, 10, 1, "john");
        //_this.addGuide(1,"Go to school", "john");
        //addPlace("Clinic", "https://www.google.com","john");
        //addAdmin("John", "johndoe","Password123", "john");
        //updateCoordinates(11, 15, "john", 1, 1);
        //updateGuide(2, 2, "go home", "john", 2);
        //updatePlace("Washroom", "https://www.facebook.com", "john", 1);
        //updateAdmin("OkayNo.1ito", "john", 1);
        _this.loadAdmin();
        _this.loadGuide();
        _this.loadMapCoordinates();
        _this.loadPlace();
    }
    
    public void addCoordinates(int x, int y, int place_id, String user)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            db.connection = DriverManager.getConnection(url, userName, passWord);
            db.statement = db.connection.prepareStatement("INSERT INTO map_coordinates (coord_x, coord_y, place_id, added_by, datecreated) VALUES (?, ?, ?, ?, now());");
   	    db.statement.setInt(1,x);
            db.statement.setInt(2, y);
            db.statement.setInt(3, place_id);
            db.statement.setString(4, user);
            db.statement.executeUpdate();
             System.out.println("Coordinates added!");
            db.connection.close();
        }catch(Exception ex)
        {
         ex.printStackTrace();
        }
    }
    
    public void updateCoordinates(int x, int y, String user, int place_id, int coordinate_id)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            db.connection = DriverManager.getConnection(url, userName, passWord);
            db.query = "UPDATE map_coordinates SET coord_x = ?, coord_y = ?, dateupdated = now(), updated_by = ? , place_id = ? where coordinate_id = ?;";
            db.statement = db.connection.prepareStatement(db.query);
   	    db.statement.setInt(1,x);
            db.statement.setInt(2, y);
            db.statement.setString(3, user);
            db.statement.setInt(4, place_id);
            db.statement.setInt(5, coordinate_id);
            db.statement.executeUpdate();
             System.out.println("Coordinates updated!");
             db.connection.close();
        }catch(Exception ex)
        {
         ex.printStackTrace();
        }
    }
    
    public void addGuide(int placeID, String instruction, String added_by)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            db.connection = DriverManager.getConnection(url, userName, passWord);
            db.query = "INSERT INTO guide (place_id, instruction_no, instruction, added_by, datecreated)  VALUES (?, 1, ?, ?, now());";
            db.statement = db.connection.prepareStatement(db.query);
            db.statement.setInt(1, placeID);
            db.statement.setString(2, instruction);
            db.statement.setString(3, added_by);
            db.statement.executeUpdate();
             System.out.println("Guide added!");
             db.connection.close();
        }catch(Exception ex)
        {
         ex.printStackTrace();
        }
    }
    
    public void updateGuide(int placeID, int instruction_no, String instruction, String updated_by, int guide_id)
    {
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");  
            db.connection = DriverManager.getConnection(url, userName, passWord);
            db.statement = db.connection.prepareStatement("UPDATE guide SET place_id = ?, instruction_no = ?, instruction = ?, dateupdated = now(), updated_by = ? WHERE guide_id = ?");
   	    db.statement.setInt(1,placeID);
            db.statement.setInt(2, instruction_no);
            db.statement.setString(3, instruction);
            db.statement.setString(4, updated_by);
            db.statement.setInt(5, guide_id);
            db.statement.executeUpdate();
             System.out.println("guide updated!");
             db.connection.close();
        }catch(Exception ex)
        {
         ex.printStackTrace();
        }
    }
    
    
    
    public void addPlace(String placeName, String placeURL, String added_by )
    {
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            db.connection = DriverManager.getConnection(url, userName, passWord);
            db.statement = db.connection.prepareStatement("INSERT INTO place (place_name, place_url, added_by, datecreated)  VALUES (?, ?, ?, now());");
            db.statement.setString(1, placeName);
            db.statement.setString(2, placeURL);
            db.statement.setString(3, added_by);
            db.statement.executeUpdate();
             System.out.println("Place added!");
             db.connection.close();
        }catch(Exception ex)
        {
         ex.printStackTrace();
        }
    }
    
    public void updatePlace(String placeName, String placeURL, String updatedBy, int placeID)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            db.connection = DriverManager.getConnection(url, userName, passWord);
            db.statement = db.connection.prepareStatement("UPDATE place SET place_name = ?, place_url = ?, dateupdated = now(), updated_by = ? WHERE place_id = ?");
            db.statement.setString(1, placeName);
            db.statement.setString(2, placeURL);
            db.statement.setString(3, updatedBy);
            db.statement.setInt(4, placeID);
            db.statement.executeUpdate();
            System.out.println("Place updated!");
            db.statement.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void addAdmin(String name, String username, String password, String added_by)
    {
         try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
             db.connection = DriverManager.getConnection(url, userName, passWord);
            db.statement = db.connection.prepareStatement("INSERT INTO superadmin (admin_name, admin_handle, admin_password, added_by, datecreated) VALUES (?, ?, ?, ?, now());");
            db.statement.setString(1, name);
            db.statement.setString(2, username);
            db.statement.setString(3, password);
            db.statement.setString(4, added_by);
            db.statement.executeUpdate();
             System.out.println("Admin added!");
             db.connection.close();
         }catch(Exception ex)
         {
            ex.printStackTrace(); 
         }
    }
    
    public void updateAdmin(String password, String updated_by, int admin_id)
    {
          try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            db.connection = DriverManager.getConnection(url, userName, passWord);
            db.statement = db.connection.prepareStatement("UPDATE superadmin SET admin_password = ?, dateupdated = now(), updated_by = ? WHERE admin_id = ?");
            db.statement.setString(1, password);
            db.statement.setString(2, updated_by);
            db.statement.setInt(3, admin_id);
            db.statement.executeUpdate();
            System.out.println("Admin account updated!");
            db.statement.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void loadAdmin()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            db.connection = DriverManager.getConnection(url, userName, passWord);
            db.query = "SELECT * from superadmin";
            db.statement = db.connection.prepareStatement(db.query);
            db.resultSet = db.statement.executeQuery();
            
            while(db.resultSet.next())
            {
                System.out.println("Admin Name:" + db.resultSet.getString("admin_name"));
                System.out.println("Admin ID: "+db.resultSet.getInt("admin_id"));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void loadGuide()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            db.connection = DriverManager.getConnection(url, userName, passWord);
            db.query = "SELECT * from guide;";
            db.statement = db.connection.prepareStatement(db.query);
            db.resultSet = db.statement.executeQuery();
            
            while(db.resultSet.next())
            {
                System.out.println("Guide ID: " + db.resultSet.getInt("guide_id"));
                System.out.println("Instruction "+db.resultSet.getString("instruction"));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void loadMapCoordinates()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            db.connection = DriverManager.getConnection(url, userName, passWord);
            db.query = "SELECT * from map_coordinates;";
            db.statement = db.connection.prepareStatement(db.query);
            db.resultSet = db.statement.executeQuery();
            
            while(db.resultSet.next())
            {
                System.out.println("Coordinate ID: " + db.resultSet.getInt("coordinate_id"));
                System.out.println("Coord X: "+db.resultSet.getInt("coord_x"));
                System.out.println("Coord Y: "+db.resultSet.getInt("coord_y"));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void loadPlace()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            db.connection = DriverManager.getConnection(url, userName, passWord);
            db.query = "SELECT * from place;";
            db.statement = db.connection.prepareStatement(db.query);
            db.resultSet = db.statement.executeQuery();
            
            while(db.resultSet.next())
            {
                System.out.println("Place ID: " + db.resultSet.getInt("place_id"));
                System.out.println("Name: "+db.resultSet.getString("place_name"));
                System.out.println("URL: "+db.resultSet.getString("place_url"));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
