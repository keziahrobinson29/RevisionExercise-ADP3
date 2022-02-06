package za.ac.cput.HumaamMohamed_214044750;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertSame;





    public class TestTestDrivenDev {

        private TestTestDrivenDev Test1;
        private TestTestDrivenDev Test2;
        private TestTestDrivenDev Test3;


        public TestTestDrivenDev() {
        }

        @BeforeAll
        public static void setUpClass() {
        }

        @AfterAll
        public static void tearDownClass() {
        }

        @BeforeEach
        public void setUp() throws Exception {
            Test1 = new TestTestDrivenDev();
            Test2 = new TestTestDrivenDev();
            Test3 = Test2;
        }

        @AfterEach
        public void tearDown() {
        }
        //Fail
        @Test
        void failingTest() {
            fail("a failing test");
        }
        //Disabled
        @Test
        @Disabled("for demonstration purposes")
        void skippedTest() {
        }
        //TimeOut
        @Test
        void timeoutNotExceeded() {

            assertTimeout(ofMinutes(2), () -> {
            });
        }
        //TestEquality
        @Test
        public void testEquality() {
            assertTrue(new TestTestDrivenDev().equals(new TestTestDrivenDev()));
        }

        @Test
            //TestIdentity
        void testIdentity(){

            assertSame(Test1,Test2);

        }


    }

