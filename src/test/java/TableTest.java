import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TableTest {
    WebDriver wd;
    @BeforeMethod
    public void init(){
        wd=new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void testCss() {
        wd.findElement(By.cssSelector("#customers tr:nth-child(7) td:nth-child(3)"));
    }
    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}

