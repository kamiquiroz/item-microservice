package com.formacionbdi.springboot.app.item.models.services;
import com.formacionbdi.springboot.app.item.models.Item;
import java.util.List;

public interface ItemService {
    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);
}
