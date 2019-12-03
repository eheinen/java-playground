package com.eheinen.string;

public class AmbiguousMethod {

    public static void main(String[] args) {
        // Ambiguous method call. Both foo match the call
        // new MainString().foo(null);
    }

    public void foo(String s) {
        System.out.println("String");
    }

    public void foo(StringBuffer s) {
        System.out.println("StringBuffer");
    }

}


