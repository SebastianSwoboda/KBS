package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    Connection connection;

    public boolean verifyLogin(String username, String password) throws Exception {

        connection = DBConnection.connectToDb();
        PreparedStatement preparedStatement =
                connection.prepareStatement("select from Bentuzer where ('Benutzername', 'Passwort')");
        ResultSet resultSet = preparedStatement.getResultSet();
        return resultSet.next();


    }


}
