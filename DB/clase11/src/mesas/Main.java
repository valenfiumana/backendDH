package mesas;

import java.sql.*;

public class Main {
    private static final String SQL_CREATE_TABLE="DROP TABLE IF EXISTS FIGURAS; CREATE TABLE" +
            " FIGURAS ("
            +" ID INT PRIMARY KEY,"
            +" NOMBRE VARCHAR(100) NOT NULL,"
            +" COLOR VARCHAR(100) NOT NULL)";
    private static final String SQL_INSERT="INSERT INTO FIGURAS (ID, NOMBRE, COLOR) VALUES " +
            "(1, 'circulo', 'rojo')," +
            "(2,'cuadrado', 'azul')," +
            "(3,'circulo', 'rojo'), " +
            "(4,'cuadrado', 'rojo')," +
            "(5,'cuadrado', 'violeta')";
    private static final String SQL_SELECT_WHERE="SELECT * FROM FIGURAS WHERE COLOR='rojo'";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        Connection connection= DriverManager.getConnection(
                "jdbc:h2:~/clase11","sa","sa");
        Statement statement= connection.createStatement();
        statement.execute(SQL_CREATE_TABLE);
        statement.execute(SQL_INSERT);
        ResultSet rs=statement.executeQuery(SQL_SELECT_WHERE);
        System.out.println(" ID     FIGURA     COLOR");
        System.out.println(" - - - - - - - - - - - - - ");
        while (rs.next()){
            System.out.println(rs.getInt(1)+"      "+rs.getString(2)+"     "+
                    rs.getString(3));
        }

    }
}
