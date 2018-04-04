import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CreditElements extends BeforeAfter {

    @Test
    public void creditPageElements() throws InterruptedException {
        driver.findElement(By.xpath("//html//div[@class='clearfix body-header-row-top']//li[2]")).click();
        Assert.assertTrue(driver.findElements(By.xpath("//div[@class='credit-rules-list-i']")).size()==4);
        //Assert.assertEquals(driver.findElements(By.xpath("//div[@class='credit-rules-list-i']")).size(),4);
    }
    @Test
    public void creditTableTitle() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Условия кредитования')]")).getText().contains("Условия кредитования"));
    }
    @Test
    public void creditTableData() throws InterruptedException {

    }
}
