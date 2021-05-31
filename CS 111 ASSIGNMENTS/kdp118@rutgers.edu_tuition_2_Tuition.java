
public class Tuition {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  System.out.print("How many credits are you taking this semester? ");
  int credits = IO.readInt();
  System.out.print("Is the student a university employee? ");
  boolean isUniversityEmployee = IO.readBoolean();
  System.out.print("Is the student a state employee? ");
  boolean isStateEmployee = IO.readBoolean();
  System.out.print("Are payments to be made in installments? ");
  boolean isMadeInstallments = IO.readBoolean();
  
  if (credits < 0) {
   IO.reportBadInput();
   return;
  }
  
  double total = 5.75;
  credits = credits * 35;
  
  if (isStateEmployee) {
   total = total + (credits * 0.2);
   
  }else if (!isUniversityEmployee) {
   total = total + credits;
  }
  
  if (isMadeInstallments) {
   total = total + (total * 0.02);
  }
  
  IO.outputDoubleAnswer(total);
 }
}
 


