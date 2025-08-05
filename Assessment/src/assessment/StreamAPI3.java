package assessment;
import java.util.*;
import java.util.stream.*;
class Employee
{
	int empno;
	String name;
	int salary;
	Employee(int empno,String name,int salary)
	{
		this.empno=empno;
		this.name=name;
		this.salary=salary;
	}
}
public class StreamAPI3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> e=new ArrayList<Employee>();
		e.add(new Employee(100,"jhon",18000));
		e.add(new Employee(101,"varun",10000));
		e.add(new Employee(102,"riya",16000));
		List<Employee> e2=e.stream().filter(emp->emp.salary >15000).collect(Collectors.toList());
	    for(Employee employee: e2)
	    	System.out.println(employee.name);

	}

}
