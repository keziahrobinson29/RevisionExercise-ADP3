package za.ac.cput.DominicPrzygonski_219206414;


import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dominic przygonski - 219206414
 */

public class ExampleTest {

    private Example testing1;
    private Example testing2;
    private Example testing3;

    public ExampleTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() throws Exception{
        testing1 = new Example();
        testing2 = new Example();
        testing3 = testing2;

        testing1.setValue1(5);
        testing1.setValue2(5);


    }

    @AfterEach
    public void tearDown() {
    }

    //Test Object Equality, meant to pass
    @Test
    public void testEquality(){
        int ans = testing1.LessThanTen(testing1.getValue1(), testing1.getValue2());
        assertEquals(10, ans);
    }

    //Test Object identity, meant to pass
    @Test
    public void testIdentity(){
        assertSame(testing2, testing3);
    }

    //Test fail, meant to fail
    @Test
    public void testFail(){
        fail("This is meant to fail");
    }

    //Test timeout, meant to skip
    @Test
    @Timeout(1)
    void testTimeout() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
    }

    //Disabled test, meant to skip
    @Disabled("Disabled test")
    @Test
    void testDisable() {
        assertEquals(testing1, testing2);
    }
}