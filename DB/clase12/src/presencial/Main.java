package presencial;



import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {
    private static final String SQL_CREATE_TABLE=
            "DROP TABLE IF EXISTS USUARIOS;"
            +"CREATE TABLE USUARIOS ("
            +"ID INT PRIMARY KEY, "
            +"PRIMER_NOMBRE VARCHAR(100) NOT NULL, "
            +"APELLIDO VARCHAR(100) NOT NULL, "
            +"EDAD INT NOT NULL)";
    private static final String SQL_INSERT1=
            "INSERT INTO USUARIOS (ID,PRIMER_NOMBRE,APELLIDO,EDAD) VALUES"
                    + " (1,'Rodolfo','Baspineiro',29)";
    private static final String SQL_INSERT2=
            "INSERT INTO USUARIOS (ID,PRIMER_NOMBRE,APELLIDO,EDAD) VALUES"
                    + " (2,'Pedro','López',45)";
    private static final String SQL_INSERT3=
            "INSERT INTO USUARIOS (ID,PRIMER_NOMBRE,APELLIDO,EDAD) VALUES"
                    + " (3,'Pablo','Martini',80)";
    private static final String SQL_DELETE=
            "DELETE FROM USUARIOS WHERE ID=3";
    private static final String SQL_SELECT="SELECT * FROM USUARIOS";
    private static final String SQL_SELECT2="SELECT * FROM DIGITAL";

    private static final Logger logger= Logger.getLogger(Main.class);




    public static void main(String[] args) {
        //esta to do lo que se ejecuta
        Connection connection=null;
        try{
            connection=getConnection();
            Statement statement= connection.createStatement();
            //crear la tabla
            statement.execute(SQL_CREATE_TABLE);
            //inserto tres elementos
            statement.execute(SQL_INSERT1);
            statement.execute(SQL_INSERT2);
            statement.execute(SQL_INSERT3);
            //eliminamos el tercero y loggeamos
            statement.execute(SQL_DELETE);
            logger.warn("Se eliminó al usuario con id=3");
            //mostrar los datos de la BD
            ResultSet rs=statement.executeQuery(SQL_SELECT);
            while (rs.next()){
                System.out.println("ID: "+rs.getInt(1)+" -Primer nombre: "+
                        rs.getString(2)+" -Apellido: "+rs.getString(3)+
                        " -Edad: "+rs.getInt(4));
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
