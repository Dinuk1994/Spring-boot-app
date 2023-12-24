package edu.icet_104.service;

import org.springframework.stereotype.Service;

@Service
public class InventryServiceImpl implements InventoryService{
    @Override
    public String getName(){
        return "Dinuk";
    }

}
