package cristopher.marrasquin.dam.mp09.uf03.a01.view;

import java.util.Scanner;
import cristopher.marrasquin.dam.mp09.uf03.a01.domain.Book;
public class BookView {

	public Book getBook() {
		
		System.out.println("Introdueix les dades del llibre...");
		Book b = new Book();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Títol:");
		b.setTitle(scanner.nextLine());

		System.out.println("Autor:");
		b.setAuthor(scanner.nextLine());

		scanner.close();
		return b;

	}

}
