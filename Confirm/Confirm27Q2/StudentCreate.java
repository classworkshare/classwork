public class StudentCreate{
	Student  student;
	public Student inputStudent(){
		String   number,name;
		int      score;
		KeyboardInput  instKbin = new KeyboardInput();
		System.out.print("学生番号-->");
		number = instKbin.inputKeyboard();
		System.out.print("氏名-->");
		name = instKbin.inputKeyboard();
		System.out.print("点数-->");
		score = Integer.parseInt(instKbin.inputKeyboard());
		return (new Student(number,name,score));
	}
}
