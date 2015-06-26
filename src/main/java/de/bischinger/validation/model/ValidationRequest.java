package de.bischinger.validation.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

/**
 * Created by Alexander Bischof on 25.06.15.
 */
@XmlRootElement
@XmlAccessorType(FIELD)
public class ValidationRequest {
    private CompoundKey compoundKey;
    @XmlElement(name = "actual")
    private MyPojo actual;
    @XmlElement(name = "expected")
    private MyPojo expected;

    public CompoundKey getCompoundKey() {
        return compoundKey;
    }

    public MyPojo getActual() {
        return actual;
    }

    public MyPojo getExpected() {
        return expected;
    }
}
