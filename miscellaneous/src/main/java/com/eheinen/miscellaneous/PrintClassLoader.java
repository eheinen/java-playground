package com.eheinen.miscellaneous;

import java.util.ArrayList;
import java.util.logging.Logger;

public class PrintClassLoader {

    public void printClassLoaders() {
        System.out.println("Classloader of this class:" + PrintClassLoader.class.getClassLoader());
        System.out.println("Classloader of Logger:" + Logger.class.getClassLoader());
        System.out.println("Classloader of ArrayList:" + ArrayList.class.getClassLoader());
    }
}
