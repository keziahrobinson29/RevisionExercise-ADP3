package za.ac.cput.KeziahRobinson_219113149;
/**
 *
 * @author Keziah Robinson - 219113149
 *
 */
public class RevisionClass {

    private String Name;
    private int num1;
    private int num2;

    /*---------------------------Getters and Setters-------------------------------*/

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "RevisionClass{" + "Name=" + Name + ", num1=" + num1 + ", num2=" + num2 + '}';
    }
}
