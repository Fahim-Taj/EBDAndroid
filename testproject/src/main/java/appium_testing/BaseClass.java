package appium_testing;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class BaseClass
{
    static AppiumDriver driver;
    
    public static void setupDriver() throws MalformedURLException
    {
        DesiredCapabilities app = new DesiredCapabilities();
        app.setCapability("deviceName", "vivo Y93");
        app.setCapability("udid", "c0c6dee7");
        app.setCapability("platformName", "Android");
        app.setCapability("platformVersion", "8.1.0");
        app.setCapability("appPackage", "com.dol.ebidyaloy.debug");
        app.setCapability("appActivity", "com.dol.ebidyaloy.ui.MainActivity");
        
        URI uri = URI.create("http://0.0.0.0:4723/wd/hub");
        URL url = uri.toURL();
        driver = new AppiumDriver (url, app);

        System.out.println("Application Started");
    }
}