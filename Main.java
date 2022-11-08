public class Main {
	public static void main (String[] args){
		System.out.println("身長と体重を入力してください。");
		System.out.print("身長:");
		int height = new java.util.Scanner(System.in).nextInt();
		System.out.print("体重:");
		int waight = new java.util.Scanner(System.in).nextInt();

		double result = waight/height^2;
		
		System.out.println("BMIは"+String.format("%.2f",result));
	}
}
