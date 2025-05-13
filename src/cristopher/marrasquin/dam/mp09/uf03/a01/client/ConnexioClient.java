package cristopher.marrasquin.dam.mp09.uf03.a01.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import cristopher.marrasquin.dam.mp09.uf03.a01.config.Settings;
import cristopher.marrasquin.dam.mp09.uf03.a01.domain.Book;
import cristopher.marrasquin.dam.mp09.uf03.a01.view.BookView;

public class ConnexioClient {

	private Socket clientSocket;

	private ObjectInputStream objectInputStream;
	private ObjectOutputStream objectOutputStream;

	public void transmetre() throws UnknownHostException, IOException, ClassNotFoundException {
		clientSocket = new Socket(Settings.IP, Settings.PORT);

		// =============================
		System.out.println("C: Obrint streams ...");
		objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());
		objectInputStream = new ObjectInputStream(clientSocket.getInputStream());

		// =============================
		System.out.println("C: Esperant la transmissió del servidor ...");
		Book bookRebutServidor = (Book) objectInputStream.readObject();
		System.out.println("C: Hem rebut del servidor: " + bookRebutServidor.toString());

		// =============================
		System.out.println("C: Demanem a l'usuari les dades del llibre a transmetre");
		BookView bookView = new BookView();
		Book bookClient = bookView.getBook();
		System.out.println("C: Transmeterem aquest llibre: " + bookClient.toString());
		objectOutputStream.writeObject(bookClient);

		// =============================
		objectInputStream.close();
		objectOutputStream.close();
		clientSocket.close();
	}
}
