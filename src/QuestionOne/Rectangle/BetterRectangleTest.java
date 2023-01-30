package QuestionOne.Rectangle;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BetterRectangleTest {
    public BetterRectangleTest(){

    }
    BetterRectangle betterRectangle;

    @Test
    public void getAreaTest(){
        betterRectangle = new BetterRectangle(3,3,10,10);
        int area = betterRectangle.getArea();
        assertEquals(area , 100);
    }

    @Test
    public void getPerimeter(){
        betterRectangle = new BetterRectangle(3,3,10,10);
        int perimeter = betterRectangle.getPerimeter();
        assertEquals(perimeter,40);
    }
}
