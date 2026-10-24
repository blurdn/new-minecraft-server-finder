package com.github.blurdn.parser;

import com.github.blurdn.model.MinecraftServer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;

public class MinecraftRatingRuParser implements MonitoringParser{
    private static final String SOURCE_NAME = "Minecraft Rating";
    public static final  String SOURCE_URL = "https://minecraftrating.ru/new-servers/";
    public static final  String LANGUAGE = "ru";

    @Override
    public List<MinecraftServer> parse() throws IOException {
        Document doc = Jsoup.connect(SOURCE_URL)
                .userAgent("Mozilla")
                .get();

        System.out.println(doc.title());

        return List.of();
    }
}
