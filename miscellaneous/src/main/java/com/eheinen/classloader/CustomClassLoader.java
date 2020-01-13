package com.eheinen.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

// Used as reference:
// https://github.com/eugenp/tutorials/tree/master/core-java-modules/core-java-jvm/src/main/java/com/baeldung/classloader

public class CustomClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) {
        byte[] classBytes = loadClassFromFile(name);

        return defineClass(name, classBytes, 0, classBytes.length);
    }

    private byte[] loadClassFromFile(String filename) {
        InputStream resourceAsStream =
            getClass().getClassLoader().getResourceAsStream(filename.replace('.', File.separatorChar) + ".class");

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            int nextValue;
            while((nextValue = Objects.requireNonNull(resourceAsStream).read()) != -1) {
                byteArrayOutputStream.write(nextValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return byteArrayOutputStream.toByteArray();
    }
}
