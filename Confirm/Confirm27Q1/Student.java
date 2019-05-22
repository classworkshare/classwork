public class Student{
	
    private String number;
    private String name;
    private int    score;
    
    public Student(String number,String name,int score){
        this.number = number;
        this.name = name;
        this.score = score;
    }
    
    public String getNumber(){
        return number;
    }
    
    public String getName(){
        return name;
    }
    
    public int getScore(){
        return score;
    }
}