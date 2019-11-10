import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.ChromeDriver.driver", "ChromeDriver.exe");

        WebDriver driver = new ChromeDriver(); //tworzymy nowy obiekt

        driver.get("http://demo.testarena.pl/zaloguj"); // na stronie internetowej bedziemy sprawdzac dane do logowania czy sie zgadzaja

        driver.findElement(By.id("email")).sendKeys("administrator@testarena.pl"); //login do strony

        driver.findElement(By.id("password")).sendKeys("sumXQQ72$L"); //haslo do strony

        driver.findElement(By.id("login")).click(); //funkcja click klika button login

        System.out.println("Poprawne logowanie"); // jesli zaloguje poprawnie to wypisuje ze poprawne logowanie

        driver.quit();
    }
}