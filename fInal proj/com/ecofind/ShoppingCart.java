package com.ecofind;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements CartOperations {
    private final List<MarketItem> items = new ArrayList<>();

    @Override
    public void addItem(MarketItem item) {
        items.add(item);
    }

    @Override
    public void removeItem(MarketItem item) {
        items.remove(item);
    }

    @Override
    public List<MarketItem> getItems() {
        return new ArrayList<>(items);
    }

    @Override
    public double getTotalEnvironmentalImpact() {
        return items.stream()
                    .mapToDouble(MarketItem::calculateEnvironmentalImpact)
                    .average()
                    .orElse(0.0);
    }
}
