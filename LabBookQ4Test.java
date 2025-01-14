// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LabBookQ4Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void labBookQ4() {
    driver.get("https://demo.opencart.com/");
    assertThat(driver.getTitle(), is("Your Store"));
    driver.findElement(By.linkText("Desktops")).click();
    driver.findElement(By.linkText("Mac (1)")).click();
    driver.findElement(By.id("input-sort")).click();
    {
      WebElement dropdown = driver.findElement(By.id("input-sort"));
      dropdown.findElement(By.xpath("//option[. = 'Name (A - Z)']")).click();
    }
    {
      List<WebElement> elements = driver.findElements(By.linkText("iMac"));
      assert(elements.size() > 0);
    }
    js.executeScript("window.scrollTo(0,459.3333435058594)");
    driver.findElement(By.cssSelector(".button-group > button:nth-child(1)")).click();
    driver.findElement(By.name("search")).click();
    driver.findElement(By.name("search")).sendKeys("Monitors");
    driver.findElement(By.cssSelector(".fa-magnifying-glass")).click();
    driver.findElement(By.name("search")).click();
    driver.findElement(By.cssSelector(".btn-light")).click();
    driver.findElement(By.id("input-search")).click();
    driver.findElement(By.id("input-search")).sendKeys(" ");
    driver.findElement(By.id("input-description")).click();
    driver.findElement(By.id("button-search")).click();
  }
}
