package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static userinterfaces.UtesDatosAddress.*;

import java.util.List;

public class DatosAddress implements Task {

    private final List<UtestData> addressData;

    public DatosAddress(List<UtestData> addressData) {
        this.addressData = addressData;
    }

    public static DatosAddress theAddress(List<UtestData> addressData) {
        return Tasks.instrumented(DatosAddress.class, addressData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(addressData.get(0).getCity()).into(INPUT_CYTY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CYTY),
                Hit.the(Keys.ENTER).into(INPUT_CYTY),
                Enter.theValue(addressData.get(0).getPostalCode()).into(INPUT_POSTAL_CODE),
                Click.on(INPUT_COUNTRY),
                Enter.theValue(addressData.get(0).getCountry()).into(INPUT_COUNTRY_SELECT),
                Hit.the(Keys.ENTER).into(INPUT_COUNTRY_SELECT),
                Click.on(NEXT_DEVICES)
        );
    }
}
