package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    Connection connection;

    public boolean verifyLogin(String username, String password) throws Exception {

        connection = DBConnection.connectToDb();
        PreparedStatement preparedStatement =
                connection.prepareStatement("Select Benutzername, Passwort from Benutzer where Benutzername = ? and Passwort = ?");
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        preparedStatement.executeQuery();

        ResultSet resultSet = preparedStatement.getResultSet();
        return resultSet.next();


    }


}
