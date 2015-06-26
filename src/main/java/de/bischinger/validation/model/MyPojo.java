package de.bischinger.validation.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

/**
 * Created by Alexander Bischof on 25.06.15.
 */
@XmlRootElement
@XmlAccessorType(FIELD)
public class MyPojo {
    private double sum1;
    private double sum2;

    @XmlElement
    private List<MySubPojo> mySubPojoList;

    public MyPojo() {
    }

    public MyPojo(int sum1, List<MySubPojo> mySubPojoList) {
        this.sum1 = sum1;
        this.mySubPojoList = mySubPojoList;
    }

    public double getSum1() {
        return sum1;
    }

    public void setSum1(double sum1) {
        this.sum1 = sum1;
    }

    public double getSum2() {
        return sum2;
    }

    public void setSum2(double sum2) {
        this.sum2 = sum2;
    }

    public List<MySubPojo> getMySubPojoList() {
        return mySubPojoList;
    }

    public void setMySubPojoList(List<MySubPojo> mySubPojoList) {
        this.mySubPojoList = mySubPojoList;
    }
}
