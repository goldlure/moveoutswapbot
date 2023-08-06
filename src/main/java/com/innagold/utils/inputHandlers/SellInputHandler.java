package com.innagold.utils.inputHandlers;

import com.innagold.utils.StringInputHandler;

public class SellInputHandler implements StringInputHandler{

    @Override
    public String handleInput(String input) {
        String output = "Sell: " + input;
        System.out.println(output);
        return output;
    }
    
}
