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
        System.out.println("Введіть 8 щоб вивести всіх корупціонерів");
        System.out.print(" Print number: ");
    }
    public static void main(String[] args) throws Exception {
        Goverment d = new Goverment();
        Scanner sc = new Scanner(System.in);
        System.out.println("____________________________");
        main();
        while (true){
            int number = sc.nextInt();
            if (number == 1){
                NumberForCreatedNewDeputy(d);
            }else if (number == 2){
                NumberForDeleteFruction(d);
            }else if (number == 3){
                NumberForPrintAllFruction(d);
            }else if (number == 4){
                NumberForClearAllFruction(d);
            }else if (number == 5){
                NumberForPrintOneFruction(d);
            }else if (number == 6){
                NumberForAddDeputyForFruction(d);
            }else if (number == 7){
                NumberForDeleteDeputyFromFruction(d);
            }else if (number == 8){
                NumberForPrintAllFalseDeputyFromFruction(d);
            }
            else {
                throw new Exception("Please print number (1 to 6)");
            }
        }

    }

    private static void NumberForPrintAllFalseDeputyFromFruction(Goverment d) {
        d.printAllFalseDeputy();
        System.out.println("_______________________");
        main();
    }

    private static void NumberForDeleteDeputyFromFruction(Goverment d) throws Exception {
        d.deleteDeputyForFuction();
        System.out.println("_______________________");
        main();
    }

    private static void NumberForAddDeputyForFruction(Goverment d) throws Exception {
        d.AddDeputyForFruction();
        System.out.println("_______________________");
        main();
    }

    private static void NumberForPrintOneFruction(Goverment d) throws Exception {
        d.printOneFuction();
        System.out.println("_______________________");
        main();
    }

    private static void NumberForClearAllFruction(Goverment d) throws Exception {
        d.clearFuction();
        System.out.println("_______________________");
        main();
    }

    private static void NumberForPrintAllFruction(Goverment d) {
        d.printALlFuction();
        System.out.println("_______________________");
        main();
    }

    private static void NumberForDeleteFruction(Goverment d) throws Exception {
        d.deleteFuction();
        System.out.println("_______________________");
        main();
    }

    private static void NumberForCreatedNewDeputy(Goverment d) {
        d.addFuction();
        System.out.println("_______________________");
        main();
    }
}
