import java.security.MessageDigest;
import java.util.Base64; 
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;


public class SecurityUtils {
	
	
	/**
     * Hashes a given input string using the specified algorithm.
     * 
     * @param input The string to be hashed.
     * @param algorithm The hashing algorithm (MD5, SHA1, SHA256).
     * @return The hashed string in Base64 format.
     * @throws NoSuchAlgorithmException If the hashing algorithm is not supported.
     */
	
	 public static String hashString(String input, HashAlgorithm algorithm) throws NoSuchAlgorithmException {
	        
		    MessageDigest digest = MessageDigest.getInstance(algorithm.name().replace("SHA1", "SHA-1"));
	        
	        byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
	        
	        return Base64.getEncoder().encodeToString(hash);
	    
	 }//end of hashString method 
	 
	 
	 /**
	     * Checks if the given input string matches a given hash using the specified algorithm.
	     * 
	     * @param input The string to be hashed and checked.
	     * @param hash The hash to compare against.
	     * @param algorithm The hashing algorithm (MD5, SHA1, SHA256).
	     * @return True if the input matches the hash; false otherwise.
	     * @throws NoSuchAlgorithmException If the hashing algorithm is not supported.
	     */
	 
	 
	 public static boolean matchesHash(String input, String hash, HashAlgorithm algorithm) throws NoSuchAlgorithmException {
	        
		 String computedHash = hashString(input, algorithm);
	        
	        return computedHash.equals(hash);
	    
	 }//end of matchesHash

}//end of securityUtils class 
