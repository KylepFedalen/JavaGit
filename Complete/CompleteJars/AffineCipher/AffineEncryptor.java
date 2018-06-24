package dpr204;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AffineEncryptor {
	public static void main(String[] args){
		 
		Scanner in = new Scanner(System.in);
	      try
	      {  
	    	 System.out.println("Enter 1 or 2: ");
	     	 System.out.println("1 - Encrypt");
	     	 System.out.println("2 - Decrypt");
	     	 System.out.print(">>");
	     	 int en = in.nextInt();
	     	 
	     	 if(en == 1){
	     		 System.out.print("Input file: ");
		         String inFile = in.next();
		         System.out.print("Output file: ");
		         String outFile = in.next();
		         System.out.print("Encryption key 1 (+/- 1..255): ");
		         int key1 = in.nextInt();
		         System.out.print("Encryption key 2 (* 1..255): ");
		         int key2 = in.nextInt();
		                 
		         InputStream inStream = new FileInputStream(inFile);
		         OutputStream outStream = new FileOutputStream(outFile);

		         AffineCipher cipher = new AffineCipher(key1,key2);
		         cipher.encryptStream(inStream, outStream);

		         inStream.close();
		         outStream.close();
	     	 }else if(en == 2){
	     		 System.out.print("Input file: ");
		         String inFile = in.next();
		         System.out.print("Output file: ");
		         String outFile = in.next();
		         System.out.print("Encryption key 1 (+/- 1..255): ");
		         int key1 = in.nextInt();
		         System.out.print("Encryption key 2 (* 1..255): ");
		         int key2 = in.nextInt();
		         
		         InputStream inStream = new FileInputStream(inFile);
		         OutputStream outStream = new FileOutputStream(outFile);
		         
		         AffineCipher cipher = new AffineCipher(key1,key2);
		         cipher.decryptStream(inStream, outStream);
		         
		         inStream.close();
		         outStream.close();
	     		 
	     	 }
	    	  
	         
	      }catch(InputMismatchException e){
	    	  System.out.println("input type error: " + e);
	      }
	      catch (IOException exception){  
	         System.out.println("Error processing file: " + exception);
	      }finally{
	     	 in.close();
	      }
	}
}
