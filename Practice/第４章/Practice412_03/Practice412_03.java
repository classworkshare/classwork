public class Practice412_03 {
	public static void main(String[] args) {
		
		Kenji kenji = new Kenji();
		Kenzou kenzou = new Kenzou();
		
		SwimmingSchool school = new SwimmingSchool();
		
		school.training1(kenji);
		school.training1(kenzou);
		school.training2(kenji);
		school.training2(kenzou);
	}
}