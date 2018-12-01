package co.simplon.shop.model.shop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import co.simplon.shop.model.common.Entity;
import co.simplon.shop.model.product.Product;

public class Shop extends Entity {	

	private static final long serialVersionUID = 1L;
	private String name;
	private List<Stock> stocks = new ArrayList<Stock>();
	private float stocksValue;//total des prix d'achats du stock
	private float turnover;//chiffre d'affaire
	private float profit;//bénéfice

	public Shop(String name) {
		this.name = name;
	}

	public Collection<Stock> getStocks() {
		return new ArrayList<Stock>(stocks);
	}

	public void sellProduct(Product product,int quantity) {
	}

	public void addProductToStocks(Stock stock) {
	}

	public String getName() {
		return name;
	}

	public float getStocksValue() {
		return stocksValue;
	}

	public float getTurnover() {
		return turnover;
	}

	public float getProfit() {
		return profit;
	}
	
}
