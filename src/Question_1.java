import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String name = x.nextLine();
        if(name.length()%2==1){
            System.out.println("Middle Character is "+"'"+name.charAt(name.length()/2)+"'");
        }
        else{
            System.out.println("Try again!! Input Word has Even Characters ");
        }


    }
}
