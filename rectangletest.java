import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle rect = new Rectangle(10.0, 5.0);
        assertEquals(10.0, rect.getWidth());
    }

    @Test
    void getHeight() {
        Rectangle rect = new Rectangle(10.0, 5.0);
        assertEquals(5.0, rect.getHeight());
    }

    @Test
    void getArea() {
        Rectangle rect = new Rectangle(4.0, 3.0);
        assertEquals(12.0, rect.getArea(), 0.0001);
    }

    @Test
    void getDiagonal() {
        Rectangle rect = new Rectangle(3.0, 4.0);
        assertEquals(5.0, rect.getDiagonal(), 0.0001);  // 3-4-5 triangle
    }

    @Test
    void testDecimalValues() {
        Rectangle rect = new Rectangle(5.5, 7.2);
        assertEquals(39.6, rect.getArea(), 0.0001);
        assertEquals(Math.sqrt(5.5 * 5.5 + 7.2 * 7.2), rect.getDiagonal(), 0.0001);
    }

    @Test
    void testZeroValues() {
        Rectangle rect = new Rectangle(0, 0);
        assertEquals(0.0, rect.getArea(), 0.0001);
        assertEquals(0.0, rect.getDiagonal(), 0.0001);
    }
}
