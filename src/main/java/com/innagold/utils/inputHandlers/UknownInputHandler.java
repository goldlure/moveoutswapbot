package com.innagold.utils.inputHandlers;

import com.innagold.utils.StringInputHandler;

public class UknownInputHandler implements StringInputHandler{

    @Override
    public String handleInput(String input) {
        String output = "Uknown: " + input;
        System.out.println(output);
        return output;
    }
    
}
