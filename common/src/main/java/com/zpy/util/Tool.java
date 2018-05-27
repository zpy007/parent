package com.zpy.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



public class Tool {
    public Hand hand;

    @Autowired
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void Use(){
        System.out.println("Use Tool");
        hand.eat();
    }
}
