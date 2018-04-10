import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;


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
        driver.findElement(By.xpath("//html//div[@class='clearfix body-header-row-top']//li[2]")).click();
        Assert.assertTrue((driver.findElement(By.xpath("//td[@class='rz-credit-terms-td rz-credit-terms-td-period'][contains(text(),'15')]")).getText().contains("15"))
                && (driver.findElement(By.xpath("//html//div[3]/table[1]/tbody[1]/tr[6]/td[3]")).getText().contains("0,01"))
                    && (driver.findElement(By.xpath("//html//div[3]/table[1]/tbody[1]/tr[6]/td[4]")).getText().contains("2,5"))
                        && (driver.findElement(By.xpath("//html//div[3]/table[1]/tbody[1]/tr[6]/td[5]")).getText().contains("-"))
                            && (driver.findElement(By.xpath("//html//div[3]/table[1]/tbody[1]/tr[6]/td[6]")).getText().contains("от 0")));
//        int index = 0;
//        WebElement baseTable = driver.findElement(By.className("rz-credit-terms-table"));
//        WebElement tableRow = driver.findElement(By.xpath("//html//div[3]/table[1]/tbody[1]/tr[6]"));
//        List

    }
}
