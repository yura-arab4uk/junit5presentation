package working;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FakeSuiteTests {

    @BeforeAll
    public static void beforeSuite() {
        System.out.println("Before all \n\n");
    }

    @AfterAll
    public static void afterSuite() {
        System.out.println("After all ");
    }

    @Nested
    public class FirstTests {

        @BeforeEach
        public void beforeEach() {
            System.out.println("Before each firstNested");
        }

        @AfterEach
        public void afterEach() {
            System.out.println("After each firstNested\n");
        }

        @Test
        public void testFirstNestedOne() {
            System.out.println("test firstNested one");
            assertTrue(true);
        }

        @Test
        public void testFirstNestedTwo() {
            System.out.println("test firstNested two");
            assertTrue(true);
        }

        @Nested
        public class SecondTests {

            @BeforeEach
            public void beforeEach() {
                System.out.println("Before each secondNested");
            }

            @AfterEach
            public void afterEach() {
                System.out.println("After each secondNested");
            }

            @Test
            public void testSecondNestedOne() {
                System.out.println("test secondNested one");
                assertTrue(true);
            }

            @Test
            public void testSecondNestedTwo() {
                System.out.println("test secondNested two");
                assertTrue(true);
            }
        }

    }

}