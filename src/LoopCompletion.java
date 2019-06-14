import java.util.Scanner;

public class LoopCompletion {
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        int num, total = 0;
        for(int i=0; i<10; i++) {
            int count = (10-i);
            System.out.println("Enter a number ("+count+") remaining:  ");
            num = key.nextInt();
            total += num;
        }
        System.out.println("The total of all 10 numbers is:\t" + total);
    }
}
