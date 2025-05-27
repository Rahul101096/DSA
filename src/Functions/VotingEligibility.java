package Functions;

public class VotingEligibility {
    public static void main(String[] args) {
        // Example usage of the checkVotingEligibility method
        int age = 20; // Example age
        boolean isEligible = checkVotingEligibility(age);
        if (isEligible) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
    public static boolean checkVotingEligibility(int age) {
        if (age >= 18) {
            return true; // Eligible to vote
        } else {
            return false; // Not eligible to vote
        }
    }
//    Scanner sc=new Scanner(System.in);
//    int age=sc.nextInt();
//    checkVotingEligibility(age);
//}
//public static void checkVotingEligibility(int age) {
//    if(age>=18) {
//        System.out.println("Eligibal for Voting");
//    } else {
//        System.out.println("Not eligibal for Voting");
//    }

}

