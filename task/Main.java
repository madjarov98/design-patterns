package com.uni.patterns.task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> ordersFor = new ArrayList<>();
        ordersFor.add(new Order("Международна"));
        ordersFor.add(new Order("Пловдив"));
        ordersFor.add(new Order("България"));
        ordersFor.add(new Order("Международна"));
        ordersFor.add(new Order("Пловдив"));

        Speditor deliveryBoy = new Speditor();
        Handler handlerChain = getHandlers(deliveryBoy);

        for (Order order : ordersFor) {
            handlerChain.handle(order);
        }
    }

    private static Handler getHandlers(Speditor speditor) {
        InternationalHandler international = new InternationalHandler();
        international.addObserver(speditor);
        BulgariaHandler bulgaria = new BulgariaHandler(international);
        bulgaria.addObserver(speditor);
        PlovdivHandler plovdiv = new PlovdivHandler(bulgaria);
        plovdiv.addObserver(speditor);

        return plovdiv;
    }
}
