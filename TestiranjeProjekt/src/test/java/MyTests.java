import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTests {
    //-----------------------------------Global Variables-----------------------------------
    //Declare a Webdriver variable
    public WebDriver driver;
    //Declare a test URL variable
    public String testURL = "https://www.ebay.com";
    //-----------------------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        //Create a new ChromeDriver
        driver = new ChromeDriver();
        //Go to www.swtestacademy.com
        driver.navigate().to(testURL);
    }
    @Test
    public void searchTerm() throws InterruptedException {
        //driver.manage().window().maximize();
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        searchField.sendKeys("xiaomi pocophone f1");
        searchField.submit();
        Thread.sleep(3000);
    }
    @Test
    public void findAppleTablet() throws InterruptedException {
        WebElement categoryMenu = driver.findElement(By.xpath("//*[@id=\"gh-shop-a\"]"));
        categoryMenu.click();
        Thread.sleep(500);
        WebElement computerTablets = driver.findElement(By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/ul[2]/li[1]/a"));
        computerTablets.click();
        Thread.sleep(3000);
        WebElement eReaders = driver.findElement(By.xpath("//*[@id=\"w1-w0\"]/ul/li[20]/a"));
        eReaders.click();
        Thread.sleep(3000);
        WebElement apple = driver.findElement(By.xpath("//*[@id=\"w5-xCarousel-x-carousel-items\"]/ul/li[1]/a/div/img"));
        apple.click();
        Thread.sleep(3000);

    }
    @Test
    public void checkHotPicks() throws InterruptedException {
        WebElement dailyDeals = driver.findElement(By.xpath("//*[@id=\"gh-p-1\"]/a"));
        dailyDeals.click();
        Thread.sleep(2000);
        WebElement fashionCategory = driver.findElement(By.xpath("//*[@id=\"s3\"]/div/map/area"));
        fashionCategory.click();
        Thread.sleep(3000);
    }
    @Test
    public void loginTest() throws InterruptedException {
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a"));
        signIn.click();
        Thread.sleep(1500);
        WebElement userLabel = driver.findElement(By.xpath("//*[@id=\"userid\"]"));
        userLabel.click();
        userLabel.sendKeys("o8120429@nwytg.net");

        WebElement passwordLabel = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        passwordLabel.click();
        passwordLabel.sendKeys("abcd1234abcd");
        passwordLabel.submit();
        Thread.sleep(3000);
    }
    @Test
    public void helpWithRefund() throws InterruptedException {

        WebElement helpAndContact = driver.findElement(By.xpath("//*[@id=\"gh-p-3\"]/a"));
        helpAndContact.click();
        Thread.sleep(2000);
        WebElement refunds = driver.findElement(By.xpath("//*[@id=\"returns-refunds\"]/span/span[1]"));
        refunds.click();
        Thread.sleep(1500);
        WebElement returningItems = driver.findElement(By.xpath("//*[@id=\"anchor\"]/ul/li[2]/a"));
        returningItems.click();
        Thread.sleep(1500);
        WebElement returnsArticle = driver.findElement(By.xpath("//*[@id=\"returning-item-purchased\"]/ul/li[1]/a/div"));
        returnsArticle.click();
        Thread.sleep(3000);
    }

    //-----------------------------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest() {
        //Close browser and end the session
        driver.quit();
    }
}
