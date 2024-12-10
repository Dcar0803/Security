import java.security.MessageDigest;
import java.util.Base64; 
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;


public class SecurityUtils {
	
	 public static String hashString(String input, HashAlgorithm algorithm) throws NoSuchAlgorithmException {
	        
		    MessageDigest digest = MessageDigest.getInstance(algorithm.name().replace("SHA1", "SHA-1"));
	        
	        byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
	        
	        return Base64.getEncoder().encodeToString(hash);
	    
	 }//end of hashString method 

}//end of securityUtils class 
