package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterfaces.UtesPasswordAccount.*;

public class PasswordAccount implements Task {

    private final List<UtestData> privateData;

    public PasswordAccount(List<UtestData> privateData) {
        this.privateData = privateData;
    }

    public static PasswordAccount thePassword(List<UtestData> privateData) {
        return Tasks.instrumented(PasswordAccount.class, privateData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_PASSWORD),
                Enter.theValue(privateData.get(0).getPassword()).into(INPUT_PASSWORD),
                Click.on(INPUT_PASSWORD_CONFIRMATION),
                Enter.theValue(privateData.get(0).getPassword()).into(INPUT_PASSWORD_CONFIRMATION),
                Click.on(CHECKBOX_TERMS),
                Click.on(CHECKBOX_POLICY)
        );
    }
}
