class main{
	public static void main(String [] args){
		example one = new example(3,5);
		one.set_age(4);
		System.out.println(one.get_age());
		System.out.println("static member of class: "+example.c);
		example two = new example(2,0);
		System.out.println("static member of class: "+example.c);
	}
}
public class example{
	int age=0;
	public static int c=0;
	example(int a,int b){
		c += a+b;
	}
	void set_age(int age){
		this.age = age;
	}
	int get_age(){
		return this.age;

	}

}