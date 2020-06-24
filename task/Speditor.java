package com.uni.patterns.task;

import java.util.Observable;
import java.util.Observer;

public class Speditor implements Observer {

    @Override
    public void update(Observable observable, Object args) {
        Handler handler = ((Handler) observable);
        State state = handler.getState();
        System.out.println("Пратката е опакована и взета за изпращане...");
        state.next(handler);
    }
}
