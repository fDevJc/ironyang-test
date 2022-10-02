package ironyang.test.service;

import ironyang.test.domain.Item;
import ironyang.test.repository.ItemRepository;

public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void addItem(Item item) {
        itemRepository.save(item);
    }
}
