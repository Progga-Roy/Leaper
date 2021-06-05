import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int y;
        System.out. print("Enter year =");
     y=input.nextInt();
     if (y%4==0)
     {
        System.out. printf(" %d is Leaper",y);
     }
        else if (y%100==0)
        {
            System.out. printf(" %d is Leaper",y);
        }
         else if (y%400==0)
        {
            System.out. printf(" %d is Leaper",y);
        }
        else
        {
            System.out. printf(" %d is not Leaper",y);
        }
    }
}
