package com.qacart.base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public static Properties pros=new Properties();

    public Base() {

            File file=new File("src/test/java/properties/config.properties");
        FileInputStream fis= null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            pros.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void LaunchBrowser() {

        if (pros.getProperty("browser").equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver =new ChromeDriver(options);
        } else if (pros.getProperty("browser").equalsIgnoreCase("edgedriver")) {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }else {
            throw new Error("Browser not supported");
        }

        driver.manage().window().maximize();
        driver.get(pros.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);


    }
}
