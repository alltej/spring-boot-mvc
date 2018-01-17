package alltej.springframework.services.security;

/**
 * Created by at on 12/14/16.
 */
public interface EncryptionService {
    String encryptString( String input );
    boolean checkPassword( String plainPassword, String encryptedPassword );
}
