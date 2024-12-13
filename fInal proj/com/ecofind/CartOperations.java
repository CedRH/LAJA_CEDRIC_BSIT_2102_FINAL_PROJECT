package com.ecofind;

import java.util.List;

public interface CartOperations {
    void addItem(MarketItem item);
    void removeItem(MarketItem item);
    List<MarketItem> getItems();
    double getTotalEnvironmentalImpact();
}
