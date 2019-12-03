package com.eheinen.strategy.simplestrategy;

import java.io.File;
import java.util.ArrayList;

public class ZipCompressionStrategy implements CompressionStrategy {

    public String compressFiles(ArrayList<File> files) {
        return "Compressed using ZIP";
    }

}