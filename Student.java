
public class Student {
	private static int autoId=0;
	private int id;
	private String name;
	private double scoreMath;
	private double  scorePhysic;
	private double scoreChemistry;
	public Student(String name, double scoreMath, double scorePhysic, double scoreChemistry) {
		this.id=++autoId;
		this.name = name;
		this.scoreMath = scoreMath;
		this.scorePhysic = scorePhysic;
		this.scoreChemistry = scoreChemistry;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", scoreMath=" + scoreMath + ", scorePhysic=" + scorePhysic
				+ ", scoreChemistry=" + scoreChemistry + "]";
	}
	
	
	
	
	

}
