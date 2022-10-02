package ironyang.test.service;

import ironyang.test.domain.Item;
import ironyang.test.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ItemServiceTest {

    @Mock
    ItemRepository itemRepository;

    @InjectMocks
    ItemService itemService;

    @Test
    void addItem() {
        //given
        Item item = new Item("name");

        //when
        itemService.addItem(item);

        //then
    }

    @Test
    void findItem() {
        //given
        Item item = new Item("name");

        //when
        itemService.addItem(item);

        //then
    }

}