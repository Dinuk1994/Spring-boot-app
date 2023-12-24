package edu.icet_104.service;

import edu.icet_104.dto.Item;
import edu.icet_104.entity.ItemEntity;

import java.util.List;

public interface InventoryService {
    Iterable
            <ItemEntity> getAll();

    void addItem(Item item);
}
