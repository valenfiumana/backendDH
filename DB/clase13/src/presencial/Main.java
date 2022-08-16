package presencial;

import java.sql.*;

public class Main {
    private static final String SQL_CREATE_TABLE="DROP TABLE IF EXISTS CUENTAS;" +
            " CREATE TABLE CUENTAS ("
            +" ID INT PRIMARY KEY," +
            " NRO_CUENTA INT NOT NULL," +
            " NOMBRE VARCHAR(100) NOT NULL," +
            " SALDO NUMERIC(10,2) NOT NULL)";
    private static final String SQL_INSERT=
            "INSERT INTO CUENTAS (ID, NRO_CUENTA, NOMBRE, SALDO) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE=
            "UPDATE CUENTAS SET SALDO=? WHERE ID= ?";
    private static final String SQL_SELECT=
            "SELECT * FROM CUENTAS";

    public static void main(String[] args) {
        Cuenta cuenta= new Cuenta(1,800,"CajaAhorro",10d);
        Connection connection=null;
        try{
            connection=getConnection();
            //crear la tabla
            Statement statement=connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            //insertar la cuenta de la línea 20
            PreparedStatement ps=connection.prepareStatement(SQL_INSERT);
            ps.setInt(1,cuenta.getId());
            ps.setInt(2,cuenta.getNroCuenta());
            ps.setString(3, cuenta.getNombre());
            ps.setDouble(4,cuenta.getSaldo());
            ps.executeUpdate();

            //primera actualización
            PreparedStatement psUpdate=connection.prepareStatement(SQL_UPDATE);
            psUpdate.setDouble(1,cuenta.getSaldo()+10);
            psUpdate.setInt(2,cuenta.getId());
            psUpdate.executeUpdate();

            connection.setAutoCommit(false);
            PreparedStatement psUpdate2=connection.prepareStatement(SQL_UPDATE);
            psUpdate2.setDouble(1,cuenta.getSaldo()+25);
            psUpdate2.setInt(2,cuenta.getId());
            psUpdate2.executeUpdate();
            connection.commit();

            connection.setAutoCommit(true);
            ResultSet rs= statement.executeQuery(SQL_SELECT);
            while (rs.next()){
                System.out.println("ID: "+rs.getInt(1)+"-Saldo: "+rs.getDouble(4));
            }
        }
        catch (Exception e){
            if (connection!=null){
                try{
                    connection.rollback();
                }
                catch (SQLException exception){
                    exception.printStackTrace();
                }
            }
            e.printStackTrace();
        }
    }

        public static Connection getConnection() throws Exception{
            Class.forName("org.h2.Driver");
            return DriverManager.getConnection("jdbc:h2:~/clase13","sa","sa");
        }


}
