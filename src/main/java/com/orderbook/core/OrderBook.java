package com.orderbook.core;

import java.util.Map;

/**
 * An interface available to client (i.e. OrderBookClient.java).
 * For a simple order book implementation getOrderBook(), getAllAsk() and getAllBid()
 * methods will print on console. This will help client to avoid any print or processing of these objects
 *
 */
public interface OrderBook {
    void getOrderBook();
    void getAllAsk();
    void getAllBid();
    Map.Entry<Double, Integer> getSellAtLevel(int level);
    Map.Entry<Double, Integer> getBuyAtLevel(int level);
    void addNewOrder(double price, int qty, boolean isBuy);
    void getMatchedOrders();
    void clearOrderBook();
   }
