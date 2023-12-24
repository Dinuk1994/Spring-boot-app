package edu.icet_104.controller;

import edu.icet_104.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  InventryController {

    @Autowired
    InventoryService service;

    @GetMapping("/inventory")
    public String getName(){
        return  service.getName();

    }
}
