package Maven;
import com.sun.tools.javac.code.Types;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium1 {
    public void verifyPageTitle() {
        // path of the driver (chrome)
        System.setProperty("webdriver.chrome.driver", "C://Users//farha//Downloads//chromedriver_win32.zip/chromedriver");      // Mac
        // System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");   // Windows

        WebDriver driver = new ChromeDriver();


        String url = "https://www.facebook.com/";
        driver.get(url);
        // OR
        // driver.navigate().to(url);

    }
}
