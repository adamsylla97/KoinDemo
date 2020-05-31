package com.example.myapplication;

public class TestPresenterInJava {

    private Class1 c1;
    private Class2 c2;

    public TestPresenterInJava(Class1 c1, Class2 c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public String text() {
        return c1.abc() + c2.abc();
    }

}
