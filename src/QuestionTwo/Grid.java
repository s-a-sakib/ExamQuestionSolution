package QuestionTwo;

import java.util.ArrayList;

public class Grid {
    private int numRows;
    private int numColumns;

    private String[][] grid;

    public Grid(int numRows , int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        grid = new String[numRows][numColumns];
    }

    public void add(int row , int col , String Description){
        grid[row][col] = Description;
    }

    public String getDescription(int row , int column){
        return grid[row][column];
    }

    public ArrayList<Location> getDescribedLocations() {
        ArrayList<Location> describedLocations = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (grid[i][j] != null) {
                    describedLocations.add(new Location(i, j));
                }
            }
        }
        return describedLocations;
    }
}


class Location{
    private int row;
    private int col;

    public Location(int row , int col){
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return col;
    }
}