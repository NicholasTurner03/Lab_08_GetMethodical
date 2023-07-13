import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sSN = SafeInput.getRegExString(in, "Please enter your SSN","\\d{3}-\\d{2}-\\d{4}");
        String mNum = SafeInput.getRegExString(in, "Please enter your M Number","(M|m)\\d{8}");
        String menuChoice = SafeInput.getRegExString(in, "Please enter a menu choice (O,S,V,Q)", "[OoSsVvQq]");
        switch (menuChoice){
            case "O","o"->{
                menuChoice="open";

            }
            case "V","v"->{
                menuChoice="view";
            }
            case "S","s"->{
                menuChoice="save";
            }
            case "Q","q"->{
                menuChoice="quit";
            }
        }
        System.out.println("Your SSN is "+sSN+", your M number is "+mNum+", and your menu choice is "+menuChoice+".");
    }
}
