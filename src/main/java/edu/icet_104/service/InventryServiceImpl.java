package edu.icet_104.service;

import edu.icet_104.dto.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventryServiceImpl implements InventoryService{

    List<Item> itemList=new ArrayList<>();
    @Override
    public List<Item> getAll(){
        itemList.add(new Item("Laptop",70000));
        itemList.add(new Item("Desktop",80000));
        return itemList;
    }


    @Override
    public void addItem(Item item) {
        itemList.add(item);
    }

}
