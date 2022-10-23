/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author dinoalix
 */
public class DBUtils {
    public Connection connection;
    public ResultSet resultSet;
    public String query = null;
    public PreparedStatement statement;
    public final String url = "jdbc:mysql://localhost:3306/db_mapping";
    public final String userName = "root";
    public final String passWord = "";
    
     public void addCoordinates(int x, int y, int place_id, String user)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            connection = DriverManager.getConnection(url, userName, passWord);
            statement = connection.prepareStatement("INSERT INTO map_coordinates (coord_x, coord_y, place_id, added_by, datecreated) VALUES (?, ?, ?, ?, now());");
   	    statement.setInt(1,x);
            statement.setInt(2, y);
            statement.setInt(3, place_id);
            statement.setString(4, user);
            statement.executeUpdate();
             System.out.println("Coordinates added!");
            connection.close();
        }catch(Exception ex)
        {
         ex.printStackTrace();
        }
    }
    
    public void updateCoordinates(int x, int y, String user, int place_id, int coordinate_id)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            connection = DriverManager.getConnection(url, userName, passWord);
            query = "UPDATE map_coordinates SET coord_x = ?, coord_y = ?, dateupdated = now(), updated_by = ? , place_id = ? where coordinate_id = ?;";
            statement = connection.prepareStatement(query);
   	    statement.setInt(1,x);
            statement.setInt(2, y);
            statement.setString(3, user);
            statement.setInt(4, place_id);
            statement.setInt(5, coordinate_id);
            statement.executeUpdate();
             System.out.println("Coordinates updated!");
             connection.close();
        }catch(Exception ex)
        {
         ex.printStackTrace();
        }
    }
    
    public void addGuide(int placeID, int instructionNo, String instruction, String added_by)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            connection = DriverManager.getConnection(url, userName, passWord);
            query = "INSERT INTO guide (place_id, instruction_no, instruction, added_by, datecreated)  VALUES (?, ?, ?, ?, now());";
            statement = connection.prepareStatement(query);
            statement.setInt(1, placeID);
            statement.setInt(2, instructionNo);
            statement.setString(3, instruction);
            statement.setString(4, added_by);
            statement.executeUpdate();
             System.out.println("Guide added!");
             connection.close();
        }catch(Exception ex)
        {
         ex.printStackTrace();
        }
    }
    
    public void updateGuide(int placeID, int instruction_no, String instruction, String updated_by, int guide_id)
    {
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");  
            connection = DriverManager.getConnection(url, userName, passWord);
            statement = connection.prepareStatement("UPDATE guide SET place_id = ?, instruction_no = ?, instruction = ?, dateupdated = now(), updated_by = ? WHERE guide_id = ?");
   	    statement.setInt(1,placeID);
            statement.setInt(2, instruction_no);
            statement.setString(3, instruction);
            statement.setString(4, updated_by);
            statement.setInt(5, guide_id);
            statement.executeUpdate();
             System.out.println("guide updated!");
             connection.close();
        }catch(Exception ex)
        {
         ex.printStackTrace();
        }
    }
    
    
    
    public void addPlace(String placeName, String placeURL, String added_by )
    {
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            connection = DriverManager.getConnection(url, userName, passWord);
            statement = connection.prepareStatement("INSERT INTO place (place_name, place_url, added_by, datecreated)  VALUES (?, ?, ?, now());");
            statement.setString(1, placeName);
            statement.setString(2, placeURL);
            statement.setString(3, added_by);
            statement.executeUpdate();
             System.out.println("Place added!");
             connection.close();
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
            connection = DriverManager.getConnection(url, userName, passWord);
            statement = connection.prepareStatement("UPDATE place SET place_name = ?, place_url = ?, dateupdated = now(), updated_by = ? WHERE place_id = ?");
            statement.setString(1, placeName);
            statement.setString(2, placeURL);
            statement.setString(3, updatedBy);
            statement.setInt(4, placeID);
            statement.executeUpdate();
            System.out.println("Place updated!");
            statement.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void addAdmin(String name, String username, String password, String added_by)
    {
         try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
             connection = DriverManager.getConnection(url, userName, passWord);
            statement = connection.prepareStatement("INSERT INTO superadmin (admin_name, admin_handle, admin_password, added_by, datecreated) VALUES (?, ?, ?, ?, now());");
            statement.setString(1, name);
            statement.setString(2, username);
            statement.setString(3, password);
            statement.setString(4, added_by);
            statement.executeUpdate();
             System.out.println("Admin added!");
             connection.close();
         }catch(Exception ex)
         {
            ex.printStackTrace(); 
         }
    }
    
    public void updateAdmin(String password, String _name, String _handle, String updated_by, int admin_id)
    {
          try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            connection = DriverManager.getConnection(url, userName, passWord);
            statement = connection.prepareStatement("UPDATE superadmin SET admin_name = ?, admin_handle = ?, admin_password = ?, dateupdated = now(), updated_by = ? WHERE admin_id = ?");
            statement.setString(1, _name);
            statement.setString(2, _handle);
            statement.setString(3, password);
            statement.setString(4, updated_by);
            statement.setInt(5, admin_id);
            statement.executeUpdate();
            System.out.println("Admin account updated!");
            statement.close();
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
            connection = DriverManager.getConnection(url, userName, passWord);
            query = "SELECT * from superadmin";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                System.out.println("Admin Name:" + resultSet.getString("admin_name"));
                System.out.println("Admin ID: "+resultSet.getInt("admin_id"));
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
            connection = DriverManager.getConnection(url, userName, passWord);
            query = "SELECT * from guide;";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                System.out.println("Guide ID: " + resultSet.getInt("guide_id"));
                System.out.println("Instruction "+resultSet.getString("instruction"));
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
            connection = DriverManager.getConnection(url, userName, passWord);
            query = "SELECT * from map_coordinates;";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                System.out.println("Coordinate ID: " + resultSet.getInt("coordinate_id"));
                System.out.println("Coord X: "+resultSet.getInt("coord_x"));
                System.out.println("Coord Y: "+resultSet.getInt("coord_y"));
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
            connection = DriverManager.getConnection(url, userName, passWord);
            query = "SELECT * from place;";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                System.out.println("Place ID: " + resultSet.getInt("place_id"));
                System.out.println("Name: "+resultSet.getString("place_name"));
                System.out.println("URL: "+resultSet.getString("place_url"));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public boolean loginAdmin(String username, String password)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            connection = DriverManager.getConnection(url, userName, passWord);
            query = "SELECT admin_handle FROM superadmin where admin_handle = ? and admin_password = ?;";
            statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            resultSet = statement.executeQuery();
            String validName = "";
            while(resultSet.next())
            {
                validName = resultSet.getString("admin_handle");
            }
            
            if(username.equals(validName))
            {
                 connection.close();
                return true;
            }else{
                connection.close();
                return false;
            }
           
        }catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
