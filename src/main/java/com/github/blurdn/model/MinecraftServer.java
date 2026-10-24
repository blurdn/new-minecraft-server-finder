package com.github.blurdn.model;

public record MinecraftServer(
        String ip,
        int port,
        String name,
        int online,
        int maxOnline,
        int ageSeconds,
        String language
) {}
