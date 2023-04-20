import org.junit.Test;

public class TriangleTest {

    @Test
    public void testTable() {
        Triangle.triangle(0, 0, 0);
        Triangle.triangle(1, 0, 0);
        Triangle.triangle(1, 1, 0);
        Triangle.triangle(1, 2, 3);
        Triangle.triangle(1, 1, 1);
        Triangle.triangle(2, 2, 1);
        Triangle.triangle(2, 3, 4);
        Triangle.triangle(1, 2, 4);
        Triangle.triangle(1, 4, 2);
        Triangle.triangle(1, 1, 2);
        Triangle.triangle(2, 2, 5);
        Triangle.triangle(3, 1, 3);
        Triangle.triangle(3, 4, 2);
        Triangle.triangle(2, 2, 2);
        Triangle.triangle(4, 2, 2);
    }


    @Test
    public void testMutants() {
        Triangle.triangle(1, 1, 1);
        Triangle.triangle(-1, 1, 1);
        Triangle.triangle(1, 0, 1);
        Triangle.triangle(1, -1, 1);


        Triangle.triangle(-5, 5, 5);
        Triangle.triangle(1, -1, 1);
        Triangle.triangle(-1, -1, 1);

        Triangle.triangle(1, 1, -1);
        Triangle.triangle(2, 3, 5);
        Triangle.triangle(2, 5, 3);


        Triangle.triangle(7, 16, 4);

        Triangle.triangle(3, 4, 5);
        Triangle.triangle(5, 3, 2);
        Triangle.triangle(7, 7, 7);
        Triangle.triangle(2, 12, 9);
        Triangle.triangle(4, 6, 3);
        Triangle.triangle(5, 2, 2);
    }
}
