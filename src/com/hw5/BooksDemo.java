package com.hw5;

public class BooksDemo {

	public static void main(String[] args) {
		
		final String DEMOAUTHOR = "������ �.";
		final String DEMOPRESS = "������� ���� ����� ��������� ������";
		final int DEMOYEAR = 2017;

		Book b = new Book();
		b.setName("������� ����");
		b.setAuthors("������� ������");
		b.setCover("������");
		b.setPages(352);
		b.setPress("������� ���� ����� ��������� ������");
		b.setPrice(3.55);
		b.setYear(2016);
		
		Book b1 = new Book("������ � ���������", "�������� �.", "�����", 2017, 416, 5.44, "�������");
		Book b2 = new Book("�������� �������", "������ �.", "������� ���� ����� ��������� ������", 2017, 416, 10.59, "������� ");
		Book b3 = new Book("������ ����� � ����������� ����", "���� �������� ����", "������", 2016, 352, 4.19, "�������");
		Book b4 = new Book("�������� �����", "������� ����", "������", 2018, 352, 3.15, "�������");
		Book b5 = new Book("��� �����", "������ �� ���������", "������", 2018, 608, 8.75, "�������");
		Book b6 = new Book("���������", "�������� ��.", "�����", 2017, 672, 11.0, "�������");
		Book[] allBooks = { b, b1, b2, b3, b4, b5, b6 };
		System.out.println("Books:\n");

		for (int i = 0; i < allBooks.length; i++) {
			System.out.println(allBooks[i].toString());
			System.out.println();
		}
		System.out.println("=============================================");
		BookArrayCreator bac = new BookArrayCreator();
		Book[] sortByAuthor = bac.byAuthor(DEMOAUTHOR, allBooks);
		System.out.println("����������� �� ������� " + DEMOAUTHOR + ":\n");
		for (int i = 0; i < sortByAuthor.length; i++) {
			System.out.println("Book #" + (i + 1) + ":");
			System.out.println(sortByAuthor[i].toString());
			;
			System.out.println();
		}
		System.out.println("=============================================");
		Book[] sortByPress = bac.byPress(DEMOPRESS, allBooks);
		System.out.println("����������� �� ������������ " + DEMOPRESS + ":\n");
		for (int i = 0; i < sortByPress.length; i++) {
			System.out.println("Book #" + (i + 1) + ":");
			System.out.println(sortByPress[i].toString());
			;
			System.out.println();
		}
		System.out.println("=============================================");
		Book[] sortByYear = bac.byYear(DEMOYEAR, allBooks);
		System.out.println("����������� �� ���� ���������� " + DEMOYEAR + ":\n");
		for (int i = 0; i < sortByYear.length; i++) {
			System.out.println("Book #" + (i + 1) + ":");
			System.out.println(sortByYear[i].toString());
			;
			System.out.println();
		}
	}
}