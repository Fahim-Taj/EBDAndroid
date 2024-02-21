package appium_testing;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;


public class testapp {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected AppiumDriver driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability("udid", "c0c6dee7");
        dc.setCapability("appPackage", "com.dol.ebidyaloy.debug");
        dc.setCapability("appActivity", "com.dol.ebidyaloy.ui.MainActivity");
        
        URI uri = URI.create("http://0.0.0.0:4723/wd/hub");
        URL url = uri.toURL();
        driver = new AppiumDriver (url, dc);
    }
    public void testUntitled() throws InterruptedException
     {
        driver.findElement(By.xpath("//*[@id='us_select_option']")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();

        driver.findElement(AppiumBy.accessibilityId("Swipe")).click();
        Thread.sleep(4000);
        scroll("RIGHT", 0.5);
        Thread.sleep(2000);
        scroll("RIGHT", 0.5);
        Thread.sleep(2000);
        scroll("RIGHT", 0.5);
        
        
        
        // new TouchAction(driver)
        //         .press(Point.optionallyCovering(513, 1081))
        //         .waitAction(Duration.ofMillis(288))
        //         .moveTo(Point.optionallyCovering(-31, 1075))
        //         .release()
        //         .perform();

        // new TouchAction(driver)
        //         .press(Point.optionallyCovering(631, 1090))
        //         .waitAction(Duration.ofMillis(457))
        //         .moveTo(Point.optionallyCovering(-243, 1075))
        //         .release()
        //         .perform();

        // new TouchAction(driver)
        //         .press(Point.optionallyCovering(581, 1070))
        //         .waitAction(Duration.ofMillis(600))
        //         .moveTo(Point.optionallyCovering(93, 1065))
        //         .release()
        //         .perform();
        
        
        // new TouchAction(driver).press(513, 1081).waitAction(Duration.ofMillis(288)).moveTo(-31, 1075).release().perform();
        // new TouchAction(driver).press(631, 1090).waitAction(Duration.ofMillis(457)).moveTo(-243, 1075).release().perform();
        // new TouchAction(driver).press(581, 1070).waitAction(Duration.ofMillis(600)).moveTo(93, 1065).release().perform();
        
        WebDriverWait btn0 = new WebDriverWait(driver, Duration.ofSeconds(10));
        btn0.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Login']")));
        driver.findElement(By.xpath("//*[@text='Login']")).click();
        driver.findElement(By.xpath("//*[@id='edittext_phone']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='0']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='1']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='7']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='3']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='3']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='0']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='7']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='7']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='8']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='3']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='1']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='Done']")).click();
        driver.findElement(By.xpath("//*[@id='edittext_password']")).click();
        
        WebDriverWait btn1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        btn1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='输入法键盘的数字6']")));
        driver.findElement(By.xpath("//*[@text='输入法键盘的数字6']")).click();

        WebDriverWait btn2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        btn2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='输入法键盘的数字9']")));
        driver.findElement(By.xpath("//*[@text='输入法键盘的数字9']")).click();
        driver.findElement(By.xpath("//*[@text='输入法键盘的小写字母w']")).click();

        WebDriverWait btn3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        btn3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Sign in with Google or Facebook']")));
        driver.findElement(By.xpath("//*[@text='Sign in with Google or Facebook']")).click();
        driver.findElement(By.xpath("//*[@text='Sign in with Google or Facebook']")).click();
        driver.findElement(By.xpath("//*[@text='Don’t have an account?']")).click();
        driver.findElement(By.xpath("//*[@text='Don’t have an account?']")).click();
    }
    private void scroll(String string, double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'scroll'");
    }
    public void tearDown() {
        driver.quit();
    }
}
