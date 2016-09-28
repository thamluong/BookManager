package com.rm.model;

public class Information {
	private int id;
	private String category;
	private String date;
	private String publisher;
	private String language;
	private String pages;
	private String img;
	private String info;

	public Information(){}
	public Information(int id, String category, String date, String publisher, String language, String pages, String img,
			String info) {
		super();
		this.id = id;
		this.category = category;
		this.date = date;
		this.publisher = publisher;
		this.language = language;
		this.pages = pages;
		this.img = img;
		this.info = info;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
