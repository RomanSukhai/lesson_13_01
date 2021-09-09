package homework_03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Fuction {
    private String name;
    private ArrayList<Deputy> fuction;

    public Fuction(String name, ArrayList<Deputy> fuction) {
        this.name = name;
        this.fuction = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Deputy> getFuction() {
        return fuction;
    }

    public void setFuction(ArrayList<Deputy> fuction) {
        this.fuction = fuction;
    }

    @Override
    public String toString() {
        return "Fuction{" +
                "name='" + name + '\'' +
                ", fuction=" + fuction +
                '}';
    }

    Scanner sc = new Scanner(System.in);
    public void AddDeputy(){
        System.out.println();
        System.out.println();
        System.out.println("-_-_-_-_-_-_-_-_-_");
        System.out.print("Введіть ім'я: ");
        String name = sc.next();
        System.out.print("Введіть прізвище: ");
        String lastName = sc.next();
        System.out.print("Введіть Вага: ");
        int low = sc.nextInt();
        System.out.print("Введіть ріст: ");
        int growth = sc.nextInt();
        System.out.print("Взятки брав: ");
        boolean brights = sc.nextBoolean();
        System.out.print("Скільки?: ");
        int growthInt = sc.nextInt();
        System.out.println("-_-_-_-_-_-_-_-_-_");
        fuction.add(new Deputy(low,growth,name,lastName,brights,growthInt));
    }
    public void deleteDeputy(){
        System.out.print("Введіть прізвище депутата: ");
        String lastName = sc.next();
        Iterator<Deputy> iterator= fuction.iterator();
        while (iterator.hasNext()){
            Deputy next = iterator.next();
            if (next.getLastName().equalsIgnoreCase(lastName)){
                iterator.remove();
            }
        }
    }
    public void printFalseDeputy(){
        Iterator<Deputy> iterator= fuction.iterator();
        while (iterator.hasNext()){
            Deputy next = iterator.next();
            if (next.isBrights()){
                System.out.println(next);
            }
        }
    }
    public void printAllDeputy(){
        for (Deputy d :fuction){
            System.out.println(d.toString());
        }
    }
    public void deleteAllDeputy(){
        for (Deputy d :fuction){
            fuction.remove(d.toString());
        }
    }

}
