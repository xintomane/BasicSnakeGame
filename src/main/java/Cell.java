// represent a cell of the display board
public class Cell {
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    private final int row,col;

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }

    public CellType getCellType() {
        return cellType;
    }

    private CellType cellType;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    //enum for different cell types
    public enum CellType{

        EMPTY,
        FOOD,
        SNAKE_NODE;
    }


}
