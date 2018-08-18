package com.hw5;

public class Book {

	private static int idCounter = 0;
	private static final int FIRSTBOOKYEAR = 868;
	private static final int CURRENTYEAR = 2018;
	private int id;
	private String name;
	private String authors;
	private String press;
	private int year;
	private int pages;
	private double price;
	private String cover;

	public Book() {
		idCounter++;
		this.id = idCounter;
	}

	public Book(String name) {
		if (name != null)
			this.setName(name);
		idCounter++;
		this.id = idCounter;
	}

	public Book(String name, String authors) {
		if (name != null)
			this.setName(name);
		if (authors != null)
			this.setAuthors(authors);
		idCounter++;
		this.id = idCounter;
	}

	public Book(String name, String authors, String press, int year, int pages, double price, String cover) {

		this.setName(name);
		this.setAuthors(authors);
		this.setPress(press);
		this.setYear(year);
		this.setPages(pages);
		this.setPrice(price);
		this.setCover(cover);
		idCounter++;
		this.id = idCounter;
	}

	public Book(String name, String authors, String press) {
		this.setName(name);
		this.setAuthors(authors);
		this.setPress(press);
		idCounter++;
		this.id = idCounter;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		if (name == null)
			System.out.println("Введите имя");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthors() {
		if (authors == null)
			System.out.println("Введите автора");
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public void addAuthor(String author) {
		if (author != null) {
			if (this.authors == null)
				this.authors = author;
			else
				this.authors += " " + author;
		}
	}

	public String getPress() {
		if (press == null)
			System.out.println("Введите издательство");
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getYear() {
		if (year == 0)
			System.out.println("Введите год");
		return year;
	}

	public void setYear(int year) {
		if (year >= FIRSTBOOKYEAR && year <= CURRENTYEAR)
			this.year = year;
		else
			System.out.println("Неверный год!");
	}

	public int getPages() {
		if (pages == 0)
			System.out.println("Введите количество страниц");
		return pages;
	}

	public void setPages(int pages) {
		if (pages > 0)
			this.pages = pages;
	}

	public double getPrice() {
		if (price == 0)
			System.out.println("Введите цену");
		return price;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
	}

	public String getCover() {
		if (cover == null)
			System.out.println("Введите тип обложки");
		return cover;
	}

	public void setCover(String cover) {
		if (cover != null)
			this.cover = cover;
	}

	@Override

	public String toString() {

		StringBuilder sb = new StringBuilder(
				"\tBook id: " + this.getId() + "\n\tName: " + this.getName() + "\n\tAuthor(s): " + this.getAuthors()
						+ "\n\tPress: " + this.getPress() + "\n\tYear: " + this.getYear() + "\n\tPages: "
						+ this.getPages() + "\n\tPrice: $" + this.getPrice() + "\n\tCover: " + this.getCover());
		return sb.toString();
	}
}

