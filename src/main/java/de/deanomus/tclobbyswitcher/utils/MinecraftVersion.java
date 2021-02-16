/**
 * Thanks to TechsCode for this code snippet
 */
package de.deanomus.tclobbyswitcher.utils;

import org.bukkit.Bukkit;

import java.io.File;

public enum MinecraftVersion {
    UNKOWN,
    V1_8_R1,
    V1_8_R2,
    V1_8_R3,
    V1_9_R1,
    V1_9_R2,
    V1_10_R1,
    V1_11_R1,
    V1_12_R1,
    V1_13_R1,
    V1_13_R2,
    V1_14_R1,
    V1_15_R1,
    V1_16_R1,
    V1_16_R2,
    V1_16_R3,
    V1_16_R4;


    private static MinecraftVersion currentVersion;

    static {
        try {
            File file1 = new File("server.properties");
            File file2 = new File("bukkit.yml");

            if (file1.exists() && file2.exists()) {
                currentVersion = valueOf(Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3].toUpperCase());
            } else {
                currentVersion = UNKOWN;
            }
        } catch (Exception exception) {
            currentVersion = UNKOWN;
        }
    }

    public boolean isAboveOrEqual(MinecraftVersion paramMinecraftVersion) {
        return (ordinal() >= paramMinecraftVersion.ordinal());
    }

    public static MinecraftVersion getServersVersion() {
        return currentVersion;
    }
}
