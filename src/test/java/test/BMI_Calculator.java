package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BMI_Calculator {

    WebDriver driver;

    @Test
    public void testBmiCalculator() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("40");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("140");
        driver.findElement(By.xpath("//input[@name='cc']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@name='desc']"));
        String value = element.getAttribute("value");
        Assert.assertEquals(value, "Your category is Normal");
        driver.quit();
    }

    @Test
    public void testBmiCalculatorSecond() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("99");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("199");
        driver.findElement(By.xpath("//input[@name='cc']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@name='desc']"));
        String value = element.getAttribute("value");
        Assert.assertEquals(value, "Your category is Normal");
        driver.quit();
    }

    @Test
    public void testBmiCalculatorThird() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("151");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("250");
        driver.findElement(By.xpath("//input[@name='cc']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@name='desc']"));
        String value = element.getAttribute("value");
        Assert.assertEquals(value, "Your category is Normal");
        driver.quit();
    }

    @Test
    public void testBmiCalculatorPounds() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//option[@value='pounds']")).click();
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("99");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("140");
        driver.findElement(By.xpath("//input[@name='cc']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@name='desc']"));
        String value = element.getAttribute("value");
        Assert.assertEquals(value, "Your category is Normal");
        driver.quit();
    }

    @Test
    public void testBmiCalculatorPoundsSecond() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//option[@value='pounds']")).click();
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("218");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("199");
        driver.findElement(By.xpath("//input[@name='cc']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@name='desc']"));
        String value = element.getAttribute("value");
        Assert.assertEquals(value, "Your category is Normal");
        driver.quit();
    }

    @Test
    public void testBmiCalculatorPoundsThird() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//option[@value='pounds']")).click();
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("332");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("250");
        driver.findElement(By.xpath("//input[@name='cc']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@name='desc']"));
        String value = element.getAttribute("value");
        Assert.assertEquals(value, "Your category is Normal");
        driver.quit();
    }

    //for pull request



}
