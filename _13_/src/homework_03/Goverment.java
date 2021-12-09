package homework_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

public class Goverment {
    List<Fuction> goverment = new ArrayList<>();
    Scanner sc  = new Scanner(System.in);
    public void addFuction(){
        System.out.println("-_-_-_-_-_-_-_-_-_\n\n");
        System.out.print("Введіть ім'я фракції: ");
        String name = sc.next();
        goverment.add(new Fuction(name,new ArrayList<Deputy>()));
    }
    public void deleteFuction() throws Exception {
        System.out.print("Введіть ім'я фракції: ");
        String name = sc.next();
        goverment.forEach(next -> {
            if (next.getName().equalsIgnoreCase(name)) goverment.remove(next);
        });
        /*
        Iterator<Fuction> iterator = goverment.iterator();
        while (iterator.hasNext()){
            Fuction next = iterator.next();
            if (next.getName().equalsIgnoreCase(name)){
                iterator.remove();
            }
        }

         */
    }
    private boolean CheckFuctionInGoverment(String name) {
        AtomicBoolean flag = new AtomicBoolean(false);
        goverment.forEach(f-> {
            if (f.getName().equalsIgnoreCase(name)) {
                flag.set(true);
            }
        });
        return flag.get();
    }

    public void printALlFuction(){
        goverment.forEach(x-> System.out.println(x));
    }
    public void printOneFuction() throws Exception{
        System.out.println("-_-_-_-_-_-_-_-_-_\n\n");
        System.out.print("Впишіть ім'я існуючої фракції: ");
        String fuctionName = sc.next();
        boolean flag = CheckFuctionInGoverment(fuctionName);
        if(flag){
            goverment.forEach(x->{if (x.getName().equalsIgnoreCase(fuctionName)) System.out.println(x);});
        }else{
            throw new Exception("The fuction isn't true");
        }
    }
    public void AddDeputyForFruction() throws Exception {
        System.out.println("-_-_-_-_-_-_-_-_-_\n\n");
        System.out.print("Введіть ім'я фракції:");
        String name = sc.next();
        boolean flag = CheckFuctionInGoverment(name);
        if (flag){
            goverment.stream().forEach(x->x.addDeputy());
        }else {
            throw new Exception("The fuction isn't true");
        }
    }
    public void deleteDeputyForFuction() throws Exception {
        System.out.println("-_-_-_-_-_-_-_-_-_\n\n");
        System.out.print("Введіть ім'я фракції:");
        String name = sc.next();
        goverment.forEach(x->x.deleteDeputy());
    }
    public void printAllFalseDeputyForFuction() throws Exception {
        System.out.println("-_-_-_-_-_-_-_-_-_\n\n");
        System.out.print("Введіть ім'я фракції:");
        String name = sc.next();
        boolean flag = CheckFuctionInGoverment(name);
        if (flag){
            goverment.forEach(f->f.printFalseDeputy());
        }else {
            throw new Exception("The fuction isn't true");
        }
    }


    public void printAllDeputyInFuction() throws Exception {
        System.out.println("-_-_-_-_-_-_-_-_-_\n\n");
        System.out.print("Введіть ім'я фракції:");
        String name = sc.next();
        boolean flag = CheckFuctionInGoverment(name);
        if (flag){
            goverment.forEach(d->d.printAllDeputy());
        }else {
            throw new Exception("The fuction isn't true");
        }
    }
    public void clearFuction() throws Exception {
        System.out.println("-_-_-_-_-_-_-_-_-_\n\n");
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
