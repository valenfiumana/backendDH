package mesas;
import java.sql.*;

public class Main {
    private static final String SQL_CREATE_TABLE="DROP TABLE IF EXISTS ODONTOLOGOS;" +
            " CREATE TABLE ODONTOLOGOS ("
            +" ID INT PRIMARY KEY," +
            " NOMBRE VARCHAR(100) NOT NULL," +
            " APELLIDO VARCHAR(100) NOT NULL," +
            " MATRICULA VARCHAR(100) NOT NULL)";

    private static final String SQL_INSERT=
            "INSERT INTO ODONTOLOGOS (ID, NOMBRE, APELLIDO, MATRICULA) VALUES (?,?,?,?)";

    private static final String SQL_UPDATE=
            "UPDATE ODONTOLOGOS SET MATRICULA=? WHERE ID= ?";

    private static final String SQL_SELECT=
            "SELECT * FROM ODONTOLOGOS";

    public static void main(String[] args) {
        Odontologo odontologo = new Odontologo(1, "Carolina", "Diaz", "73636272");
        Connection connection = null;

        try{
            connection = getConnection();

            //CREO TABLA
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            //INSERTO
            PreparedStatement ps=connection.prepareStatement(SQL_INSERT);
            ps.setInt(1, odontologo.getId());
            ps.setString(2, odontologo.getNombre());
            ps.setString(3, odontologo.getApellido());
            ps.setString(4, odontologo.getMatricula());
            ps.executeUpdate();

            //ACTUALIZO
            connection.setAutoCommit(false);
            PreparedStatement psUpdate=connection.prepareStatement(SQL_UPDATE);
            psUpdate.setString(1,"13737373");
            psUpdate.setInt(2,odontologo.getId());
            psUpdate.executeUpdate();
            connection.commit();

            connection.setAutoCommit(true);

            //RESULTADO
            ResultSet rs= statement.executeQuery(SQL_SELECT);
            while (rs.next()){
                System.out.println(" ID: "+rs.getInt(1)+"\n NOMBRE: "+rs.getString(2)+
                        "\n APELLIDO: "+rs.getString(3)+"\n MATRICULA: "+rs.getString(4));
            }
        }catch(Exception e){
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
