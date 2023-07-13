import java.util.Scanner;

public class CtoFTable {

    public static <Int> void main(String[] args) {
        double i;
        for (i=-100;i<=100;i++) {
            System.out.println("|" + "\t" + i + "\t" + "|" + "\t" + SafeInput.CtoF(i) + "\t" + "|");
        }
    }
}

