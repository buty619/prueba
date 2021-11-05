package com.example.accessingdatamongodb;

import org.springframework.data.annotation.Id;


public class Product {

	@Id
	public String id;

	public String productName;
	public String Category;
	public Boolean Available;
	public Integer Price;
	public Integer Stock;
	public String Image;

	public Product() {}

	public Product(String productName, String Category, Boolean Available, Integer Price, Integer Stock, String Image) {
		this.productName = productName;
		this.Category = Category;
		this.Available = Available;
		this.Price = Price;
		this.Stock = Stock;
		this.Image = Image;
	}

	public String getId() {return id;}
	public void setId(String id) {this.id = id;}

	public String getProductName() {return productName;}
	public void setProductName(String productName) {this.productName = productName;}

	public String getCategory() {return Category;}
	public void setCategory(String Category) {this.Category = Category;}

	public Boolean getAvailable() {return Available;}
	public void setAvailable(Boolean Available) {this.Available = Available;}

	public Integer getPrice() {return Price;}
	public void setPrice(Integer Price) {this.Price = Price;}

	public Integer getStock() {return Stock;}
	public void setStock(Integer Stock) {this.Stock = Stock;}

	public String getImage() {return Image;}
	public void setImage(String Image) {this.Image = Image;}


	@Override
	public String toString() {
		return String.format(
				"Product[id=%s, productName=%s, Category=%s, Available=%s, Price=%s, Stock=%s, Image=%s]",
				id, productName, Category, Available, Price, Stock, Image);
	}

}
