package dpr204;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.io.IOException;

public class AffineCipher {
	
	private int inverseOfaKey;


	
	private BigInteger akey;
	private int bkey;
	
	
	public AffineCipher(int key1, int key2)
	   {
		
		//akey = key1;
		bkey = key2;
		
		
		BigInteger aKeyBig = new BigInteger(Integer.toString(key1));
		
		akey = aKeyBig;
		
		
		inverseOfaKey = aKeyBig.modInverse(new BigInteger(Integer.toString(256))).intValueExact();
		
	   }
	
	
	
	
	
	/**
    Encrypts the contents of a stream.
    @param in the input stream
    @param out the output stream
 */      
	public void encryptStream(InputStream in, OutputStream out)
       throws IOException{
		
		boolean done = false;
    
		while (!done){
			int next = in.read();
			if (next == -1){ 
          done = true; 
			}
			else{
				int encrypted = encrypt(next);
				out.write(encrypted);
			}
		}
	}
	
	public void decryptStream(InputStream in, OutputStream out) 
		throws IOException{
		// TODO fill out method
		boolean done = false;
	    
	    while (!done){
	       int next = in.read();
	       if (next == -1){ 
	          done = true; 
	       }
	       else{
	          int decrypted = decrypt(next);
	          out.write(decrypted);
	       }
	    }
		
	}
	
	
	public int decrypt(int b){
		Integer x = ((b-bkey)*(inverseOfaKey)) % 256;
		return x;
	}
	
	
	public int encrypt(int x) { 
		int val = ((akey.intValue() * x) + bkey) % 256;
		return val;
		}
	
}
