package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            Integer choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch(choice){
                case 1: pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    break;

                case 2: pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break;

                case 3: System.exit(0);
            }

            System.out.println("Pet id is " + petFile.getPetId());
            System.out.println("Pet name is " + petFile.getPetName());
            System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());

            if(choice == 1){

                System.out.println("Breed: " + ((Dog) petFile.getPet()).getBreed());
            }

            else{
                System.out.println("Number of Lives: " + ((Cat) petFile.getPet()).getNoOfLives());
            }

            System.out.println("Communication sound: "+ petFile.getPet().makeSound());
            System.out.println("Play mode: " + petFile.getPet().play());
            System.out.println("");
        }
    }
}
