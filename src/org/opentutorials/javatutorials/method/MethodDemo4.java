package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
	
	//�޼ҵ带 �����ϰ�ʹٸ� �޼ҵ��� ���Ǻ��ٴ� �޼ҵ带 ��� ����ϴ��� ���� ���°� ����
	// ��� �����ϰ� �Է°��� �������� ��°��� �������� �����غ��� 
	
	
	//           ������ String�� 
	// �ѹ����̶�� �޼ҵ�� �ݵ�� ���ڿ��� �����ϰ� �ȴٴ� �ǹ�
	public static String numbering(int init, int limit) {
        int i = init;
        // ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־���.
        String output = "";
        while (i < limit) {
            // ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
            output += i;
            i++;
        }
        // �߿�!!! output�� ��� �ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ��� �Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ����
        // ��ġ�ϸ� �ȴ�.
        return output; // ������ ������ "������ ����" ��Ű�� ���� ���� �ܺη� ��ȯ��Ų��
    }
 
    public static void main(String[] args) {
        // �޼ҵ� numbering�� ������ ���� ���� result�� ����.
        String result = numbering(1, 5); //numbering�� 1��, ��5�� �־ ȣ��
        // ���� result�� ���� ȭ�鿡 ����Ѵ�.
        System.out.println(result);
    }
}