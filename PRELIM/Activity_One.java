//EY
import java.util.Scanner;

public class Activity_One{
   public static void main(String args[]){
   Scanner scan = new Scanner(System.in);
      System.out.println("===== Activity One: What does the animal say? =====");
      System.out.println("1. Dog");
      System.out.println("2. Cat");
      System.out.println("3. Mouse");
      System.out.println("4. Fox");
      System.out.print("Enter a number: ");
      int num = scan.nextInt();
      
      switch (num){
         case 1:
            System.out.println("Animal: " +num);
            System.out.print("Dog says ");
            Dog dog = new Dog();
            dog.displaySound();
            break;
         case 2:
            System.out.println("Animal: " +num);
            System.out.print("Cat says ");
            Cat cat = new Cat();
            cat.displaySound();
            break;
         case 3:
            System.out.println("Animal: " +num);
            System.out.print("Mouse says ");
            Mouse mouse = new Mouse();
            mouse.displaySound();
            break;
         case 4:
            System.out.println("Animal: " +num);
            System.out.print("Fox says ");
            Fox fox = new Fox();
            fox.displaySound();
            break;
         default:
            System.out.print("None of the choices above");
      }
   }
}
class Dog{
   public void displaySound(){
      System.out.println("woof! woof! woof!");
   }
}
class Cat extends Dog{
   public void displaySound(){
      System.out.println("meow! meow! meow!");
   }
}
class Mouse extends Dog{
   public void displaySound(){
      System.out.println("squeak! squeak! squeak!");
   }
}
class Fox extends Dog{
   public void displaySound(){
      System.out.println("ding! ding! ding!");
   }
}
