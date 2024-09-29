import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
        System.out.println("Enter you Name");
        System.out.println("First Name: ");
        String f_name = x.nextLine();


        System.out.println("Middle Name: ");
        String m_name = x.nextLine();

        System.out.println("Last Name: ");
        String l_name = x.nextLine();

        System.out.println("Output Is:");
        System.out.println(l_name + "," + f_name +" "+ m_name.charAt(0));


    }

}
