public class SwimmingSchool {
	
	public void training1(Stroke1 inst) {
		System.out.println("トレーニング１です。");
		inst.crawl();
		inst.breaststroke();
	}
	
	public void training2(Stroke1 inst) {
		System.out.println("トレーニング２です。");
		inst.backstroke();
		inst.butterfly();
	}
}