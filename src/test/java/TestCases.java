import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCases {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new EdgeDriver();
        driver.manage().window().maximize();
       // driver.get("https://duckduckgo.com/");
        /*
        driver.navigate().to("https://duckduckgo.com/");
        WebElement searchBox = driver.findElement(By.id("searchbox_input"));
        searchBox.sendKeys("Mohamed Salah");
        WebElement seeButton = driver.findElement(By.xpath("(//div /button)[4]"));
        seeButton.click();
        WebElement learnMore = driver.findElement(By.linkText("Learn more"));
        learnMore.click();
        WebElement searchIcon = driver.findElement(By.xpath("//button[@type='submit']"));
        searchIcon.click();
        */
        driver.get("https://the-internet.herokuapp.com/abtest");
        
        WebElement checkBox1 = driver.findElement(By.xpath("(//form /input)[1]"));
        System.out.println(checkBox1.isSelected());
        checkBox1.click();
        System.out.println(checkBox1.isSelected());


        WebElement paragraph = driver.findElement(By.xpath("//div[@id='content'] /div[@class='example'] /p"));
        System.out.println(paragraph.getText());
        

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
//Close >> 2 tabs > current tab
//quit >> all tabs