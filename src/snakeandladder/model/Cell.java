package snakeandladder.model;

public class Cell {
    int position;
    boolean has_snake;
    boolean has_ladder;

    public Cell next;
    public Cell(int i) {
        this.position=i;
        has_ladder=false;
        has_snake=false;
        this.next=this;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean has_snake() {
        return has_snake;
    }

    public void setHas_snake(boolean has_snake) {
        this.has_snake = has_snake;
    }

    public boolean has_ladder() {
        return has_ladder;
    }

    public void setHas_ladder(boolean has_ladder) {
        this.has_ladder = has_ladder;
    }

}
