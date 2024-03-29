package vk.com.kafka.springbootkafkaproducerexample.model;

public class User {
	
	private String name;
	private String department;
	private long salary;
	
	public User(String name, String department, long salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
}
