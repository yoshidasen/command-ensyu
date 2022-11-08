public class Main {
	public static void main (String[] args){
		
		System.out.println("二人の身長と体重を入力してください。");
		
		System.out.print("1人目身長:");
		int height1 = new java.util.Scanner(System.in).nextInt();
		System.out.print("1人目体重:");
		int waight1 = new java.util.Scanner(System.in).nextInt();
		double result1 = waight1/height1^2;

		System.out.print("2人目身長:");
                int height2 = new java.util.Scanner(System.in).nextInt();
                System.out.print("2人目体重:");
                int waight2 = new java.util.Scanner(System.in).nextInt();
                double result2 = waight2/height2^2;
		
		System.out.println("1人目のBMIは"+String.format("%.2f",result1));
		System.out.println("2人目のBMIは"+String.format("%.2f",result2));
	}
}
