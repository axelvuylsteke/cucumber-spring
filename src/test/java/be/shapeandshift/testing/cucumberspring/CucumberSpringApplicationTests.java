package be.shapeandshift.testing.cucumberspring;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CucumberSpringApplication.class)
public abstract class CucumberSpringApplicationTests {

}
