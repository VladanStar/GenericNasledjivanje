package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        GenericNasledjivanje <C> bec = new GenericNasledjivanje<C>(new C());
        bec.doRunTest();
        GenericNasledjivanje<B> beb = new GenericNasledjivanje<B>(new B());
        beb.doRunTest();
        GenericNasledjivanje<A> bea = new GenericNasledjivanje<A>(new A());
        bea.doRunTest();
    }
}
