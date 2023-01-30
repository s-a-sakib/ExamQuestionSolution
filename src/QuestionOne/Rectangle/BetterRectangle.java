package QuestionOne.Rectangle;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int xLeft,int yLeft,int width,int height){
        super.setLocation(xLeft , yLeft);
        super.setSize(width , height);
    }

    public int getArea(){
        return height * width;
    }

    public int getPerimeter(){
        return (width + height) * 2;
    }
}
