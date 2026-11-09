package hackerRank;


public class LexographicOFString {

	public static void main(String[] args) {
		// s=welcometojava
		//output=ava
				//wel
		String s="WELCOMETOJAVA";
		int k=3;
		String small=s.substring(0,k);
		String large=s.substring(0,k);
		for(int i=0;i<=s.length()-k;i++) {
			String current=s.substring(i,i+k);
			if(current.compareTo(small)<0) {
				small=current;
			}
			if(current.compareTo(large)>0) {
				large=current;
			}
			
		}
		System.out.println(small+"\n"+large);
	}

}
