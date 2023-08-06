package com.innagold.utils.inputHandlers;

import com.innagold.utils.StringInputHandler;

public class SearchInputHandler implements StringInputHandler{

    @Override
    public String handleInput(String input) {
        String output = "Search: " + input;
        System.out.println(output);
        return output;
    }
    
}
