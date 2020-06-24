package com.uni.patterns.task;

public class BulgariaHandler extends Handler {

    public BulgariaHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handle(Order order) {
        System.out.println("Пратка с дестинация: България...");
        getState().next(this);
    }
}
