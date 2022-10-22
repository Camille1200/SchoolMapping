/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmapping;

/**
 *
 * @author oliver
 */
import java.util.*;
import java.sql.*;
public class Database {
    public Connection connection;
    public ResultSet resultSet;
    public String query = null;
    public PreparedStatement statement;
}
