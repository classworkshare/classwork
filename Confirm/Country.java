public class Country {
	
	String name;
	double population;

	public Country() {
		name = "���{";
		population = 1.3;
	}

	public Country(String name, double population) {
		this.name = name;
		this.population = population;
	}

	public void show() {
		System.out.println(name + "�̐l����" + population + "���l�ł��B");
	}
}