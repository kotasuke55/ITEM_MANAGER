package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Item;
import com.example.form.ItemForm;
import com.example.repository.ItemRepository;


@Service
public class ItemService {

	private final ItemRepository itemRepository;

	@Autowired
	public ItemService(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	public List<Item> findAll(){
		return this.itemRepository.findAll();
	}
	
	public Item save(ItemForm itemForm) {
		Item item = new Item();
		item.setName(itemForm.getName());
		item.setPrice(itemForm.getPrice());
		return this.itemRepository.save(item);
	}
}
