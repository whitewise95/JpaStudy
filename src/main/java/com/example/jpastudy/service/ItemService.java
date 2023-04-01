package com.example.jpastudy.service;

import com.example.jpastudy.domain.Item;
import com.example.jpastudy.repository.ItemRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

	private final ItemRepository itemRepository;

	@Transactional
	public void saveItem(Item item){
		itemRepository.save(item);
	}

	public List<Item> findItems(){
		return itemRepository.findAll();
	}

	public Item findOne(Long id){
		return itemRepository.findById(id);
	}
}
