package snakeandladder;

import snakeandladder.model.Cell;
import snakeandladder.model.Coin;
import snakeandladder.model.Player;

import java.util.List;

public class Board {

    Cell[][] board;
    List<Coin> coinList;
    Dice dice;

    void setup() {
        generatesnakes(10);
        generateladders(10);
    }

    private void generateladders(int count) {
        int idx=0;
        while(true)
        {
            if(idx==count)
                break;
            int x=((int)(Math.random()*100))%100;
            int y=((int)(Math.random()*100))%100;

            if(x<y)
            {
                if(board[x/10][x%10].has_snake())
                    continue;
                idx++;
                board[x/10][x%10].setHas_ladder(true);
                board[x/10][x%10].next=board[y/10][y%10];
            }
        }
    }

    private void generatesnakes(int count) {
        int idx=0;
        while(true)
        {
            if(idx==count)
                break;
            int x=((int)(Math.random()*100))%100;
            int y=((int)(Math.random()*100))%100;

            if(x>y)
            {
                idx++;
                board[x/10][x%10].setHas_snake(true);
                board[x/10][x%10].next=board[y/10][y%10];
            }
        }
    }

    Board(int r,int c){

        board=new Cell[r][c];
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                this.board[i][j] = new Cell(i * 10 + j);
            }
        }
        setup();
        this.dice=new Dice();
    }

    void move(Player p, int num)
    {
        Coin c =p.getCoin();
        int nextCellno = c.getPosition()+num;
        if(nextCellno>99)
            return;
        Cell cell = board[nextCellno/10][nextCellno%10];
        if(cell.has_ladder() || cell.has_snake())
            cell=cell.next;

        System.out.println(p.getName() + " rolled a"+ num + "and moved from "+c.getPosition()+ "to"+ cell.getPosition());
        c.setPosition(cell.getPosition());
    }




}
