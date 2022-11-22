import java.util.Scanner;

public class ActionStudent {
	public Student inputStudent(Scanner sc) {
		 while (true){
	         try{
	             System.out.println("Mời b nhập tên: ");
	             String name = sc.nextLine();
	             System.out.println("Mời b nhập điểm toán: ");
	             double scoreMath = sc.nextDouble();
	             System.out.println("Mời b nhập điểm địa lý: ");
	             double scorePhysic = sc.nextDouble();
	             System.out.println("Mời b nhập điểm hóa học: ");
	             double scoreChemistry = sc.nextDouble();
	             double avg= (scoreMath+scorePhysic+scoreChemistry)/3;
	             System.out.println("điểm trug bình :"+avg);
	             double a1=(scoreMath/(scoreChemistry+scoreMath+scorePhysic)*100);
	             double a2=(scorePhysic/(scoreChemistry+scoreMath+scorePhysic)*100);
	             double a3=(scoreChemistry/(scoreChemistry+scoreMath+scorePhysic)*100);
	             if(avg>8) {
	            	 System.out.println("xếp loại A"+" và chiếm "+a1+"%");
	            	    
	             }else if(avg<8 && avg >6.5) {
	            	 System.out.println("xếp loại B"+" và chiếm "+a2+"%");
	             }else {
	            	 System.out.println("xếp loại C"+" và chiếm "+a3 +"%");
	             }
	   return new Student(name, scoreMath, scorePhysic, scoreChemistry);
	         } catch (Exception e){
	             System.out.println("Nhập sai kiểu dữ liệu , vui lòng nhập lại");
	         }
	     }
		  
	}
}
