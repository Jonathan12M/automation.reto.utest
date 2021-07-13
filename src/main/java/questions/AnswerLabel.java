package questions;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static userinterfaces.UtesAnswerLabel.LAST_STEP_LABEL;

public class AnswerLabel implements Question<Boolean> {

    private final List<UtestData> lastStepLabel;

    public AnswerLabel(List<UtestData> lastStepLabel) {
        this.lastStepLabel = lastStepLabel;
    }

    public static AnswerLabel toThe(List<UtestData> lastStepLabel) {
        return new AnswerLabel(lastStepLabel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String labelConfirm = Text.of(LAST_STEP_LABEL).viewedBy(actor).asString();
        return lastStepLabel.get(0).getLastStepLabel().equals(labelConfirm);
    }
}
