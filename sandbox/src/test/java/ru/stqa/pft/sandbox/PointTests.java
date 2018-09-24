package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

import static ru.stqa.pft.sandbox.MyFirstProgram.distance;

public class PointTests {

    // Function testing:
    @Test
    public void functionTesting() {
        Point p1 = new Point(5,7);
        Point p2 = new Point(8,13);

        Assert.assertEquals(distance(p1, p2), 6.708203932499369);

    }

    // Method testing:
    @Test
    public void methodTesting() {
        Point p1 = new Point(6,8);
        Point p2 = new Point(9,14);
        Assert.assertEquals(p1.distance(p2), 6.708203932499369);
    }

}
