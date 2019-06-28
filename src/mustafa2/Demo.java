package mustafa2;

public class Demo {
	String name;
	String lastName;
	int age;
	int salary;
	Demo(String name, String lastName, int age, int salary) {
this.name=name;
this.lastName=lastName;
this.age=age;
this.salary=salary;
	} void method1() {
		System.out.println(this.name+" "+this.lastName+" "+this.age+
				" "+this.salary);
	}
}
