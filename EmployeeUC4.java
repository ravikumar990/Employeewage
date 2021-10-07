/**
 *  Solving using Switch Case Statement
 *
 *
 */
public class EmployeeUC4 {
public static void main(String[] args) {
	double empcheck=(int)Math.floor(Math.random()*10)%3;
    int emp = (int)empcheck;
	switch (emp) {
	case 1:
		System.out.println("emp is present full time ");
		int sal=8*20;
		System.out.println("emp salary today is "+sal);
		break;
	case 2:
		System.out.println("emp is present parttime time ");
		int salery=4*20;
		System.out.println("emp salary today is "+salery);
		break;
	default:
		System.out.println("emp is absent today");
	}
}
}
