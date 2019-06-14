public class Empl2 {
	
	private int emplNo;
	private String depart;
	private String name;
	private int salary;

	Empl2(int emplNo, String depart, String name, int salary) {
		this.emplNo = emplNo;
		this.depart = depart;
		this.name = name;
		this.salary = salary;
	}

	public int getEmplNo() {
		return emplNo;
	}

	public String getDepart() {
		return depart;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
}