package com.github.blurdn;

import com.github.blurdn.parser.MinecraftRatingRuParser;
import com.github.blurdn.parser.MonitoringParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        MonitoringParser parser = new MinecraftRatingRuParser();

        try {
            parser.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
