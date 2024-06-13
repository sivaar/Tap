package pojo;
import java.util.*;

class Employee {

	private int Id;
	private String Name;
	private int Phone;
	private int Salary;
	private String Address;
	
	
	public Employee() {
		
	}

	public Employee(int id, String name, int phone, int salary, String address) {
		
		this.Id = id;
		this.Name = name;
		this.Phone = phone;
		this.Salary=salary;
		this.Address = address;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	

}

public class pojo {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the no.of.objects");
		int n=scan.nextInt();
		 // Create an array to store Employee objects
        Employee[] employees = new Employee[n];
		
		for(int i=0;i<n;i++) {
			// creating object with respect to the i value and assign to the e for the reference
			employees[i] = new Employee();
			Employee e = employees[i];
		
		
		System.out.println("Enter the data for employee " + (i + 1));
		String data= scan.next();
		String arr[]= data.split(",");
		
		int id= Integer.parseInt(arr[0]);
		int phone= Integer.parseInt(arr[2]);
		int salary= Integer.parseInt(arr[3]);
		// Calling setters
		e.setId(id);
		e.setName(arr[1]);
		e.setPhone(phone);
		e.setSalary(salary);
		e.setAddress(arr[4]);
		}
		
		 // Print details of each Employee with calling getters
        for (int i = 0; i < n; i++) {
            Employee e = employees[i];
		System.out.println(e.getId()+","+e.getName()+","+e.getPhone()+","+e.getSalary()+","+e.getAddress());
		

	}

}}
