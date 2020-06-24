package com.uni.patterns.task;


import java.util.Observable;

public abstract class Handler extends Observable {
    private Handler next;
    private State state = new Waiting();

    public Handler() {
    }

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(Order order) {
        next.handle(order);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
