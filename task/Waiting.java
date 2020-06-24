package com.uni.patterns.task;

public class Waiting implements State {

    @Override
    public void next(Handler handler) {
        System.out.println("Статусът е сменен на състояние на изчакване...");
        handler.setState(new InProgress());
    }
}
