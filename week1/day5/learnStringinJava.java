package week1.day5;

public class learnStringinJava {

	

		
		private static final String KM = null;
		// TODO Auto-generated method stub
		String MM="MARK MANI";
		String MM2="MARK MANI";
		
		char BM='a';
		
		
		public static void main(String[] args) {
			String BTM=new String("MANI ONE MAN ARMY");
            String KM=new String("WELCOME TO GREAT KIRIKALAN SHOW");
			int length=BTM.length();
		System.out.println(length);
		char[] charArray=BTM.toCharArray();
		System.out.println(charArray);
		System.out.println("MANI ONE MAN ARMY"+BTM);
		System.out.println(BTM.charAt(2));
		System.out.println(BTM.contains("MANI ONE MAN ARMY"));
		System.out.println(BTM.indexOf("a"));
		System.out.println(BTM.equalsIgnoreCase(KM));
		System.out.println(BTM==KM);
	 //String[] split = BTM.split(" ");
		System.out.println(BTM.toLowerCase());
		System.out.println(BTM.toUpperCase());
		System.out.println("KING OF BATTLE"+" "+BTM.toUpperCase());
		
		
	}

}
