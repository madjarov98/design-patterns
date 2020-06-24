package com.uni.patterns.task;

public class PlovdivHandler extends Handler {

    public PlovdivHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handle(Order order) {
        System.out.println("Пратка с дестинация: Пловдив...");
        getState().next(this);
    }
}
