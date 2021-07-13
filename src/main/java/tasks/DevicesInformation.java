package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static userinterfaces.UtesDevicesInformation.*;

public class DevicesInformation implements Task {

    private final List<UtestData> deviceData;

    public DevicesInformation(List<UtestData> deviceData) {
        this.deviceData = deviceData;
    }

    public static DevicesInformation theDevices(List<UtestData> deviceData) {
        return Tasks.instrumented(DevicesInformation.class, deviceData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COMPUTER_OS),
                Enter.theValue(deviceData.get(0).getComputerOs()).into(INPUT_COMPUTER_OS),
                Hit.the(Keys.ENTER).into(INPUT_COMPUTER_OS),
                Click.on(COMPUTER_VERSION),
                Enter.theValue(deviceData.get(0).getComputerVersion()).into(INPUT_COMPUTER_VERSION),
                Hit.the(Keys.ENTER).into(INPUT_COMPUTER_VERSION),
                Click.on(COMPUTER_LANGUAGE),
                Enter.theValue(deviceData.get(0).getComputerLanguage()).into(INPUT_COMPUTER_LANGUAGE),
                Hit.the(Keys.ENTER).into(INPUT_COMPUTER_LANGUAGE),
                Click.on(MOBILE_BRAND),
                Enter.theValue(deviceData.get(0).getMobileBrand()).into(INPUT_MOBILE_BRAND),
                Hit.the(Keys.ENTER).into(INPUT_MOBILE_BRAND),
                Click.on(MOBILE_MODEL),
                Enter.theValue(deviceData.get(0).getMobileModel()).into(INPUT_MOBILE_MODEL),
                Hit.the(Keys.ENTER).into(INPUT_MOBILE_MODEL),
                Click.on(MOBILE_OS),
                Enter.theValue(deviceData.get(0).getMobileOs()).into(INPUT_MOBILE_OS),
                Hit.the(Keys.ENTER).into(INPUT_MOBILE_OS),
                Click.on(NEXT_LAST_STEP)
        );
    }
}
