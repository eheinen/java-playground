package com.eheinen.classloader;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CustomClassLoaderTest {

    @Test
    public void should_use_custom_class_loader_successfully()
        throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        CustomClassLoader customClassLoader = new CustomClassLoader();
        Class<?> printClassLoaded = customClassLoader.findClass(PrintClassLoader.class.getName());

        Object printClassInstance = printClassLoaded.getDeclaredConstructor().newInstance();

        Method printClassLoadersMethod = printClassLoaded.getMethod("printClassLoaders");
        printClassLoadersMethod.invoke(printClassInstance);
    }
}
