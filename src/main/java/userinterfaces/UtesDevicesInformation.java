package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtesDevicesInformation {
    public static final Target COMPUTER_OS = Target.the("select computer os field")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_COMPUTER_OS = Target.the("Select your computer")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));
    public static final Target COMPUTER_VERSION = Target.the("select computer version field")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_COMPUTER_VERSION = Target.the("write computer version")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/input[1]"));
    public static final Target COMPUTER_LANGUAGE = Target.the("select computer language field")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_COMPUTER_LANGUAGE = Target.the("write computer language")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/input[1]"));
    public static final Target MOBILE_BRAND = Target.the("select mobile brand field")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILE_BRAND = Target.the("write mobile brand")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));
    public static final Target MOBILE_MODEL = Target.the("select mobile model field")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILE_MODEL = Target.the("write mobile model")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));
    public static final Target MOBILE_OS = Target.the("select mobile os field")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILE_OS = Target.the("write mobile os")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));

    public static final Target NEXT_LAST_STEP = Target.the("last step")
            .located(By.xpath("//a[@aria-label='Next - final step']"));
}
