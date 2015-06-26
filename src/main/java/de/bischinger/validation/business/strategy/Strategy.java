package de.bischinger.validation.business.strategy;

import de.bischinger.validation.model.MyPojo;
import de.bischinger.validation.model.ValidationResult;

/**
 * Created by Alexander Bischof on 25.06.15.
 */
@FunctionalInterface
public interface Strategy {
    //TODO offsets??
    ValidationResult validate(MyPojo actual, MyPojo expected, long[] offset);
}
