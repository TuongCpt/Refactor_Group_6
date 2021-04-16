

public class Refactoring {
 class student {
	 String name;
	 int id;
	 int phone;
	 int address;
	 int GPA;
	 student(){}
	 
	 student(String ten,int id,int GPA){
		 this.name=ten;
		 this.id=id;
		 this.GPA=GPA;
	 }
	public int getGPA() {
		return this.GPA;
	}
	public String getTen() {
		return this.name;
	}
	public void Display() {
		//ham hien thi thong tinh hoc sinh
		System.out.print(id+name+address+GPA+phone);
	}
	String xepLoai(int math,int chemistry ,int physics ) {
		//ham xep loai hoc sinh dua tren diem trung binh
		int Diemtb=(math+chemistry+physics)/3;
		if(Diemtb<5)
			return "trung binh";
		if(Diemtb<8)
			return "Kha";
		else return "Gioi";
	}
	double Thuong() {
		//ham tinh so tien thuong
		final double bouns=100000;
			return bouns*GPA;
	}
	int Max2(int math,int chemistry ){
		//ham tim mot trong hai mon hoc co diem so cao nhat
		if(math>chemistry)
			return math;
		else return chemistry;
	}
	int Max3(int math,int chemistry ,int physics) {
		//ham tim mon hoc co diem so cao nhat
		return Max2(Max2(math,chemistry),physics);
	}
	}
}
