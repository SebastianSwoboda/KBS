package dao;

import logic.UserType;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDao {
    Connection connection;

    public void addUserToDb(String userName, String password, String email) throws Exception{
        connection = DBConnection.connectToDb();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into Benutzer values  (?, ?, ?, ?, ?)");
        preparedStatement.setString(1, null);
        preparedStatement.setString(2, UserType.User.toString());
        preparedStatement.setString(3, email);
        preparedStatement.setString(4, userName);
        preparedStatement.setString(5, password);

        preparedStatement.executeUpdate();

    }




}
