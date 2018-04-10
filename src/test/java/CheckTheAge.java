import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTheAge extends BeforeAfter {
    @Test
    public void alfaBankAge() throws InterruptedException {
        driver.findElement(By.xpath("//html//div[@class='clearfix body-header-row-top']//li[2]")).click();
        WebElement element = driver.findElement(By.xpath("//td[@class='rz-credit-terms-td rz-credit-terms-td-age'][contains(text(),'21-70')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertTrue(driver.findElement(By.xpath("//td[@class='rz-credit-terms-td rz-credit-terms-td-age'][contains(text(),'21-70')]")).getText().contains("21-70"));

    }
}
