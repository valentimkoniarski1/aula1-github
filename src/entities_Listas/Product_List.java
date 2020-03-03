package entities_Listas;

public class Product_List {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Product_List(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increase_Salary(double percentage) {
		salary += (percentage / 100) * salary;
		}
	
	public String toString() {
		return id
		+ ", "
		+ name
		+ ", "
		+ " otal: $ "
		+ String.format("%.2f", salary);
		}

}
