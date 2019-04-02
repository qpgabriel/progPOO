import java.util.ArrayList;
public class Usuario {
	// Gabriel Marques - 0050014723
	private String login;
	private String senha = "POO";
	private ArrayList<Tweet> tweets;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ArrayList<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(ArrayList<Tweet> tweets) {
		this.tweets = tweets;
	}
	
	public void addTweet(String tweet) {
		Tweet t = new Tweet();
		t.setDescricao(tweet);
		tweets.add(t);
	}
	
	
}
