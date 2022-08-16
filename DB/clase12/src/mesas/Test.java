package mesas;



import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Test {
    private static final String SQL_CREATE_TABLE=
            "DROP TABLE IF EXISTS EMPLEADOS;" +
                    "CREATE TABLE EMPLEADOS (" +
                    "ID INT PRIMARY KEY, " +
                    "NOMBRE VARCHAR(50) , " +
                    "APELLIDO VARCHAR(100) , " +
                    "DNI CHAR(20) , " +
                    "PUESTO VARCHAR(100) )";
    private static final String SQL_INSERT_1 = "INSERT INTO EMPLEADOS (ID, NOMBRE, APELLIDO, DNI, PUESTO) VALUES" +
            "(1, 'Taylor', 'Swift', '43626410', 'jefa'),"+
            "(2, 'Sofia', 'Hola', '44747383', 'empleada')," +
            "(3, 'Tomas', 'Joner', '5938373', 'actor')";

    private static final String SQL_SELECT="SELECT * FROM EMPLEADOS";
    private static final String SQL_UPDATE = "UPDATE EMPLEADOS SET ID=7 WHERE ID=2";
    private static final Logger logger= Logger.getLogger(presencial.Main.class);


    public static void main(String[] args) {
        //esta to do lo que se ejecuta
        Connection connection=null;
        try{
            connection=getConnection();
            Statement statement= connection.createStatement();
            //crear la tabla
            statement.execute(SQL_CREATE_TABLE);
            statement.execute(SQL_INSERT_1);
            statement.execute(SQL_UPDATE);

            ResultSet rs=statement.executeQuery(SQL_SELECT);
            System.out.println("ID       NOMBRE         APELLIDO          DNI            PUESTO");
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - -  - - - - - - -  - - -");
            while (rs.next()){
                System.out.println(rs.getInt(1)+"        "+
                        rs.getString(2)+"            "+rs.getString(3)+
                        "         "+rs.getInt(4)+"        "+rs.getString(5));
            }

            ResultSet res=statement.executeQuery(SQL_SELECT);
            while (res.next()){
                logger.debug("Se actualizo la información del empleado: \n" + "ID: "
                        + res.getInt(1) + "\nNombre: " + res.getString(2) + "\nApellido: "
                        + res.getString(3) + "\nEdad: " + res.getInt(4) + "\nEmail: " + res.getString(5));
            }


            //intentamos que salte excepción
            //rs=statement.executeQuery(SQL_SELECT2);
            //int c=10/0;

        }
        catch (Exception exception){
            logger.error(exception.getMessage());
            exception.printStackTrace();
        }
    }


    public static Connection getConnection() throws Exception{
        //indicar el driver y retornar el getconnection del DriverManager
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection(
                "jdbc:h2:~/clase12",
                "sa",
                "sa");
    }
}
