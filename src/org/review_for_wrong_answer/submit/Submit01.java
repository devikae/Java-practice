package submit;

public class Submit01 {

	public static void main(String[] args) {
		int i = 23;
		double x = 24.2;
		String y = "32";
		
		System.out.println((double)i); // ���� >> �Ǽ� 
		
		System.out.println((int)x);   // �Ǽ� >> ����  
		
		String i1 = Integer.toString(i);            //���� Ÿ�� > ���ڿ��� 
		
		System.out.println(i1);
		
//		System.out.println(i1 + 34);
		
		int x1 = Integer.parseInt(i1);  // ���ڿ� > ����
		
//		System.out.println(x1 + 9898);
		
		
		final int I = 99;             //��� ���� 
		final double X = 99.99;
		final String Y = "����";
		
		System.out.println("��� int " + I);
		System.out.println("��� double "+X);
		System.out.println("��� String " + Y);
		
		
	}

}