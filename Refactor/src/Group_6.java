
public class Group_6 {
 class student {
	 String ten;
	 int id;
	 int phone;
	 int address;
	 int GPA;
	 student(){}
	 
	 student(String ten,int id,int GPA){
		 this.ten=ten;
		 this.id=id;
		 this.GPA=GPA;
	 }
	public int getGPA() {
		return this.GPA;
	}
	public String getTen() {
		return this.ten;
	}
	public void Display(int id, String name ,int address,int GPA,int phone) {
		System.out.print(id+name+address+GPA+phone);
	}
	String xepLoai(int math,int chemistry ,int physics ) {
		if((math+chemistry+physics)/3<5)
			return "trung binh";
		if((math+chemistry+physics)/3<8)
			return "Kha";
		else return "Gioi";
	}
	int Thuong() {
			return 100000*GPA;
	}
	int Max2(int math,int chemistry ){
		if(math>chemistry)
			return math;
		else return chemistry;
	}
	int Max3(int math,int chemistry ,int physics) {
		if(math>physics)
			if(math>chemistry)
			return math;
		else
			return chemistry;
		else if(physics>chemistry)
			return physics;
		return chemistry;
	}
	}
}

