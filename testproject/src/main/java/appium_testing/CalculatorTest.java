package appium_testing;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorTest
{
    static AppiumDriver driver;

    public static void main(String[] args) throws MalformedURLException
    {
        openCalculator();
        // try{
        //     openCalculator();
        //    }
        // catch(Exception exp){
        //     System.out.println(exp.getCause());
        //     System.out.println(exp.getMessage());
        //     exp.printStackTrace();
        // }
        
    }

    public static void openCalculator() throws MalformedURLException
    {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "vivo Y93");
        cap.setCapability("udid", "c0c6dee7");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "8.1.0");
        cap.setCapability("appPackage", "com.google.android.calculator");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");

        URI uri = URI.create("http://0.0.0.0:4723/wd/hub");
        URL url = uri.toURL();
        driver = new AppiumDriver (url, cap);

        System.out.println("Application Started");
        
        WebDriverWait two = new WebDriverWait(driver, Duration.ofSeconds(30));
        two.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.calculator:id/digit_2"))).click();
        System.out.println("Click on the Number 2");

        WebDriverWait plus = new WebDriverWait(driver, Duration.ofSeconds(30));
        plus.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.calculator:id/op_add"))).click();
        System.out.println("Click on the Plus");

        WebDriverWait three = new WebDriverWait(driver, Duration.ofSeconds(30));
        three.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.calculator:id/digit_3"))).click();
        System.out.println("Click on the Number 3");

        WebDriverWait equals = new WebDriverWait(driver, Duration.ofSeconds(30));
        equals.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.calculator:id/eq"))).click();
        System.out.println("Click on the Equal");

        WebDriverWait result = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = result.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.calculator:id/result_final")));
        String text = element.getText();       
        System.out.println("\nResult is : " + text);

        System.out.println("Completed");
    }
}
