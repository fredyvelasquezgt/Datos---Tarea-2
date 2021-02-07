import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Fredy Velasquez <macacoloco696gmail.com>
 */
public class CalculoIT {
    
    public CalculoIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of bienvenida method, of class Calculo.
     */
    @Test
    public void testBienvenida() {
        System.out.println("bienvenida");
        Calculo instance = new Calculo();
        instance.bienvenida();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inicio method, of class Calculo.
     */
    @Test
    public void testInicio() {
        System.out.println("inicio");
        Calculo instance = new Calculo();
        instance.inicio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resultadoOperaciones method, of class Calculo.
     */
    @Test
    public void testResultadoOperaciones() {
        System.out.println("resultadoOperaciones");
        String ejecutar = "";
        Calculo instance = new Calculo();
        int expResult = 0;
        int result = instance.resultadoOperaciones(ejecutar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suma method, of class Calculo.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int x = 0;
        int y = 0;
        Calculo instance = new Calculo();
        int expResult = 0;
        int result = instance.suma(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculo.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int x = 0;
        int y = 0;
        Calculo instance = new Calculo();
        int expResult = 0;
        int result = instance.resta(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class Calculo.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int x = 0;
        int y = 0;
        Calculo instance = new Calculo();
        int expResult = 0;
        int result = instance.multiplicacion(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculo.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int x = 0;
        int y = 0;
        Calculo instance = new Calculo();
        int expResult = 0;
        int result = instance.division(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of operar method, of class Calculo.
     */
    @Test
    public void testOperar() {
        System.out.println("operar");
        Stack x = null;
        Calculo instance = new Calculo();
        int expResult = 0;
        int result = instance.operar(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decode method, of class Calculo.
     */
    @Test
    public void testDecode() {
        System.out.println("decode");
        String a = "";
        Calculo instance = new Calculo();
        String expResult = "";
        String result = instance.decode(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
