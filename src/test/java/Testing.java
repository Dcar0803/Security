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
	 
}//end of test class 
