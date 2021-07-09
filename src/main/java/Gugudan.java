import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args){
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] Gogudan = new int[9];
        for (int i=0; i<9; i++){
            Gogudan[i] = number * (i+1);
        }

        for (int i=0; i<9; i++){
            System.out.println(Gogudan[i]);
        }
    }
}
