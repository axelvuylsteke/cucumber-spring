package be.shapeandshift.testing.cucumberspring;

import io.cucumber.java.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest()
public class CucumberSpringApplicationTestSetup {
    @Before
    public void setUp() {
        System.out.println("STARTING");
    }
    @Test
    public void testCheck() {
        System.out.println("JUnit test setup starts");
    }
}
