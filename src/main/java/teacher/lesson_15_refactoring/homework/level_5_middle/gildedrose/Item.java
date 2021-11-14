package teacher.lesson_15_refactoring.homework.level_5_middle.gildedrose;

import java.util.Objects;

public class Item {

	private String name;
	private int sellIn;
	private int quality;

	public Item(String name, int sellIn, int quality) {
		this.setName(name);
		this.setSellIn(sellIn);
		this.setQuality(quality);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSellIn() {
		return sellIn;
	}

	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Item item = (Item) o;
		return sellIn == item.sellIn && quality == item.quality && Objects.equals(name, item.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sellIn, quality);
	}
}