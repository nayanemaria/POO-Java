package controle;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexao {
    // Atributo de gerenciamento da conexão
    private Connection con;
    // Encapsulamento do atributo
    public Connection getCon(){
        return this.con;
    }
    public void setCon(Connection data){
        this.con = data;
    }
    // Construtor
    public Conexao(){
        try{
            this.setCon(null);
            // Define o driver de conexão
            Class.forName("com.mysql.jdbc.Driver");
            // JDBC -> Java DataBase Connector
            String servidor = "jdbc:mysql://localhost/aula";
            String senha = "123456";
            String usuario = "root";
            this.setCon(DriverManager.getConnection(servidor,usuario,senha));
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void fecharConexao(Connection con){
        try{
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
