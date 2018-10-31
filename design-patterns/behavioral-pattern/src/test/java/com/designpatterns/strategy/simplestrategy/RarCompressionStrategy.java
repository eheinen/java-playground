package com.designpatterns.strategy.simplestrategy;

import java.io.File;
import java.util.ArrayList;

public class RarCompressionStrategy implements CompressionStrategy {

    public String compressFiles(ArrayList<File> files) {
        return "Compressed using RAR";
    }

}