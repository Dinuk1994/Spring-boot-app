package edu.icet_104.controller;

import edu.icet_104.dto.Item;
import edu.icet_104.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class  InventryController {

    @Autowired
    InventoryService service;

    @GetMapping("/inventory")
    public List<Item> getAll(){
        return  service.getAll();

    }
    public void addItem(){
        service.addItem();
    }
}
