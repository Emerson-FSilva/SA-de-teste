package br.com.projetoDAO.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {

    static final String URL = "jdbc:mysql://localhost:3306/projetoDAO?useTimezone=true&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "";

    public static Connection conectar() {
        Connection con = null;

        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            return con;
        } catch (Exception e) {
            System.out.println("Nao foi possivel conectar"+e);
            return null;
        }
    }

    public static void desconectar(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Nao foi possivel desconectar"+e);
        }
    }
}
