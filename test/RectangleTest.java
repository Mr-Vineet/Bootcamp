import com.tw.shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void calculatesAreaWithSameLengthAndBreadth() {
        final Rectangle rectangle = new Rectangle(4,4);
        assertEquals(16, rectangle.area());
    }

    @Test
    void calculatesAreaWithDifferentLengthAndBreadth() {
        final Rectangle actual = new Rectangle(2, 3);
        assertEquals(6, actual.area());
    }

    @Test
    void calculatesPerimeterWithSameLengthAndBreadth() {
        final Rectangle rectangle = new Rectangle(4, 4);
        assertEquals(16, rectangle.perimeter());
    }

    @Test
    void calculatesPerimeterWithDifferentLengthAndBreadth() {
        final Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(10, rectangle.perimeter());
    }
}