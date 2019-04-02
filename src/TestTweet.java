import java.util.ArrayList;
import java.util.Scanner;

public class TestTweet {
	// Gabriel Marques - 0050014723
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario usuario = new Usuario();
		ArrayList<Tweet> listTweets = new ArrayList<Tweet>();
		Scanner input = new Scanner(System.in);
		System.out.println("login:");
		usuario.setLogin(input.next());

		System.out.println("senha:");
		if (usuario.getSenha().equalsIgnoreCase(input.next())) {
			System.out.println("Acesso concedido");
			String sinal = "S";

			while (!sinal.equalsIgnoreCase("N")) {
				Tweet tweet = new Tweet();
				System.out.println("tweet:");
				tweet.setDescricao(input.next());
				listTweets.add(tweet);
				System.out.println("continuar S | sair N ");
				sinal = input.next();
			}
			usuario.setTweets(listTweets);
			for (Tweet tweet : listTweets) {
				System.out.println(tweet.getDescricao());
			}
		}
	}
}
