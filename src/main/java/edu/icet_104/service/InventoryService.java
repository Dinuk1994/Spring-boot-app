package edu.icet_104.service;

import edu.icet_104.dto.Item;

import java.util.List;

public interface InventoryService {
    List<Item> getAll();

    void addItem(Item item);
}
