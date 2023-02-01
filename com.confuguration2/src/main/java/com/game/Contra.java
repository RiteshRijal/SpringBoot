package com.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Contra implements Gamingconsole {
    public void up(){
        System.out.println("Move up");
    }
    public void down(){
        System.out.println("Move down");
    }
    public void left(){
        System.out.println("Protect ");
    }
    public void right(){
        System.out.println("shoot");
    }
}
