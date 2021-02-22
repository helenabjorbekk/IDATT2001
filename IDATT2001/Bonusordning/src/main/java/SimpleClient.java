import java.time.LocalDate;
import java.util.Scanner;

public class SimpleClient {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        MembershipArchive SAS = new MembershipArchive();

        boolean run = true;

        while(run){
            System.out.println("[1] register new Membership\n" +
                    "[2] print member details\n" +
                    "[3] register new bonuspoints\n" +
                    "[0] exit program");
            int userChoice = s.nextInt();

            switch (userChoice){
                case 1:
                    System.out.println("Enter your name: ");
                    s.next();
                    String inputName = s.nextLine();

                    System.out.println("Enter your email address: ");
                    String inputEmail = s.next();

                    System.out.println("Enter your membernumber: ");
                    int memberNr = s.nextInt();
                    LocalDate inputDate = LocalDate.now();

                    System.out.println("Choose a password: ");
                    String inputPassword = s.next();
                    if(SAS.addMember(memberNr, inputDate, inputName, inputEmail, inputPassword)){
                        System.out.println("Member was successfully registered!");
                    }else{
                        System.out.println("Member was not successfully registered. Try again.");
                    }
                    break;
                case 2:
                    System.out.println("Enter membernumber to get details: ");
                    int inputMemberNr = s.nextInt();
                    BonusMember user = SAS.findMember(inputMemberNr);
                    if(user == null){
                        System.out.println("could not find member");
                    }else{
                        System.out.println(user.toString());
                    }
                    break;
                case 3:
                    System.out.println("Enter membernumber: ");
                    int inputMemberNr_2 = s.nextInt();
                    System.out.println("Add points: ");
                    int pointsAdded = s.nextInt();
                    if(SAS.registerPoint(inputMemberNr_2, pointsAdded)){
                        System.out.println("successfully registered!");
                    } else{
                        System.out.println("oops.. Try again!");
                    }
                    break;
                case 0:
                    run = false;
                    System.out.println("exiting..");
                    break;
                default:
                    System.out.println("please enter a valid option");
            }
        }
    }
}
