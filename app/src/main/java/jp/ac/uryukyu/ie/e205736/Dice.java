package jp.ac.uryukyu.ie.e205736;

import java.util.Random;

public class Dice {
    private int value;
    public Dice(){
        this.value=play();
    }
    Random random = new Random();
    public int play(){
        int number=random.nextInt(5);
        number+=1;
        return number;   
    }
    public int getValue(){
        return this.value;
    }
}
