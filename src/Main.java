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
        if(age>18) {
            System.out.println(name+ " " +surname
                    + ". Możesz wejść");
        }else {
          System.out.println(name+ " " +surname
                  + ". Nie możesz wejść");
      }


}
}