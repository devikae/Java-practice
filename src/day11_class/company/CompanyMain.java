package day11_class.company;

public class CompanyMain {
	public static void main(String[] args) {
		Company company = Company.getInstance();
		
		Worker minwoo = new Worker("민우", 32, 0, 7000, "사장");
		company.workerList.add(minwoo);
		
		Worker sangwoo = new Worker("상우", 31, 0, 5000 ,"이사");
		company.workerList.add(sangwoo);
		
		Worker chanung = new Worker("찬웅", 30);
		company.workerList.add(chanung);
		
//		for(int i = 0; i < company.workerList.size(); i++) {
//			System.out.println(company.workerList.get(i));
//		}
		
		company.showList();
		//회사의 연차를 늘려보자 
		company.addHistory(11);
		System.out.println("15년 후 ");
		company.showList();
		
		
		//해고 
		company.fireWorker(chanung);
		company.showList();
		
		sangwoo.quitCompany();
		company.showList();

		Worker JuSuk = new Worker("주석", 29, 3, 90000,"대표이사");
		company.workerList.add(JuSuk);
		company.showList();
		JuSuk.quitCompany();
		company.showList();
	
	} // 메인 
}
