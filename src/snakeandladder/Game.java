package snakeandladder;

import snakeandladder.model.Cell;
import snakeandladder.model.Coin;
import snakeandladder.model.Player;

import java.util.Deque;
import java.util.LinkedList;

public class Game {

    public static void main(String[] args) {
        Deque<Player> playerDeque= new LinkedList<>();
        boolean winner=false;
        Board b = new Board(10,10);

        Coin c1 = new Coin("Black",0);
        Coin c2 = new Coin("Red",0);
        Player p1 = new Player("Tirtha",c1);
        Player p2 = new Player("Subham",c2);

        playerDeque.add(p1);
        playerDeque.add(p2);

        for(int i=0;i<100;i++)
        {
            Cell c=b.board[i/10][i%10];
            System.out.print(c.has_ladder()?"Ladder at "+i+" "+c.next.getPosition()+"\n":"");
            System.out.print(c.has_snake()?"Snake at "+i+" "+c.next.getPosition()+"\n":"");

        }

        while(!winner){
            Player p = playerDeque.pop();
            b.move(p,p.rolldice(b.dice));
            playerDeque.add(p);
            if(p.getCoin().getPosition()==99) {
                winner = true;
                System.out.println(p.getName()+" wins");
            }
        }



    }

}
