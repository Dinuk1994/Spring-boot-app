package edu.icet_104.repository;

import edu.icet_104.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<ItemEntity,Long> {

}
