package exception;

public class SpotifyException extends RuntimeException {

    public SpotifyException() {
        super("Erro ao consumir a API Spotify.");
    }

}
