package Flyweight;

import java.util.ArrayList;
import java.util.Objects;

public class Flyweight {

    public interface Property{
        @Override
        String toString();

        @Override
        boolean equals(Object obj);
    }

    public static class Font implements Property{
        public String fontName;

        Font(String fontName) {
            this.fontName = fontName;
        }

        public String getFontName() {
            return fontName;
        }

        @Override
        public String toString() {
            return fontName;
        }

        @Override
        public boolean equals(Object o) {

            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Font font = (Font) o;
            return Objects.equals(fontName, font.fontName);
        }
    }

    public static class Color implements Property{
        public String colorName;

        public Color(String colorName) {
            this.colorName = colorName;
        }

        public String getColorName() {
            return colorName;
        }

        @Override
        public String toString() {
            return colorName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Color color = (Color) o;
            return Objects.equals(colorName, color.colorName);
        }
    }

    public static class Size implements Property{
        public int sizeVal;

        public Size(int sizeVal) {
            this.sizeVal = sizeVal;
        }

        public int getSizeVal() {
            return sizeVal;
        }

        @Override
        public String toString() {
            return sizeVal + "";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Size size = (Size) o;
            return Objects.equals(sizeVal, size.sizeVal);
        }
    }

    // Concrete Flyweight
    public static class File {
        String fileName;
        Font font;
        Color color;
        Size size;

        File(String fileName){
            this.fileName = fileName;
            this.font = null;
            this.color = null;
            this.size = null;
        }

        File(String fileName, Font font, Color color, Size size) {
            this.fileName = fileName;
            this.font = font;
            this.color = color;
            this.size = size;
        }

        public void setFont(Font font) {
            this.font = font;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public void setSize(Size size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return fileName + "\n" +
                    "Font: \t\t" + font.toString() + "\n" +
                    "Color: \t\t" + color.toString() + "\n"  +
                    "Font Size: \t" + size.toString();
        }
    }

    // Flyweight Factory
    public static class FileFactory{
        private final ArrayList<Font> fonts;
        private final ArrayList<Color> colors;
        private final ArrayList<Size> sizes;

        FileFactory(){
            fonts = new ArrayList<Font>();
            colors = new ArrayList<Color>();
            sizes = new ArrayList<Size>();
        }

        // Load existing file
        public void loadFile(String font, String color, int size){
            Font newFont = new Font(font);
            Color newColor = new Color(color);
            Size newSize = new Size(size);

            if (!fonts.contains(newFont)){
                fonts.add(newFont);
            }

            if (!colors.contains(newColor)){
                colors.add(newColor);
            }

            if (!sizes.contains(newSize)){
                sizes.add(newSize);
            }
        }

        // Add new properties to file
        public Font newFont(String font){
            Font newFont = new Font(font);
            if (!fonts.contains(newFont)){
                fonts.add(newFont);
            }

            return newFont;
        }

        public Color newColor(String color){
            Color newColor = new Color(color);
            if (!colors.contains(newColor)){
                colors.add(newColor);
            }

            return newColor;
        }

        public Size newSize(int size){
            Size newSize = new Size(size);
            if (!sizes.contains(newSize)){
                sizes.add(newSize);
            }

            return newSize;
        }

        @Override
        public String toString() {
            return fonts.toString() + "\n" + colors.toString() + "\n"  + sizes.toString();
        }
    }
}
