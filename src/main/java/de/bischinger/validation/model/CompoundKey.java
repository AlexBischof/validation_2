package de.bischinger.validation.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

/**
 * Created by Alexander Bischof on 25.06.15.
 */
@XmlRootElement
@XmlAccessorType(FIELD)
public class CompoundKey {
    private String key1;
    private String key2;

    public CompoundKey() {
    }

    public CompoundKey(String key1) {
        this.key1 = key1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompoundKey that = (CompoundKey) o;

        if (key1 != null ? !key1.equals(that.key1) : that.key1 != null) return false;
        if (key2 != null ? !key2.equals(that.key2) : that.key2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = key1 != null ? key1.hashCode() : 0;
        result = 31 * result + (key2 != null ? key2.hashCode() : 0);
        return result;
    }

    @Override public String toString() {
        return "CompoundKey{" +
               "key1='" + key1 + '\'' +
               ", key2='" + key2 + '\'' +
               '}';
    }
}
