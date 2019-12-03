package com.eheinen.string;

public class Equality {

    public static void main(String[] args) {
        Equality eq = new Equality();

        eq.doubleEqualsOperator();
        eq.equalityWithStringBuffer();
        eq.internMethod();
    }

    /**
     * Result will be false, because there are 2 objects with same value but different reference to the object in memory.
     * And the equality ==, compares value + reference
     */
    public void doubleEqualsOperator() {
        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1 == s2);
    }

    /**
     * Result will be false, because equals check equality of value and type.
     */
    public void equalityWithStringBuffer() {
        String s1 = "abc";
        StringBuffer s2 = new StringBuffer(s1);

        System.out.println(s1.equals(s2));
    }

    /**
     * Intern get the canonical representation for the String object.
     * When s1 and s2 are compared, both has the same value and same representation of the object.
     */
    public void internMethod() {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = new String("abc");

        s2 = s2.intern();

        System.out.println("s1 + s2 = " + (s1 == s2) + " | s1 + s3 = " + (s1 == s3));
    }

}
