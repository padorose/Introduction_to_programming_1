import java.util.Scanner;

public class Main {
    public static void main (String[] args){
Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name=scanner.nextLine();
        System.out.println("Jak masz na nazwisko?");
        String surname=scanner.nextLine();
        System.out.println("Ile masz lat?");
        int age= scanner.nextInt();
        if(age>18&& age<29) {
            System.out.println(name+ " " +surname
                    + ". Możesz wejść.");
        }else if(age==30){
          System.out.println(name+ " " +surname
                  + ". 30latki nie wchodzą.");
      }else {
            System.out.println(name+ " " +surname
                    + ". Nie możesz wejść.");
        }


}
}