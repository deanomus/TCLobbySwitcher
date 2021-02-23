/**
 * Thanks to TechsCode for this code snippet
 */
package de.deanomus.tclobbyswitcher.utils.chat;

import de.deanomus.tclobbyswitcher.utils.MinecraftVersion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Color {
    private final String colorCode;
    private final int r;
    private final int g;
    private final int b;

    public static Color from(String paramString) {
        return new Color(paramString);
    }

    public static Color from(int paramInt1, int paramInt2, int paramInt3) {
        java.awt.Color color = new java.awt.Color(paramInt1, paramInt2, paramInt3);
        return from(Integer.toHexString(color.getRGB()).substring(2));
    }

    private Color(String paramString) {
        this.colorCode = paramString.replace("#", "");

        java.awt.Color color = new java.awt.Color(Integer.parseInt(this.colorCode, 16));
        this.r = color.getRed();
        this.g = color.getGreen();
        this.b = color.getBlue();
    }

    public String getTag() {
        return "{#" + this.colorCode + "}";
    }

    public String getColorCode() {
        return this.colorCode;
    }

    public int getRed() {
        return this.r;
    }

    public int getGreen() {
        return this.g;
    }

    public int getBlue() {
        return this.b;
    }

    public String getAppliedTag() {
        boolean bool = MinecraftVersion.getServersVersion().isAboveOrEqual(MinecraftVersion.V1_16_R1);

        if (bool) {
            return "§x" + (String)Arrays.<String>stream(this.colorCode.split("")).map(paramString -> "§" + paramString).collect(Collectors.joining());
        }
        return MinecraftColor.getClosest(this).getAppliedTag();
    }

    public static int difference(Color paramColor1, Color paramColor2) {
        return Math.abs(paramColor1.r - paramColor2.r) + Math.abs(paramColor1.g - paramColor2.g) + Math.abs(paramColor1.b - paramColor2.b);
    }

    public String toString() {
        return getAppliedTag();
    }
}