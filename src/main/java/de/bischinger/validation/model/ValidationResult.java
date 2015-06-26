package de.bischinger.validation.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

/**
 * Created by Alexander Bischof on 25.06.15.
 */
@XmlRootElement
@XmlAccessorType(FIELD)
public class ValidationResult {
    @XmlElementWrapper(name="validationMessages")
    @XmlElement
    private List<String> validationMessage;

    public ValidationResult() {
    }

    public ValidationResult(List<String> validationMessage) {
        this.validationMessage = validationMessage;
    }

    public List<String> getValidationMessage() {
        return validationMessage;
    }

    public void setValidationMessage(List<String> validationMessage) {
        this.validationMessage = validationMessage;
    }
}
