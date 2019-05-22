public class Practice412_02 {
	public static void main(String[] args) {
		
		Triangle tri = new Triangle();
		tri.apexes = 3;
		
		Square squ = new Square();
		squ.apexes = 4;
		
		AboutFigures afig = new AboutFigures();
		
		afig.showFigure(tri);
		afig.showFigure(squ);
	}
}