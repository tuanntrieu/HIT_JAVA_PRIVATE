import java.util.ArrayList;
import java.util.Scanner;

public class AccountManagement {
    public ArrayList<Student> list = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    static FileDataManagement fileData = new FileDataManagement();

    public AccountManagement(){};
    public void AccountAdmin() {
        list.add(new Student("1", "Trieu Dang Tuan", 19, "Nam Dinh", 3.54, new Account("admin", "tuan03nd")));
    }

    public void InitializeCustomerInfo() {
        list.add(new Student("2", "Pham Duc Thang", 18, "Nam Dinh", 3.5, new Account("abcxyz987321", "thang04nd")));
        list.add(new Student("3", "Pham Trung Tien", 19, "Nam Dinh", 3.55, new Account("phamtien131003", "tien03nd")));
        list.add(new Student("4", "Nguyen Hoang Quang Vinh", 19, "Ha Tinh", 3.1, new Account("zingwang", "vinh03ht")));
        list.add(new Student("5", "Trieu Dinh Binh", 8, "Nam Dinh", 3.8, new Account("binhtrieu", "binh14nd")));
        WriteToFile("user.txt");
    }

    public void WriteToFile(String file) {
        fileData.OpenFileToWrite(file);
        for (Student s : list) {
            if (s.getAccount().getUsername().compareTo("admin") != 0) {
                fileData.getPrintWriter().println(s.getId() + "|" + s.getId() + "|" + s.getAge() + "|" + s.getAddress()
                        + "|" + s.getGpa() +"|"+ s.getAccount().getUsername() + "|" + s.getAccount().getPassword());

            }
        }
        fileData.CloseFileAfterWriter();

    }
    public static void main(String[] args) {
        AccountManagement a=new AccountManagement();
        a.InitializeCustomerInfo();
    }
}