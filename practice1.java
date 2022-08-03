import java.util.Scanner;
class practice1{
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int a,b;
	System.out.print("enter number one: ");
	a=scan.nextInt();

	System.out.print("Enter number second: ");
	b=scan.nextInt();
	cal calcu = new cal();
	System.out.println("Addition: "+calcu.add(a,b));
	System.out.println("Subtraction: "+calcu.sub(a,b));
	System.out.println("Multiplication: "+calcu.mul(a,b));
	System.out.println("Division: "+calcu.div(a,b));
	}
}
class cal{
int add(int a,int b){
	return (a+b);
}
int sub(int a,int b){
	return (a-b);
}
int mul(int a,int b){
	return (a*b);
}
int div(int a,int b){
	return (a/b);
}

}


