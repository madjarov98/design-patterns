package com.uni.patterns.task;

public class InProgress implements State {

    @Override
    public void next(Handler handler) {
        System.out.println("Статусът е сменен на състояние на прогрес...");
        handler.setState(new Waiting());
    }
}
