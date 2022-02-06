package za.ac.cput.YasmeenNel_219250553;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

/* Author Yasmeen Nel - 219250553 */

public class RevisionTestYasmeen {

    public RevisionTestYasmeen(){
    }
    private Revision219250553 student1;
    private Revision219250553 student2;
    private Revision219250553 student3;


    @BeforeAll
    public static void setUpClass() {

    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        student1 = new Revision219250553();
        student2 = new Revision219250553();
        student3 = student2;
    }

    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Testing for object identity
     */

    @Test
    public void testIdentity() {
        Assertions.assertSame(student2,student3);
        System.out.println("testidentity has passed.");
    }

    /**
     * Testing for object equality
     */

    @Test
    public void testEquality() {
        Assertions.assertEquals(student2,student3);
        System.out.println("testEquality has passed");
    }

    /**
     * Testing for Failure
     */

    @Test
    public void testFailure(){
        Assertions.fail("This test must fail.");
    }

    /**
     * Testing timeout after 1000 milliseconds
     */
    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void testTimeout() {
        System.out.println("Timeout has passed");
    }

    /**
     * Test for Disabling a test
     */

    @Disabled
    @Test
    public void testDisable(){
        System.out.println("This test will be disabled");
    }
}
