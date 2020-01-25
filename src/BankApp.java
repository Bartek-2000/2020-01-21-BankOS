import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Database database = new Database();
        Options options = new Options();
        Scanner scanner = new Scanner(System.in);
        database.employee.put(1L,new Employee(1L, 1L,"Jan", "Kowalski", 2000,new Bonus(1L, 0)));

        database.client.put(1L, new Client(1L, "Monika", "Nowak", 123456789, "x@gmail.com", "Breslau", new BankAccount(1L, 12345, 0L, new Date())));

        int option1;
        options.startOptions();
        option1 = scanner.nextInt();
        do {
            switch (option1) {
                case 1:
                    options.employeeOptions();
                    int option = scanner.nextInt();
                    switch (option){
                        case 1: database.addClient(); break;
                        case 2: database.deleteClient();break;
                        case 3: database.printClient();break;
                        case 4: option1=3;break;
                    }break;
                case 2:
                    options.bossOptions();
                    option = scanner.nextInt();
                    switch (option){
                        case 1: database.addClient(); break;
                        case 2: database.deleteClient();break;
                        case 3: database.printClient();break;
                        case 4: database.addEmployee();break;
                        case 5: database.deleteEmployee();break;
                        case 6: database.printEmployee();break;
                        case 7: option1 = 3;break;
                    }break;
                case 3: break;

            }
        }while(option1!=3);
    }
}
