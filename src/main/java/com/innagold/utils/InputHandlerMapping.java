package com.innagold.utils;
import java.util.HashMap;
import java.util.Map;

import com.innagold.utils.inputHandlers.UknownInputHandler;

public class InputHandlerMapping {
    private Map<String, StringInputHandler> handlers = new HashMap<>();

    public void addMapping(String input, StringInputHandler handler) {
        handlers.put(input, handler);
    }

    public StringInputHandler getHandler(String input) {
        return handlers.get(input);
    }

    public StringInputHandler setDefaultHandler() {
        return new UknownInputHandler();
    }
}