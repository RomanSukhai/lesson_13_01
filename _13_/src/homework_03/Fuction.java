package homework_03;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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
    void addDeputy(){
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
        if (brights){
            System.out.print("Скільки?: ");
            int growthInt = sc.nextInt();
            System.out.println("-_-_-_-_-_-_-_-_-_");
            fuction.add(new Deputy(low, growth, name, lastName, brights, growthInt));
        }else if(!brights){
            fuction.add(new Deputy(low, growth, name, lastName, brights, 0));
        }
    }
    public void deleteDeputy(){
        System.out.print("Введіть прізвище депутата: ");
        String lastName = sc.next();
        System.out.println(fuction);
        List<Deputy> collect = fuction.stream().filter((x)->!x.getLastName().equalsIgnoreCase(lastName)).collect(Collectors.toList());
        fuction.clear();
        fuction.addAll(collect);
        System.out.println(fuction);
    }
    public void printFalseDeputy() {
        fuction.stream().filter(x-> x.isBrights()).forEach(x-> System.out.println(x));
    }
    public void printAllDeputy() {
        fuction.forEach(d-> System.out.println(d));
    }
    public void deleteAllDeputy() {
        fuction.forEach(d->fuction.remove(d.toString()));
    }

}
