package com.gl.trans.algo;

import java.security.spec.KeySpec;
import java.util.Base64;
import java.util.Random;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class PasswordHasherImpl implements PasswordHasher 
{

	private static Logger logger = Logger.getRootLogger();

	private static final String SALT = null ;


	@Override
	public String hashPassword(String password) {

		try {

			byte[] salt=getSalt();
			String pwdStored = getHash("password",salt);

			//Scanner sc= new Scanner(System.in);
			//System.out.println("Enter the Password");

			// String pwd=sc.next();
			String passwordIn = getHash(password,salt);

			if(passwordIn.endsWith(pwdStored)) {

				logger.debug("Success");
			}
			else {
				System.out.println("FAIL");
			}
		} 
		catch (Exception e) {

			e.printStackTrace();             

		}


		return password;
	}

	public static byte[] getSalt() {

		Random random= new Random();
		byte[] salt=new byte[16];
		random.nextBytes(salt);
		return salt;


	}

	public static String getHash(String password,byte[] salt) {

		try {

			KeySpec spec= new PBEKeySpec(password.toCharArray(),salt,65536,128);

			SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
			byte[] hash=factory.generateSecret(spec).getEncoded();

			Base64.Encoder base64Encoder=Base64.getEncoder();
			String strSalt=base64Encoder.encodeToString(salt);
			String strHash=base64Encoder.encodeToString(hash);
			System.out.println("Salt :" + strSalt);
			System.out.println("Hash :" + strHash);

			return strHash;



		} catch (Exception e) {

			e.printStackTrace();

		}
		return null;


	}


}
