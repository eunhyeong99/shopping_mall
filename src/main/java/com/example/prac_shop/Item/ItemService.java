package com.example.prac_shop.Item;

import com.example.prac_shop.Item.Item;
import com.example.prac_shop.Item.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public void saveItem(String title, Integer price){

        Item item = new Item();
        item.setTitle(title);
        item.setPrice(price);
        itemRepository.save(item);

    }

}
