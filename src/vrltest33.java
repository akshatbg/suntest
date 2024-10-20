import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vrltest33 {
    public static void main(String[] args) throws Exception {

        ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost:61345/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement email = driver.findElement(By.xpath("//div[@class='form-group']//child::input"));
        email.sendKeys("admin1@a.com");

        WebElement password = driver.findElement(By.xpath("(//div[@class='form-group'])[2]//child::input[1]"));
        password.sendKeys("Admin@123");

        WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-info btn-block']"));
        button.click();

        Thread.sleep(4000);
        WebElement order = driver.findElement(By.xpath("//ul[@id='user-menu-items']//child::li[5]//child::a[2]"));
        order.click();

        WebElement order1 = driver.findElement(By.xpath("//div[@class='d-flex-container']//child::a"));
        order1.click();

        WebElement investigator = driver
                .findElement(By.xpath("//div[@class='panel-body']//child::div[2]//child::input"));
        investigator.sendKeys("A123");

        WebElement ponumber = driver.findElement(By.xpath("//div[@class='panel-body']//child::div[3]//child::input"));
        ponumber.sendKeys("A123");

        WebElement lab = driver.findElement(By.xpath("//div[@class='panel-body']//child::div[4]//child::textarea"));
        lab.sendKeys("lab123");

        WebElement test = driver.findElement(By.xpath("//span[@class='selection']//child::span//child::span"));
        test.click();

        WebElement selecttest = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
        selecttest.sendKeys("1054");
        Thread.sleep(1000);
        selecttest.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        WebElement addtest = driver.findElement(By.xpath("//button[@id='btnAddTest']"));
        addtest.click();
        Thread.sleep(3000);
        test.click();
        Thread.sleep(1000);
        selecttest.sendKeys("1089");
        Thread.sleep(1000);
        selecttest.sendKeys(Keys.ENTER);
        addtest.click();
        Thread.sleep(3000);

        WebElement addorder = driver
                .findElement(By.xpath("//button[@class='btn btn-secondary btn-rounded btn-sm my-0']"));
        addorder.click();
        Thread.sleep(1000);

        addorder.click();
        addorder.click();
        addorder.click();
        addorder.click();
        addorder.click();
        addorder.click();
        addorder.click();
        addorder.click();

        for (int q = 1; q <= 18; q += 2) {
            WebElement speciess = driver.findElement(By.xpath("(//div[@class='filter-option-inner'])[" + q + "]//div"));
            speciess.click();

            int r = q;
            // WebElement addspeciess = driver
            // .findElement(By.xpath("(//div[@class='dropdown-menu open']//div//input)[" + r
            // + "]"));

            WebElement addspeciess = driver
                    .findElement(By.xpath("(//div[@class='dropdown-menu open']//div//input)[" + r + "]//following::a["
                            + ((r / 2) + 1) + "]//child::span"));

            addspeciess.click();
            Thread.sleep(1000);
        }

        for (int p = 1; p <= 9; p++) {
            // Use i-1 for zero-based indexing in the XPath
            WebElement specimenid = driver.findElement(By.xpath("(//td[@class='pt-1-half'][2]//input)[" + p + "]"));
            specimenid.sendKeys("specimenid" + p);
        }
        for (int i = 1; i <= 9; i++) {
            // Use i-1 for zero-based indexing in the XPath
            WebElement room = driver.findElement(By.xpath("(//td[@class='pt-1-half'][3]//input)[" + i + "]"));
            room.sendKeys("Room" + i);
        }

        for (int j = 1; j <= 9; j++) {
            // Use i-1 for zero-based indexing in the XPath
            WebElement rack = driver.findElement(By.xpath("(//td[@class='pt-1-half'][4]//input)[" + j + "]"));
            rack.sendKeys("Rack" + j);
        }

        for (int k = 1; k <= 9; k++) {
            // Use i-1 for zero-based indexing in the XPath
            WebElement Barrier = driver.findElement(By.xpath("(//td[@class='pt-1-half'][5]//input)[" + k + "]"));
            Barrier.sendKeys("Barrier" + k);
        }

        for (int l = 1; l <= 9; l++) {
            // Use i-1 for zero-based indexing in the XPath
            WebElement Building = driver.findElement(By.xpath("(//td[@class='pt-1-half'][6]//input)[" + l + "]"));
            Building.sendKeys("Building" + l);
        }

        for (int m = 1; m <= 9; m++) {
            // Use i-1 for zero-based indexing in the XPath
            WebElement strain = driver.findElement(By.xpath("(//td[@class='pt-1-half'][7]//input)[" + m + "]"));
            strain.sendKeys("strain" + m);
        }

        for (int n = 1; n <= 9; n++) {
            // Use i-1 for zero-based indexing in the XPath
            WebElement sex = driver.findElement(By.xpath("(//td[@class='pt-1-half'][8]//input)[" + n + "]"));
            sex.sendKeys("sex" + n);
        }

        for (int o = 1; o <= 9; o++) {
            // Use i-1 for zero-based indexing in the XPath
            WebElement age = driver.findElement(By.xpath("(//td[@class='pt-1-half'][9]//input)[" + o + "]"));
            age.sendKeys("age" + o);
        }

        WebElement submitorder = driver.findElement(By.xpath("//i[@class='fas fa-save ']"));
        submitorder.click();
        Thread.sleep(23000);
        WebElement okbutton = driver.findElement(By.xpath("//div[@class='jconfirm-buttons']//button"));
        okbutton.click();

        WebElement label = driver.findElement(By.xpath("(//div[@class='d-flex-container'])[3]//button[3]//i"));
        label.click();

        WebElement labelsize = driver.findElement(By.xpath("//span[@class='selection']//span//child::span"));
        labelsize.click();

        WebElement labelsizeselection = driver
                .findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input"));
        labelsizeselection.sendKeys("5160");
        labelsizeselection.sendKeys(Keys.ENTER);

        WebElement export = driver.findElement(By.xpath("//div[@class='model-footer-btn']//button"));
        export.click();
        Thread.sleep(5000);

        WebElement reqdownload = driver.findElement(By.xpath("(//div[@class='d-flex-container'])[3]//button[2]//i"));
        reqdownload.click();
        Thread.sleep(5000);

        WebElement req = driver.findElement(By.xpath("(//div[@class='d-flex-container'])[3]//button//i"));
        req.click();
    }
}
