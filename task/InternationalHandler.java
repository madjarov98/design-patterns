package com.uni.patterns.task;

public class InternationalHandler extends Handler {

    @Override
    public void handle(Order order) {
        System.out.println("Пратка с дестинация: Международна...");
        getState().next(this);
    }
}
