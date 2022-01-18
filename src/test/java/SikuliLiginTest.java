import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.chrome.ChromeDriver;


public class SikuliLiginTest {
        WebDriver driver;

        @BeforeAll
        static void setupClass() {

                WebDriverManager.chromedriver().setup();
        }

        @BeforeEach
        void setupTest() {

                driver = new ChromeDriver();
                driver.manage().window().maximize();
        }

        @AfterEach
        void teardown() {
                if (driver != null) {
                        driver.quit();
                }
        }

        @Test
        void test() throws FindFailed {
               // System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
                String filepath = "C:\\Users\\Rahul_Kumar2\\Desktop\\SikuliTest\\sikuliimage\\";
                Screen s = new Screen();
                Pattern email = new Pattern(filepath + "email.PNG");
                Pattern passw = new Pattern(filepath + "passw.PNG");
                Pattern clickToLoginForm = new Pattern(filepath + "einloggen2.PNG");
                Pattern accepcookie = new Pattern(filepath + "accept3.PNG").similar(0.6);
                Pattern welcome = new Pattern(filepath + "Welcome3.PNG").similar(0.6);

                driver.get("https://www.lululemon.de/de-de/home");
                driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();

                //s.click(accepcookie) ;
                s.click(welcome) ;

        }
}
