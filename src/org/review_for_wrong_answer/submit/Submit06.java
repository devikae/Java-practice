package submit;
import java.util.Arrays;
public class Submit06 {

	public static void main(String[] args) {
		String[] nameList = {"�����", "����ö", "������", "�賲��", "Ȳ�޺���",
				"�̰���", "�����", "������", "�̹ο�", "����", "������", "�̿뼮", "�ڻ��",
				"������", "������", "���ּ�", "������", "��ö��", "�ſ���", "�̿���"};

		
		int name = 0;
		
		for(int i =0; i< nameList.length; i++) {
			char X = nameList[i].charAt(0);
			
			if(X == '��') {
				name += 1;
			}
	

			
			
		}
		System.out.println("�̾� ���� ���� ������� �� " + name + "�� �ֽ��ϴ�");
	}
}