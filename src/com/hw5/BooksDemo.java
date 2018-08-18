package com.hw5;

public class BooksDemo {

	public static void main(String[] args) {
		
		final String DEMOAUTHOR = "Даниель Дефо";
		final String DEMOPRESS = "Книжный Клуб «Клуб Семейного Досуга»";
		final int DEMOYEAR = 2015;

		Book b = new Book();
		b.setName("Мертвые души");
		b.setAuthors("Николай Гоголь");
		b.setCover("Мягкая");
		b.setPages(352);
		b.setPress("Книжный Клуб «Клуб Семейного Досуга»");
		b.setPrice(3.55);
		b.setYear(2016);
		
		Book b1 = new Book("Мастер и Маргарита", "Булгаков М.", "Фолио", 2017, 416, 5.44, "Твердая");
		Book b2 = new Book("Грозовой Перевал", "Бронте Э.", "Книжный Клуб «Клуб Семейного Досуга»", 2017, 416, 10.59, "Твердая ");
		Book b3 = new Book("Вокруг света в восемьдесят дней", "Жюль Габриэль Верн", "Азбука", 2016, 352, 4.19, "Твердая");
		Book b4 = new Book("Робинзон Крузо", "Даниель Дефо", "Азбука", 2018, 352, 3.15, "Твердая");
		Book b5 = new Book("Дон Кихот", "Мигель де Сервантес", "Азбука", 2018, 608, 8.75, "Твердая");
		Book b6 = new Book("Декамерон", "Боккаччо Дж.", "Фолио", 2017, 672, 11.0, "Твердая");
		Book[] allBooks = { b, b1, b2, b3, b4, b5, b6 };
		System.out.println("Books:\n");

		for (int i = 0; i < allBooks.length; i++) {
			System.out.println(allBooks[i].toString());
			System.out.println();
		}
		System.out.println("______________________________________________");
		BookArrayCreator bac = new BookArrayCreator();
		Book[] sortByAuthor = bac.byAuthor(DEMOAUTHOR, allBooks);
		System.out.println("Сортировать по авторам " + DEMOAUTHOR + ":\n");
		for (int i = 0; i < sortByAuthor.length; i++) {
			System.out.println("Book #" + (i + 1) + ":");
			System.out.println(sortByAuthor[i].toString());
			;
			System.out.println();
		}
		System.out.println("_______________________________________________");
		Book[] sortByPress = bac.byPress(DEMOPRESS, allBooks);
		System.out.println("Сортировать по издательству " + DEMOPRESS + ":\n");
		for (int i = 0; i < sortByPress.length; i++) {
			System.out.println("Book #" + (i + 1) + ":");
			System.out.println(sortByPress[i].toString());
			;
			System.out.println();
		}
		System.out.println("________________________________________________");
		Book[] sortByYear = bac.byYear(DEMOYEAR, allBooks);
		System.out.println("Сортировать по году публикации " + DEMOYEAR + ":\n");
		for (int i = 0; i < sortByYear.length; i++) {
			System.out.println("Book #" + (i + 1) + ":");
			System.out.println(sortByYear[i].toString());
			;
			System.out.println();
		}
	}
}