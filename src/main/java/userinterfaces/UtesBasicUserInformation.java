package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtesBasicUserInformation {
    public static final Target INPUT_FIST_NAME = Target.the("Write fist name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Write last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Write email")
            .located(By.id("email"));
    public static final Target INPUT_MONTH_BIRTH = Target.the("Select month birth")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY_BIRTH = Target.the("Select day birth")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR_BIRTH = Target.the("Select year birth")
            .located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGE_SPOKEN = Target.the("Write language name")
            .located(By.xpath("//*[@id='languages']/div[1]/input"));
    public static final Target NEXT_LOCATION = Target.the("Next Location")
            .located(By.xpath("//a[@aria-label='Next step - define your location']"));
}