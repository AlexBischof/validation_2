package de.bischinger.validation.business.strategy;

import de.bischinger.validation.business.strategy.Strategy;
import de.bischinger.validation.model.MyPojo;
import de.bischinger.validation.model.MySubPojo;
import de.bischinger.validation.model.SoftAssertions;
import de.bischinger.validation.model.ValidationResult;
import org.assertj.core.api.SoftAssertionError;

import java.util.List;

/**
 * Created by Alexander Bischof on 25.06.15.
 */
public class Key1bKey2Strategy2 implements Strategy {
    @Override
    public ValidationResult validate(MyPojo actual, MyPojo expected, long[] offset) {

        SoftAssertions softAssertions = new SoftAssertions();

        //Equals check
        softAssertions.assertThat(actual).hasSum1(expected.getSum1(),0);
        softAssertions.assertThat(actual).hasSum2(expected.getSum2(),0);

        List<MySubPojo> actualSubPojos = actual.getMySubPojoList();
        List<MySubPojo> expectedSubPojos = expected.getMySubPojoList();
        for (int i = 0; i < actualSubPojos.size(); i++) {

            MySubPojo actualSubPojo = actualSubPojos.get(i);
            MySubPojo expectedSubPojo = expectedSubPojos.get(i);

            //Equals check
            softAssertions.assertThat(actualSubPojo).hasText(expectedSubPojo.getText());
        }

        ValidationResult validationResult = new ValidationResult();
        try {
            softAssertions.assertAll();
        } catch (SoftAssertionError e) {
            validationResult.setValidationMessage(e.getErrors());
        }

        return validationResult;
    }
}
