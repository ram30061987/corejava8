package java8programs;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String words="ram badan chaudhari";
  char[] c=words.toCharArray();
  for(int i=c.length-1;i>=0;i--){
	  System.out.print(c[i]);
  }
	}

}
