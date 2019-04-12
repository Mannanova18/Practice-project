import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class IsTriangleTest {

    @Parameterized.Parameter(0)
    public double a;

    @Parameterized.Parameter(1)
    public double b;

    @Parameterized.Parameter(2)
    public double c;

    @Parameterized.Parameter(3)
    public boolean result;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {

        return Arrays.asList(
                new Object[]{2, 10, -10, false},
                new Object[]{2, 1, 1, false},
                new Object[]{1, 2, 4, false},
                new Object[]{4, 4, 5, true},
                new Object[]{0, 0, 1, false},
                new Object[]{2, 3, 0, false},
                new Object[]{6, 0, 1, false},
                new Object[]{2, 4, 3, true}

        );

    }

    @Test
    public void TriangleMethodShouldCheckSides() {
        Triangle triangle = new Triangle(a, b, c);
        boolean actual = triangle.isTriangle();
        assertEquals(result, actual);

    }
}