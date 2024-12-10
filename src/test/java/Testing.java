import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;

class Testing {

	 @Test
	    void testHashString() throws NoSuchAlgorithmException {
		 
	        String input = "testString";
	        
	        String hashed = SecurityUtils.hashString(input, HashAlgorithm.SHA256);
	        
	        assertNotNull(hashed);
	        
	    }//end of testHashString
	 
	 
	 @Test
	    void testMatchesHash() throws NoSuchAlgorithmException {
	        
		 String input = "password123";
	        
	        String hash = SecurityUtils.hashString(input, HashAlgorithm.SHA256);
	       
	        assertTrue(SecurityUtils.matchesHash(input, hash, HashAlgorithm.SHA256));
	       
	        assertFalse(SecurityUtils.matchesHash("wrongPassword", hash, HashAlgorithm.SHA256));
	    
	 }//end of testMatchesHash 
	 
	 
	 @Test
	    void testGenerateSaltedHash() throws NoSuchAlgorithmException {
		 
	        String input = "test";
	        
	        String salt = "randomSalt";
	        
	        String saltedHash = SecurityUtils.generateSaltedHash(input, salt, HashAlgorithm.MD5);
	        
	        assertNotNull(saltedHash);
	        
	        assertNotEquals(SecurityUtils.hashString(input, HashAlgorithm.MD5), saltedHash);
	    
	 }//end of testGenerateSaltedHash
	 
}//end of test class 
