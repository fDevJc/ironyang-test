package ironyang.test.repository;

import ironyang.test.domain.Item;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.util.ReflectionTestUtils;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Commit
class ItemRepositoryTest {

    @Autowired
    ItemRepository itemRepository;

    @Test
    void save() {
        //given
        Item item = new Item("name");

        //when
        Item savedItem = itemRepository.save(item);

        //then
        assertThat(savedItem).isNotNull();
        assertThat(ReflectionTestUtils.getField(savedItem, "id")).isNotNull();
    }

    @Test
    void findById() {
        //given
        Item item = new Item("name");
        Item savedItem = itemRepository.save(item);
        //when
        Item foundItem = itemRepository.findById((Long) ReflectionTestUtils.getField(savedItem, "id")).get();
        //then
        assertThat(foundItem).isEqualTo(savedItem);
    }
}