package com.yash.lbm.model;


public class BookDetails{
	
	private int id;
	private String bookName;
	private int quantity;
	private String catagory;
	
	public BookDetails(){
		
	}
	public BookDetails(int id,String name,int quant){
		this.id=id;
		this.bookName=name;
		this.quantity=quant;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public String toString(){
		return this.getId()+":"+this.getBookName()+":"+this.getQuantity();
		
	}
	public int hashCode(){
		return this.id;
	}
	public boolean equals(BookDetails obj){
		
		return this.getId()==obj.getId() && this.getBookName()==obj.getBookName() && this.getCatagory()==obj.getCatagory() && this.getQuantity()==obj.getQuantity();
		
		}
	

	

}
