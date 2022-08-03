class main{
	public static void main(String[] args){
	student s1 = new student("Ahmed","21TL093",2019);
	student s2 = new student("Fahad","21TL091",2018);
	s1.display();
	s2.display();
	}
}
class student{
	String name;
	String rollno;
	int year;
	student(String name,String rollno, int year){
		this.name = name;
		this.rollno = rollno;
		this.year = year;

	}
	void display(){
		System.out.println("Name: "+this.name);
		System.out.println("Rollno: "+this.rollno);
		System.out.println("Year: "+this.year);
	}
	void set_name(String name){
		this.name = name;

	}
	 String get_name(){
	 	return (this.name);
	 }
	void set_rollno(String rollno){
		this.rollno = rollno;

	}
	 String get_rollno(){
	 	return (this.rollno);
	 }
	void set_year (int year){
		this.year = year;
	}
	 int get_year(){
	 	return (this.year);
	 }
}