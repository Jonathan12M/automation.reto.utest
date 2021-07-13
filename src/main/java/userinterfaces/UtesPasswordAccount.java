package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtesPasswordAccount {
    public static final Target INPUT_PASSWORD = Target.the("write password")
            .located(By.id("password"));
    public static final Target INPUT_PASSWORD_CONFIRMATION = Target.the("confirm passwrod")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_TERMS = Target.the("accept terms")
            .located(By.id("termOfUse"));
    public static final Target CHECKBOX_POLICY = Target.the("accept policy")
            .located(By.id("privacySetting"));

}
