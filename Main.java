public class Main {
	public static void main (String[] args){
		System.out.println("�g���Ƒ̏d����͂��Ă��������B");
		System.out.print("�g��:");
		int height = new java.util.Scanner(System.in).nextInt();
		System.out.print("�̏d:");
		int waight = new java.util.Scanner(System.in).nextInt();

		double result = waight/height^2;
		
		System.out.println("BMI��"+String.format("%.2f",result));
	}
}
