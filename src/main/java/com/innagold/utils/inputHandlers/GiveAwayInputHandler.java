package com.innagold.utils.inputHandlers;

import com.innagold.utils.StringInputHandler;

public class GiveAwayInputHandler implements StringInputHandler{

    @Override
    public String handleInput(String input) {
        String output = "Giveaway: " + input;
        System.out.println(output);
        return output;
    }
    
}
