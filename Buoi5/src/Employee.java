import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private String gender;
    private String Address;

    private float hourWorked;
    private float hoursRate;
    private float salary;
    private float tax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public float getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(float hourWorked) {
        if (hourWorked >= 45) {
            hourWorked = 45 + (hourWorked - 45) * 3 / 2;
        }
        this.hourWorked = hourWorked;
    }

    public float getHoursRate() {
        return hoursRate;
    }

    public void setHoursRate(float hoursRate) {
        this.hoursRate = hoursRate;
    }

    public float getSalary() {
        return hourWorked * hoursRate;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        if (salary > 300) {
            tax = (salary - 300) * 2 / 100;
        } else
            tax = 0;
        this.tax = tax;
    }

    public float Money() {
        return getSalary() - getSalary() * getTax();
    }

    private static Scanner sc = new Scanner(System.in);

    public Employee(String name, int age, String gender, String Address, float hourWorked, float hoursRate,
            float salary, float tax) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.Address = Address;
        this.hourWorked = hourWorked;
        this.hoursRate = hoursRate;
        this.salary = salary;
        this.tax = tax;
    }

    public Employee() {
    }

    public void input() {
        System.out.print("Ho ten: ");
        setName(sc.nextLine());
        System.out.print("Tuoi: ");
        setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Gioi tinh: ");
        setGender(sc.nextLine());
        System.out.print("Dia chi: ");
        setAddress(sc.nextLine());
        System.out.print("So gio lam viec: ");
        setHourWorked(sc.nextFloat());
        System.out.print("So tien 1 h lam viec: ");
        setHoursRate(sc.nextFloat());
        sc.nextLine();
        setSalary(salary);
        setTax(tax);
    }

    public void output() {
        System.out.printf("%-20s %-10d %-15s %-20s %-10f\n", getName(), getAge(), getGender(), getAddress(), Money());
    }

}
