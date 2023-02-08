import java.util.*;

public class lab2{

    static ArrayList<String> names = new ArrayList<>(); 
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args){
            int options;
            do {
                System.out.println("Menu Driven Program: ");
                System.out.println("1. Enter a name: ");
                System.out.println("2. Search for a name: ");
                System.out.println("3. Remove a name: ");
                System.out.println("4. Show all names: ");
                System.out.println("5. Exit");
                options = sc.nextInt();

            switch (options) {
                case 1:
                    System.out.println("To add enter your name:");
                    names.add(sc.next());
                    break;
                case 2:
                    System.out.println("To search enter your name:");
                    String searchName = sc.next();
                    if (names.contains(searchName)) {
                        System.out.println("found the name");
                    } else {
                        System.out.println("Can't found the name");
                    }
                    break;
                case 3:
                    System.out.println("To remove enter a name:");
                    String removeName = sc.next();
                    if (names.contains(removeName)) {
                        names.remove(removeName);
                        System.out.println("Remove name");
                    } else {
                        System.out.println("Not remove name");
                    }
                    break;
                case 4:
                    System.out.println("show all names:");
                    for (String name : names) {
                        System.out.println(name);
                    }
                    break;
                case 5:
                    System.out.println("Exit Program");
                    break;
                default:
                    System.out.println("Invalid choice,Please try again");
                    break;
            }
        } while (options != 5);
    }
}
        


