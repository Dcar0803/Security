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
	 
}//end of test class 
