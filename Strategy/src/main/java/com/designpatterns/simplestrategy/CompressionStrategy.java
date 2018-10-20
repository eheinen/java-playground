package com.designpatterns.simplestrategy;

import java.io.File;
import java.util.ArrayList;

public interface CompressionStrategy {

    String compressFiles(ArrayList<File> files);

}