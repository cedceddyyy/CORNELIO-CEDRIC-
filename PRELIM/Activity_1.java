import java.util.Scanner;

class Activity_1 {
  public static void main(String args[]) {

    Animal1 a_d = new Animal1();
    Animal2 a_ca = new Animal2();
    Animal3 a_co = new Animal3();
    Animal4 a_f = new Animal4();
    int num;

    Scanner input = new Scanner(System.in);

    System.out.println("==========Activity One: What does the animal say?==========");
    System.out.println("Select an animal: ");
    System.out.println("1. Dog\n2. Cat\n3. Cow\n4. Fox\n");

    System.out.println("Enter selected number: ");
    num = input.nextInt();

    System.out.println("Animal: " + num);

   if (num == 1) {
   a_d.dog();
 } else if (num == 2) {
   a_ca.cat();
 } else if (num == 3) {
   a_co.cow();
 } else if (num == 4) {
   a_f.fox();
 } else {
   
   System.out.println("Invalid number. Please choose a number between 1 and 4.");
  }
 }
}

class Animal1 {
  public void dog() {
    System.out.println("Arf! Arf! Arf!");
 }
}

class Animal2 extends Animal1 {
  public void cat() {
    System.out.println("Meow! Meow! Meow!");
 }
}

class Animal3 {
  public void cow() {
    System.out.println("Moo! Moo! Moo!");
 }
}

class Animal4 {
  public void fox() {
    System.out.println("Ding! Ding! Ding!");
 }
}
