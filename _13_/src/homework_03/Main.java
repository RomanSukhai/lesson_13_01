package homework_03;

import java.util.Scanner;

public class Main {
    public static void main(){

        System.out.println("Введіть 1 щоб додати фракцію;");
        System.out.println("Введіть 2 щоб видалити конкретну фракцію");
        System.out.println("Введіть 3 щоб вивести усі  фракції");
        System.out.println("Введіть 4 щоб очистити конкретну фракцію");
        System.out.println("Введіть 5 щоб вивести конкретну фракцію");
        System.out.println("Введіть 6 щоб додати депутата в фракцію");
        System.out.println("Введіть 7 щоб видалити депутата з фракції");
        System.out.println();
        System.out.print("          Print number: ");
    }

    public static void main(String[] args) throws Exception {
        Goverment d = new Goverment();
        Scanner sc = new Scanner(System.in);
        System.out.println("____________________________");
        main();
        while (true){
            int number = sc.nextInt();
            if (number == 1){
                d.addFuction();
                System.out.println("_______________________");
                main();
            }else if (number == 2){
                d.deleteFuction();
                System.out.println("_______________________");
                main();
            }else if (number == 3){
                d.printALlFuction();
                System.out.println("_______________________");
                main();
            }else if (number == 4){
                d.clearFuction();
                System.out.println("_______________________");
                main();
            }else if (number == 5){
                d.printOneFuction();
                System.out.println("_______________________");
                main();
            }else if (number == 6){
                d.AddDeputyForFruction();
                System.out.println("_______________________");
                main();
            }else if (number == 7){
                d.deleteDeputyForFuction();
                System.out.println("_______________________");
                main();
            }else if (number == 8){
                d.printAllFalseDeputy();
                System.out.println("_______________________");
                main();
            }
            else {
                throw new Exception("Please print number (1 to 6)");
            }
        }

    }
}
