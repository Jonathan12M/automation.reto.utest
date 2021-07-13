package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static userinterfaces.UtesBasicUserInformation.*;

public class BasicUserInformation implements Task {

    private final List<UtestData> personalData;

    public BasicUserInformation(List<UtestData> personalData) {
        this.personalData = personalData;
    }

    public static BasicUserInformation thePerson(List<UtestData> personalData) {
        return Tasks.instrumented(BasicUserInformation.class, personalData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(personalData.get(0).getFirstName()).into(INPUT_FIST_NAME),
                Enter.theValue(personalData.get(0).getLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(personalData.get(0).getEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(personalData.get(0).getMonthBirth()).from(INPUT_MONTH_BIRTH),
                SelectFromOptions.byVisibleText(personalData.get(0).getDayBirth()).from(INPUT_DAY_BIRTH),
                SelectFromOptions.byVisibleText(personalData.get(0).getYearBirth()).from(INPUT_YEAR_BIRTH),
                Enter.theValue(personalData.get(0).getLanguageSpoken()).into(INPUT_LANGUAGE_SPOKEN),
                Click.on(NEXT_LOCATION)
        );
    }
}
