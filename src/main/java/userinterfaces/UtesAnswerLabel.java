package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtesAnswerLabel {
    public static final Target LAST_STEP_LABEL = Target.the("label to confirm form")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[1]/div/div/h1/span[2]"));
}
