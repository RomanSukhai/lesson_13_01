package homework_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Goverment {
    List<Fuction> goverment = new ArrayList<>();
    Scanner sc  = new Scanner(System.in);
    public void addFuction(){
        System.out.println("          -_-_-_-_-_-_-_-_-_");
        System.out.println();
        System.out.println();
        System.out.print("Введіть ім'я фракції: ");
        String name = sc.next();
        goverment.add(new Fuction(name,new ArrayList<Deputy>()));
    }
    public void deleteFuction() throws Exception{
        System.out.print("Введіть ім'я фракції: ");
        String name = sc.next();
        Iterator<Fuction> iterator = goverment.iterator();
        while (iterator.hasNext()){
            Fuction next = iterator.next();
            if (next.getName().equalsIgnoreCase(name)){
                iterator.remove();
            }
        }

    }
    private boolean CheckFuctionInGoverment(String name) {
        boolean flag = false;
        for (Fuction f : goverment) {
            if (f.getName().equalsIgnoreCase(name)) {
                flag = true;
            }
        }
        return flag;
    }

    public void printALlFuction(){
        for (Fuction f :goverment){
            System.out.println(f);
        }
    }
    public void printOneFuction() throws Exception{
        System.out.println("          -_-_-_-_-_-_-_-_-_");
        System.out.println();
        System.out.println();
        System.out.print("Впишіть ім'я існуючої фракції: ");
        String fuctionName = sc.next();
        boolean flag = CheckFuctionInGoverment(fuctionName);
        if(flag){
            Iterator<Fuction> iterator = goverment.iterator();
            while (iterator.hasNext()){
                Fuction next = iterator.next();
                if (next.getName().equalsIgnoreCase(fuctionName)){
                    System.out.println(next);
                }
            }
        }else{
            throw new Exception("The fuction isn't true");
        }
    }
    public void AddDeputyForFruction() throws Exception {
        System.out.println("          -_-_-_-_-_-_-_-_-_");
        System.out.println();
        System.out.println();
        System.out.print("Введіть ім'я фракції:");
        String name = sc.next();
        boolean flag = CheckFuctionInGoverment(name);
        if (flag){
            for (Fuction f : goverment){
                f.AddDeputy();
            }
        }else {
            throw new Exception("The fuction isn't true");
        }
    }
    public void deleteDeputyForFuction() throws Exception {
        System.out.println("          -_-_-_-_-_-_-_-_-_");
        System.out.println();
        System.out.println();
        System.out.print("Введіть ім'я фракції:");
        String name = sc.next();
        Iterator<Fuction> iterator = goverment.iterator();
        while (iterator.hasNext()){
            Fuction next = iterator.next();
            if (next.getName().equalsIgnoreCase(name)){
                next.deleteDeputy();
            }
        }
    }
    public void printAllFalseDeputyForFuction() throws Exception {
        System.out.println("          -_-_-_-_-_-_-_-_-_");
        System.out.println();
        System.out.println();
        System.out.print("Введіть ім'я фракції:");
        String name = sc.next();
        boolean flag = CheckFuctionInGoverment(name);
        if (flag){
            for (Fuction f : goverment){
                f.printFalseDeputy();
            }
        }else {
            throw new Exception("The fuction isn't true");
        }
    }

    public void printAllDeputyInFuction() throws Exception {
        System.out.println("          -_-_-_-_-_-_-_-_-_");
        System.out.println();
        System.out.println();
        System.out.print("Введіть ім'я фракції:");
        String name = sc.next();
        boolean flag = CheckFuctionInGoverment(name);
        if (flag){
            for (Fuction d : goverment){
                d.printAllDeputy();
            }
        }else {
            throw new Exception("The fuction isn't true");
        }
    }
    public void clearFuction() throws Exception {
        System.out.println("          -_-_-_-_-_-_-_-_-_");
        System.out.println();
        System.out.println();
        System.out.print("Введіть ім'я фракції:");
        String name = sc.next();
        boolean flag = CheckFuctionInGoverment(name);
        if (flag){
            for (Fuction d : goverment){
                if (d.getName().equalsIgnoreCase(name)){
                    d.deleteAllDeputy();
                }
            }
        }else {
            throw new Exception("The fuction isn't true");
        }
    }
    public void printAllFalseDeputy(){
        Iterator<Fuction> iterator = goverment.iterator();
        while (iterator.hasNext()){
            Fuction next = iterator.next();
            next.printFalseDeputy();
        }
    }
}
