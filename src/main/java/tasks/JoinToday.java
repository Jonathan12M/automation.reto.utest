package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.UtesJoinToday.JOIN_TODAY_BUTTON;


public class JoinToday implements Task {

    public static JoinToday withJoinButton() {
        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(JOIN_TODAY_BUTTON));
    }
}
