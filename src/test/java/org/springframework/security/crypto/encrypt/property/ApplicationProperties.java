package org.springframework.security.crypto.encrypt.property;

import org.springframework.beans.factory.annotation.Value;

public class ApplicationProperties {

    @Value("${name1}")
    private String value1;

    @Value("${name2}")
    private String value2;

    @Value("${name3}")
    private String value3;

    @Value("${name4}")
    private String value4;

    @Value("${name5}")
    private String value5;

    @Value("${name6}")
    private String value6;

    @Value("${name7}")
    private String value7;

    @Value("${name8}")
    private String value8;

    @Value("${name9}")
    private String value9;


    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getValue4() {
        return value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }

    public String getValue5() {
        return value5;
    }

    public void setValue5(String value5) {
        this.value5 = value5;
    }

    public String getValue6() {
        return value6;
    }

    public void setValue6(String value6) {
        this.value6 = value6;
    }

    public String getValue7() {
        return value7;
    }

    public void setValue7(String value7) {
        this.value7 = value7;
    }

    public String getValue8() {
        return value8;
    }

    public void setValue8(String value8) {
        this.value8 = value8;
    }

    public String getValue9() {
        return value9;
    }

    public void setValue9(String value9) {
        this.value9 = value9;
    }
}
