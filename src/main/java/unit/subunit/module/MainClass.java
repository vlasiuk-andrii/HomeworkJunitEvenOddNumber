package unit.subunit.module;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] arg) {
        System.out.println("Enter your number:");
        MainClass operator=new MainClass();
        int value = operator.enter();
        operator.evenOdd(value);
    }
    public int enter(){
        int n=0;
        Scanner sc=new Scanner(System.in);
        n = Integer.parseInt(sc.next());
        return n;
    }
    public boolean evenOdd(int n){
        if((n%2)==0){
            return true;
        }
        else{
            return false;
            }
    }
}
