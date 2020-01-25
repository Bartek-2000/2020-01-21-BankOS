public class Options {

    public static void startOptions(){
        System.out.println("Who are you?");
        System.out.println("1. Employee");
        System.out.println("2. Boss");
        System.out.println("3. Exit");
        System.out.println("Select an option:");
    }
    public static void bossOptions(){
        System.out.println("1. New client");
        System.out.println("2. Delete client");
        System.out.println("3. Show client");
        System.out.println("4. Add employee");
        System.out.println("5. Delete employee");
        System.out.println("6. Show employee");
        System.out.println("7. Exit");
        System.out.println("Select an option:");
    }
    public static void employeeOptions(){
        System.out.println("1. New client");
        System.out.println("2. Delete client");
        System.out.println("3. Show client");
        System.out.println("4. Exit");
    }


    public static boolean EXIT(){
        return true;
    }
}
