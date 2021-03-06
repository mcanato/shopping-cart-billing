package org.canato.billing.test.helper;

import org.canato.billing.bean.Item;

/**
 * Helper class for running the tests.
 * 
 * @author matteo
 *
 */
public final class ItemHelper {
	
	private ItemHelper(){
	}
	
	public static Item getPasta() {
		return new Item("Pasta 1kg", 4.29d, Item.Type.GROCERY, 1);
	}
	
	public static Item getCoffee() {
		return new Item("Coffee 500g", 3.21d, Item.Type.GROCERY, 1);
	}
	
	public static Item getBook1() {
		return new Item("Book 1", 10.12d, Item.Type.BOOK, 1);
	}
	
	public static Item getBook2() {
		return new Item("Book 2", 15.05d, Item.Type.BOOK, 1);
	}
	
	public static Item getCake() {
		return new Item("Cake", 2.35d, Item.Type.OTHER, 1);
	}
	
	public static Item getChocolate() {
		return new Item("Chocolate", 2.1d, Item.Type.OTHER, 10);
	}
	
	public static Item getApple() {
		return new Item("Apple", 0.5d, Item.Type.OTHER, 5);
	}
	
	public static Item getWine() {
		return new Item("Wine", 10.5d, Item.Type.DRINKS, 1);
	}
	
}
