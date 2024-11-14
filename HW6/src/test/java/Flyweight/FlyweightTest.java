package Flyweight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightTest extends Flyweight {

    FileFactory fileCreator = new FileFactory();
    File file = new File("TestFile");

    @BeforeEach
    void setUp() {
        // It was saying null? Wasn't setting up correctly
        //FileFactory fileCreator = new FileFactory();
        //File file = new File("TestFile");
    }

    @Test
    void testFontCreation(){
        file.font = fileCreator.newFont("Font");
        assertEquals(file.font.getFontName(), "Font");
    }

    @Test
    void testColorCreation(){
        file.color = fileCreator.newColor("Color");
        assertEquals(file.color.getColorName(), "Color");
    }

    @Test
    void testSizeCreation(){
        file.size = fileCreator.newSize(128);
        assertEquals(file.size.getSizeVal(), 128);
    }

    @Test
    void testEqualFont(){
        Font font = fileCreator.newFont("Font");
        Font font2 = fileCreator.newFont("Font");
        assertEquals(font, font2);
    }

    @Test
    void testEqualColor(){
        Color color = fileCreator.newColor("Color");
        Color color2 = fileCreator.newColor("Color");
        assertEquals(color, color2);
    }

    @Test
    void testEqualSize(){
        Size size = fileCreator.newSize(128);
        Size size2 = fileCreator.newSize(128);
        assertEquals(size, size2);
    }
}