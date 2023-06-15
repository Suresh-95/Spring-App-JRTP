package in.ashokit.beans;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodeDecodeUtils {
	
	
	public String encode(String text) {
		Encoder encoder = Base64.getEncoder();
		String encodeToString = encoder.encodeToString(text.getBytes());
		return encodeToString;
	}
	
	public String decode(String encodeStr) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeStr);
		return new String(decode);
		
	}
	
//	public static void main(String[] args) {
//		EncodeDecodeUtils utils = new EncodeDecodeUtils();
//		String encode = utils.encode("suresh");
//		String decode = utils.decode(encode);
//		System.out.println(encode);
//		System.out.println(decode);
//	}
}
