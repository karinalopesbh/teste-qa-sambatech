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
public class ObrigatoriedadeCamposCadastroTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void obrigatoriedadeCamposCadastro() {
    driver.get("https://slide.sambaplay.tv/");
    driver.manage().window().setSize(new Dimension(841, 705));
    driver.findElement(By.linkText("Clique para começar")).click();
    driver.findElement(By.cssSelector("#user-not-logged > .material-icons")).click();
    driver.findElement(By.cssSelector(".cursor-pointer > b")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.id("registerName")).click();
    driver.findElement(By.id("registerEmail")).click();
    driver.findElement(By.cssSelector(".inputField:nth-child(3) > label")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".input-full"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".input-full"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".input-full"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".input-full")).click();
    driver.findElement(By.cssSelector(".input-full")).click();
    assertThat(driver.findElement(By.cssSelector(".input-full > .invalidInput")).getText(), is("Campo obrigatório"));
  }
}
