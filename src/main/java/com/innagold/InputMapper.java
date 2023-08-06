package com.innagold;

import com.innagold.utils.InputHandlerMapping;
import com.innagold.utils.inputHandlers.GiveAwayInputHandler;
import com.innagold.utils.inputHandlers.SearchInputHandler;

public class InputMapper {
    public static InputHandlerMapping inputMapping = null;
    public static void MapInput()
    {
        inputMapping = new InputHandlerMapping();
        inputMapping.addMapping("/search", new SearchInputHandler());
        inputMapping.addMapping("/giveaway", new GiveAwayInputHandler());      
    }
}
