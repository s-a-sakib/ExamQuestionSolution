package QuestionTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GridTest {

    public GridTest(){

    }
    GridTest gridTest;

    @Test
    public void getDescriptionTest(){
        Grid grid = new Grid(2,2);
        grid.add(0,0,"Sakib");
        String s = grid.getDescription(0,0);
        assertEquals(s ,"Sakib");
    }


}
