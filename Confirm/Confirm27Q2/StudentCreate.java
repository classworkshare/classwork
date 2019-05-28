public class StudentCreate{
	Student  student;
	public Student inputStudent(){
		String   number,name;
		int      score;
		KeyboardInput  instKbin = new KeyboardInput();
		System.out.print("Šw¶”Ô†-->");
		number = instKbin.inputKeyboard();
		System.out.print("–¼-->");
		name = instKbin.inputKeyboard();
		System.out.print("“_”-->");
		score = Integer.parseInt(instKbin.inputKeyboard());
		return (new Student(number,name,score));
	}
}
