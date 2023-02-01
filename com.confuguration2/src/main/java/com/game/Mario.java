package com.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioQualifier")
public class Mario implements Gamingconsole{

    public void up(){
        System.out.println("Move up");
    }
    public void down(){
        System.out.println("Move down");
    }
    public void left(){
        System.out.println("Go Back ");
    }
    public void right(){
        System.out.println("Accelerate");
    }
}
