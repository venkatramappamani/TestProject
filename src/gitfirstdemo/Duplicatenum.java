package gitfirstdemo;

public class Duplicatenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="automation";
		int len=str.length();
		char []ch=str.toCharArray();
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
				}
			}
	}

	}
}
