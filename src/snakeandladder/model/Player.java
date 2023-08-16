package snakeandladder.model;

import snakeandladder.Dice;
import snakeandladder.model.Coin;

public class Player {
    String name;
    Coin coin;
    public Player(String name, Coin c) {
        this.name = name;
        this.coin = c;
    }

    public int rolldice(Dice d){
        return d.roll();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin c) {
        this.coin = c;
    }
}
