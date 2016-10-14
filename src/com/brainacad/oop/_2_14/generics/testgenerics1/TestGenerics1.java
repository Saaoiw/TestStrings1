package com.brainacad.oop._2_14.generics.testgenerics1;

/**
 * Created by Fujitsu on 11.10.2016.
 */
public class TestGenerics1 <A, B, C> {
    private A object1;
    private B object2;
    private C object3;

    public TestGenerics1(A object1, B object2, C object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public A getObject1() {
        return object1;
    }

    public B getObject2() {
        return object2;
    }

    public C getObject3() {
        return object3;
    }
}
