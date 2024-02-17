public class GreaterLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    boolean check = creditsEarned > creditsToGraduate;
    System.out.println(check);
    double creditsAfterSeminar;
    creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    System.out.println(creditsAfterSeminar);
    System.out.println(creditsToGraduate < creditsAfterSeminar);
	}
}