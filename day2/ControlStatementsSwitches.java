package week1.day2;

public class ControlStatementsSwitches {
	public static void main(String[] args) {
		 float successrate = 4.8f ;
		 String physicianName = "Dr.Siddarth";
		 String deptHead = "Oncology";
		 boolean isAvailable = false;
		 boolean isBoardCertified = true;
		 boolean isSurgeon = false;
		 char gender = 'M';
		 int since = 2019;
		 
		 switch (physicianName) {
         case "Dr.Siddarth":
             System.out.println("Doctor Name : " + physicianName);
             System.out.println("Head of : " + deptHead);
             System.out.println("Active from : " + since);
             System.out.println("Rating : " + successrate);
             System.out.println("Gender : " + gender);
             System.out.println("Certified : " + isBoardCertified);
             System.out.println("Surgeon : " + isSurgeon);
             System.out.println("Active : " + isAvailable);
             
             break;

         default:
             System.out.println("Doctor is not available");
             break;
     }
 }
}

