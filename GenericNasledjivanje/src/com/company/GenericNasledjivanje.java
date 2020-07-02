package com.company;

public class GenericNasledjivanje<T extends A> {
    private T objReff;

    public GenericNasledjivanje() {
    }

    public GenericNasledjivanje(T objReff) {
        this.objReff = objReff;
    }
    public void doRunTest(){
        this.objReff.printClass();
    }
}
