package de.bischinger.validation.model;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Alexander Bischof on 25.06.15.
 */
@XmlRootElement
@XmlAccessorType(FIELD)
public class MySubPojo {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
