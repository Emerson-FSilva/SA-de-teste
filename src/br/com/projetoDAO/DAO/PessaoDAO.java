package br.com.projetoDAO.DAO;

import br.com.projetoDAO.Conexao.Conexao;
import br.com.projetoDAO.Model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PessaoDAO {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public boolean consultar() {
        String sql = "select * from pessoa";

        con = Conexao.conectar();
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            System.out.printf("%-5s|%-50s|%-20s\n", "ID", "Nome", "Profissao");
            while (rs.next()) {
                System.out.printf("%-5s|%-50s|%-20s\n", rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            return true;
        } catch (Exception e) {
            System.out.println("Não Foi Possivel Acessar Os Dados" + e);
            return false;
        } finally {
            Conexao.desconectar(con);
        }

    }

    public boolean inserir(Pessoa p) {

        String sql = "insert into pessoa (nome, profissao) values (?,?)";

        con = Conexao.conectar();
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, p.getNome());
            pst.setString(2, p.getProfissao());
            int pe = pst.executeUpdate();
            if (pe > 0) {
                System.out.println("Dados inseridos com sucesso!!");
            }
            return true;

        } catch (Exception e) {
            System.out.println("Não Foi Possivel Acessar Os Dados" + e);
            return false;
        } finally {
            Conexao.desconectar(con);
        }

    }

    public boolean atualizar(Pessoa p) {

        String Sql = "UPDATE pessoa set nome = ?, profissao = ? where id = 2";
        con = Conexao.conectar();
        try {
            pst = con.prepareStatement(Sql);
            pst.setString(1, p.getNome());
            pst.setString(2, p.getProfissao());
            pst.executeUpdate();
            System.out.println("Atualizado com sucesso");
            return true;
        } catch (Exception e) {
            System.out.println("Erro");
            return false;
        }

    }

    public boolean deletar() {
        String sql = "delete from pessoa where id = 3";

        con = Conexao.conectar();
        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Não Foi Possivel Acessar Os Dados" + e);
            return false;
        } finally {
            Conexao.desconectar(con);
        }

    }

    public boolean consultaporId() {
        String sql = "Select * from pessoa where id = 2";

        con = Conexao.conectar();

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            System.out.printf("%-5s|%-50s|%-20s\n", "ID", "Nome", "Profissao");
            while (rs.next()) {

                System.out.printf("%-5s|%-50s|%-20s\n", rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            return true;
        } catch (Exception e) {
            System.out.println("Não foi possível acessar os dados: " + e);
            return false;
        } finally {
            Conexao.desconectar(con);
        }
    }

}
