package homework_03;

public class Deputy extends Human{

    private String name;
    private String lastName;
    private boolean brights;
    private int brightsInt;


    public Deputy(int low, int growth, String name, String lastName, boolean brights, int brightsInt) {
        super(low, growth);
        this.name = name;
        this.lastName = lastName;
        this.brights = brights;
        this.brightsInt = brightsInt;
        this.brightsInt = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isBrights() {
        return brights;
    }

    public void setBrights(boolean brights) {
        this.brights = brights;
    }

    public int getBrightsInt() {
        return brightsInt;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", brights=" + brights +
                ", brightsInt=" + brightsInt +
                '}';
    }

    public void setBrightsInt(int brightsInt) {
        this.brightsInt = brightsInt;
    }
    public void brights(){
        if (!brights){
            System.out.println("Цей депутат не бере хабарів");
        }if (brights){
            System.out.println("Сума хабаря: "+brightsInt);
            if (brightsInt>5000){
                System.out.println("Поліція ув'язнить депутата");
            }else {
                this.brightsInt = brightsInt;
            }
        }
    }
}
