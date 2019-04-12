package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class LoginDao {
    Connection connection;

    public boolean verifyLogin(String username, String password) throws Exception{

        connection = DBConnection.connectToDb();
        PreparedStatement preparedStatement =
                connection.prepareStatement("select from Bentuzer where ('Benutzername', 'Passwort')");

        return true;

    }



}
