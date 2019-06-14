public class Country {
	
	String name;
	double population;

	public Country() {
		name = "日本";
		population = 1.3;
	}

	public Country(String name, double population) {
		this.name = name;
		this.population = population;
	}

	public void show() {
		System.out.println(name + "の人口は" + population + "億人です。");
	}
}