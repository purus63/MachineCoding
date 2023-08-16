package snakeandladder;

public class Dice {

    static int maxValue=1000;
    int roll(){
        int num = (int)(Math.random()*maxValue)%6+1;
        if(num==6)
        {
            num=roll2(num);
        }
        return num;
    }
    int roll2(int num){
         num = num+(int)(Math.random()*maxValue)%6+1;
        if(num == 12)
        {
            num=num+roll2(num);
        }
        if(num==18)
            num=0;
        return num;
    }

}
