package app;

public class StringUtil {
	
	//Retorna se a String est� fazia ou n�o
	public static boolean isEmpty(String s) {
		if(s == null) {
			return true;
		}
		
		s = s.trim();
		return s.length() == 0;
	}
	
	//Inverte a ordem dos caracteres da String se for fabio fica oibaf
	public static String reverse(String s) {
		if(s == null) {
			return s;
		}
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
	
}//FIM
