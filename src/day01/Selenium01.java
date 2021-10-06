package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("suandaki url : "+driver.getCurrentUrl());
        System.out.println("su anki baslik : "+ driver.getTitle());
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().to("https://www.techproeducation.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);


        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        // driver.quit(); quit acik olan tum browser'lari kapatirken close sadece 1 browser kapatir


        driver.close();


    }
}
