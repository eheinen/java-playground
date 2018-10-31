package com.designpatterns.strategy.simplestrategy;

import java.io.File;
import java.util.ArrayList;

public class CompressionContext implements CompressionStrategy {

    private CompressionStrategy strategy;

    // Using this approach may throw a NullPointerException
    // Good to define the strategy at Runtime
    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String compressFiles(ArrayList<File> files) {
        return strategy.compressFiles(files);
    }
}