/*
 * This class will Encode an English text with the given offset.
 * If the offset is 1 then all 'a' letters are replaced with 'b', 'b' with 'c', etc.
 * If the offset is -1 then all 'a' letters are replaced with 'z', 'b' with 'a', etc.
 * @author-Ramshiromani
 * @Version 1.0
 */
public class OffsetEncoding {
/*
 * @input 
 * offset- Can Be positive or negative value 
 * original- String in small Letter
 * @Output- It will return the new String 
 */
	public static String encode(int offset, String original) {
		StringBuilder result = new StringBuilder(); 
	      if(offset<0) 
	        offset=26+offset;

	      for(int i=0;i<original.length();i++){ 
	         result.append((char)('a'+(original.charAt(i)-'a'+offset)%26)); 
	      }

	      return result.toString();
		}
	public static void main(String[] args) {
		System.out.println(encode(2,"y"));
		System.out.println(encode(-1,"test"));

	}

}
