public class Main {
	public static void main (String[] args){
		
		System.out.println("��l�̐g���Ƒ̏d����͂��Ă��������B");
		
		System.out.print("1�l�ڐg��:");
		int height1 = new java.util.Scanner(System.in).nextInt();
		System.out.print("1�l�ڑ̏d:");
		int waight1 = new java.util.Scanner(System.in).nextInt();
		double result1 = waight1/height1^2;

		System.out.print("2�l�ڐg��:");
                int height2 = new java.util.Scanner(System.in).nextInt();
                System.out.print("2�l�ڑ̏d:");
                int waight2 = new java.util.Scanner(System.in).nextInt();
                double result2 = waight2/height2^2;
		
		System.out.println("1�l�ڂ�BMI��"+String.format("%.2f",result1));
		System.out.println("2�l�ڂ�BMI��"+String.format("%.2f",result2));
	}
}
