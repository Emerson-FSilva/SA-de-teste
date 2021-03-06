package br.com.projetoDAO.DAO;

import br.com.projetoDAO.Model.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class PessaoDAOTest {

    Pessoa p;
    Pessoa p1;
    Pessoa p2;

    public PessaoDAOTest() {
        // p = new Pessoa("paulo", "aluno");
        //p1 = new Pessoa("coroline", "programdora");

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
    @Ignore
    public void testConsultar() {
        System.out.println("consultar");
        PessaoDAO instance = new PessaoDAO();
        assertTrue(instance.consultar());
    }

    /**
     * Test of inserir method, of class PessaoDAO.
     */
    @Test
    @Ignore
    public void testInserir() {
        System.out.println("inserir");
        PessaoDAO pd = new PessaoDAO();
        Pessoa p = new Pessoa("carla", "faxineira");
        assertTrue(pd.inserir(p));

    }

    @Test
    @Ignore
    public void testatualizar() {
        System.out.println("Atulalizar");
        PessaoDAO pd1 = new PessaoDAO();
        Pessoa p1 = new Pessoa(7, "Joao", "administração");
        assertTrue(pd1.atualizar(p1));

    }

    @Test
    public void testdeletar() {
        System.out.println("deletar");
        PessaoDAO pd2 = new PessaoDAO();               
        assertTrue(pd2.deletar(6));

    }

    @Test
    @Ignore
    public void testconsultaporId() {
        System.out.println("Consulta por ID");
        PessaoDAO pd3 = new PessaoDAO();
        assertTrue(pd3.consultaporId(1));

    }

}
