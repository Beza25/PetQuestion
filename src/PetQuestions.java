import java.util.Scanner;

public class PetQuestions {
    public static void  main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name, breed;
        int age;

        System.out.println("Greetings. What is your pet's name? ");
        name = keyboard.nextLine();
        System.out.println("What kind of animal is " + name  + "? ");
        breed = keyboard.nextLine();
        System.out.println("How old is " + name + "? ");
        age = keyboard.nextInt();
        System.out.println(name + " is your " + breed + " dog and it is " + age + " years old." );


    }
}
