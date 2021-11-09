package teacher.lesson_15_refactoring.homework.level_5_middle.gildedrose;

import static org.junit.Assert.*;

public class GildedRoseTest {

    /*
@Test
    void testCommonItems() {
        Item[] items = {new Item("+5 Dexterity Vest", 5, 10)};
        GildedRose service = new GildedRose(items);
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 4, 9));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 3, 8));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 2, 7));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 1, 6));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 0, 5));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", -1, 3));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", -2, 1));
    }

    @Test
    void testConjuredItems() {
        Item[] items = {new Item("Conjured", 5, 10)};
        GildedRose service = new GildedRose(items);
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Conjured", 4, 8));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Conjured", 3, 6));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Conjured", 2, 4));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Conjured", 1, 2));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Conjured", 0, 0));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Conjured", -1, -2));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Conjured", -2, -4));
    }


    @Test
    void testAgedBrieItems() {
        Item[] items = {new Item("Aged Brie", 8, 10)};
        GildedRose service = new GildedRose(items);
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", 7, 11));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", 6, 12));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", 5, 13));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", 4, 14));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", 3, 15));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", 2, 16));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", 1, 17));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", 0, 18));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", -1, 20));
    }

    @Test
    void testSulfuras() {
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros", 8, 80)};
        GildedRose service = new GildedRose(items);
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Sulfuras, Hand of Ragnaros", 8, 80));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Sulfuras, Hand of Ragnaros", 8, 80));
        service.updateQuality();
    }


    @Test
    void testBackstagePasses() {

        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 9, 20)};
        GildedRose service = new GildedRose(items);
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 8, 22));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 7, 24));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 6, 26));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 28));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 4, 31));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 3, 34));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 2, 37));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 1, 40));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 0, 43));
        service.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", -1, 0));
    }
     */

}