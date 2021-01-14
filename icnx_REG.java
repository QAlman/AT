
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;


import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;
import marvinplugins.MarvinPluginCollection;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import static org.junit.Assert.*;
import static org.openqa.selenium.Keys.CONTROL;
import static org.openqa.selenium.Keys.RETURN;

import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;



public class Procter_1_registration {

    long  start = System.currentTimeMillis();
    private WebDriver driver;
    private java.lang.String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();





    @Before
    public void setUp() throws Exception {

        start =  System.currentTimeMillis();
        driver = new ChromeDriver();
        baseUrl = "https://pgbonus.ru/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);




    }

    @Test
    public void testUntitledTestCase11() throws Exception {

        Random random = new Random();

        driver.get(baseUrl);


        int  i ;
        //String d= Date;
        int p = 1999;
        for (i =1; i < 10000; i++) {


            int min = 1212122;
            int max = 9999999;
            int diff = max - min;

            int iph = random.nextInt(diff + 1);
            iph+= min;

            LocalDateTime locdt = LocalDateTime.now();

            DateTimeFormatter f = DateTimeFormatter.ofPattern( "uuuu-MM-dd-HH-mm-ss" );
            String actuallyDate = locdt.format(f);



            driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/ul/li[8]/a")).click();
            TimeUnit.SECONDS.sleep(1);


            TimeUnit.SECONDS.sleep(1);

            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/form/div[6]/a")).click();
            TimeUnit.SECONDS.sleep(1);

            driver.findElement(By.id("registrationform-first_name")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("registrationform-first_name")).clear();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("registrationform-first_name")).sendKeys("QAtest");
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("registrationform-email")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("registrationform-email")).clear();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("registrationform-email")).sendKeys("test_name_"+actuallyDate+"@rt.tr");
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("registrationform-phone")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("registrationform-phone")).sendKeys("940"+iph);
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("password")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("password")).clear();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("password")).sendKeys("12345678qqQQ");
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("registrationform-aggr")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            TimeUnit.SECONDS.sleep(1);

            driver.findElement(By.xpath("//div[4]/img")).click();

            TimeUnit.SECONDS.sleep(1);

            driver.findElement(By.xpath("//div[4]/img")).click();
            TimeUnit.SECONDS.sleep(1);

            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("/html/body/app-root/div/app-png-hamburger-menu/div/div/ul/li[9]/a")).click();
            

            TimeUnit.SECONDS.sleep(1);
            System.out.println("# = "+""+ i);



        }





        TimeUnit.SECONDS.sleep(1);

        driver.close();


    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}




