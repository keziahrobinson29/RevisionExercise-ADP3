package za.ac.cput.KeziahRobinson_219113149;


import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Keziah Robinson - 219113149
 *
 */

public class RevisionTest {
    public RevisionTest(){
    }

    private RevisionClass firstTest;
    private RevisionClass secondTest;
    private RevisionClass thirdTest;

    @BeforeAll
    public static void setUpClass()
    {
    }

    @AfterAll
    public static void tearDownClass()
    {
    }

    @BeforeEach
    public void setUp(){
        firstTest = new RevisionClass();
        secondTest = new RevisionClass();
        thirdTest = secondTest;
    }

    @AfterEach
    public void tearDown()
    {
    }
    /*-----------------------------Object Equality--------------------------------*/

    @Test
    public void testEquality()
    {
        Assertions.assertEquals(secondTest,thirdTest);
    }
    /*------------------------------Object Identity-------------------------------*/

    @Test
    public void testIdentity(){
        Assertions.assertSame(secondTest,thirdTest);
    }

    /*---------------------------------Fail Test----------------------------------*/

    @Test
    public void testFail(){
        Assertions.fail("This is supposed to fail test");
        Assertions.assertSame(secondTest, thirdTest);
    }

    /*----------------------------------Timeout-----------------------------------*/

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void testTimeout() {
        System.out.println("Timeout has passed");
    }
    /*--------------------------------Disable Test--------------------------------*/

    @Test
    @Disabled("Has been disabled")

    void testWillBeSkipped() {
    }

}
