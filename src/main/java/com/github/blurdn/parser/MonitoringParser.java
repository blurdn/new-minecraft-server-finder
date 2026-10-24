package com.github.blurdn.parser;

import com.github.blurdn.model.MinecraftServer;

import java.io.IOException;
import java.util.List;

public interface MonitoringParser {
    List<MinecraftServer> parse() throws IOException;
}
