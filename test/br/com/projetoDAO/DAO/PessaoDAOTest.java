/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoDAO.DAO;

import br.com.projetoDAO.Model.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tina
 */
public class PessaoDAOTest {

    Pessoa p;
    Pessoa p1;
    Pessoa p2;

    public PessaoDAOTest() {
        p = new Pessoa("paulo", "aluno");
        p1 = new Pessoa("coroline", "programdora");
        

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of consultar method, of class PessaoDAO.
     */
    @Test
    public void testConsultar() {
        System.out.println("consultar");
        PessaoDAO instance = new PessaoDAO();
        assertTrue(instance.consultar());
    }

    /**
     * Test of inserir method, of class PessaoDAO.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        PessaoDAO pd = new PessaoDAO();
        assertTrue(pd.inserir(p));

    }

    @Test
    public void testatualizar() {
        System.out.println("Atulalizar");
        PessaoDAO pd1 = new PessaoDAO();
        assertTrue(pd1.atualizar(p1));

    }

    @Test
    public void testdeletar() {
        System.out.println("deletar");
        PessaoDAO pd2 = new PessaoDAO();
        assertTrue(pd2.deletar());

    }
    @Test
    public void testconsultaporId() {
        System.out.println("Consulta por ID");
        PessaoDAO pd3 = new PessaoDAO();
        assertTrue(pd3.consultaporId());

    }

}
