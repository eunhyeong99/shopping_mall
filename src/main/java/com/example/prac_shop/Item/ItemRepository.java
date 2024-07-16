package com.example.prac_shop.Item;

import com.example.prac_shop.Item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
