package itcj.juanaranda.practica4;

import java.io.Serializable;

public class Form implements Serializable {

    private String fullName;
    private int age;
    private int controlNumber;

    public Form(String fullName, int age, int controlNumber) {
        setFullName(fullName);
        setAge(age);
        setControlNumber(controlNumber);
    }

    public int getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(int controlNumber) {
        this.controlNumber = controlNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
