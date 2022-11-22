import java.util.ArrayList;
import java.util.Scanner;

public class Mian {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 ArrayList<Student> studentList = new ArrayList<>();
		 ActionStudent action = new ActionStudent();
		Student student = action.inputStudent(sc);
		studentList.add(student);
		for(Student o: studentList) {
			System.out.println(o);
		}

}
}
