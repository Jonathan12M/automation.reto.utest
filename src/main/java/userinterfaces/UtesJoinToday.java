package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtesJoinToday {

    public static final Target JOIN_TODAY_BUTTON = Target.the("Button that takes us to the registration page")
        .located(By.className("unauthenticated-nav-bar__sign-up"));
}
