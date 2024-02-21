package appium_testing;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class EBDAndroid extends BaseClass
{   
    public static void main(String[] args) throws MalformedURLException, InterruptedException
    {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter reporter = new ExtentSparkReporter("ExtentReport.html");
        extent.attachReporter(reporter);
        
        ExtentTest test = extent.createTest("EBDAndroid", "Login to the Application");
        
        test.log(Status.INFO, "Starting Test Case");
        setupDriver();
        test.pass("Open the Application");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonID.Eng_Language_Select))).click();
        System.out.println("Select the language in English");
        test.pass("Language Switch to English");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonID.Done_Button))).click();
        System.out.println("Click on the Done Button");
        test.pass("Language Selected English");
        
        // WebElement frstswipe = driver.findElement(By.xpath(CommonPaths.Screen_Swipe));
        // Swipe.performSwipe(driver, frstswipe, 0.8, 0.2, 100);
        // System.out.println("Swipe the 1st Screen");

        // WebElement scndswipe = driver.findElement(By.xpath(CommonPaths.Screen_Swipe));
        // Swipe.performSwipe(driver, scndswipe, 0.8, 0.2, 100);
        // System.out.println("Swipe the 2nd Screen");

        // WebElement trdswipe = driver.findElement(By.xpath(CommonPaths.Screen_Swipe));
        // Swipe.performSwipe(driver, trdswipe, 0.8, 0.2, 100);
        // System.out.println("Swipe the 3rd Screen");

        for (int i = 0; i < 3; i++)
        {
            WebElement swipeElement = driver.findElement(By.xpath(CommonPaths.Screen_Swipe));
            Swipe.performSwipe(driver, swipeElement, 0.8, 0.2, 100);
            System.out.println("Screen No " + (i + 1) + " is swiped");
        }
        test.pass("Apps Swipes the login info screens");

        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonPaths.Skip_Button))).click();
        // System.out.println("Click on the Skip Button");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonID.Login_Select))).click();
        System.out.println("Click on the Login Button");
        test.pass("Click on the Login Button");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonID.PNumber_Input))).sendKeys("01733077831");
        System.out.println("Input the Mobile number");
        test.pass("Input the Mobile number");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonID.Password_Input))).sendKeys("87654321");
        System.out.println("Input the Password");
        test.pass("Input the Password");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonID.Password_View))).click();
        System.out.println("Click on the Eye icon to view Password");
        test.pass("Click on the Eye icon to view Password");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonID.RememberMe_Check))).click();
        System.out.println("Click on the Remember Me Checkbox");
        test.pass("Click on the Remember Me Checkbox");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonID.Login_Button))).click();
        System.out.println("Click on the Login Button");
        System.out.println("Login Confirmed");
        test.pass("Login Confirmed");

        test.info("Test Completed");

        extent.flush();


        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonID.Expand_Menu))).click();
        // System.out.println("Expand the Home Menu");

        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CommonPaths.Collaps_Menu))).click();
        // System.out.println("Collapsed the Home Menu");

        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonID.Add_Student))).click();
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonID.Name_Student))).sendKeys("Mr. Student 01");
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonID.Email_Student))).sendKeys("email@email.com");
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonID.Phone_Student))).sendKeys("125112334");

        // System.exit(0);
    }  
}
