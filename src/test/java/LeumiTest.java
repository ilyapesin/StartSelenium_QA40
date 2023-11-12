import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LeumiTest {
    WebDriver wd;
    @BeforeMethod
    public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.leumi.co.il/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void leumiTest(){
        WebElement  leumi=wd.findElement(By.xpath("//span[contains(text(),'פרטי')]"));
        System.out.println(leumi.getText());

    }
    @AfterMethod
    public void tearDown() {
        // wd.quit();
    }

}
