import java.util.Scanner;

public class Vendor{
public static void main(String[] args){

    int input;
    double total = 0.00;
    Scanner s = new Scanner(System.in);
    displayMenu.show();

    System.out.print("Please enter your choice: ");
    input = s.nextInt();
    System.out.println(" ");

    while (input != 0){
        int choice;
        
        switch(input){
            case 1:
                displayMenu.cooldrinks();
                System.out.print("Please enter your selection: ");
                choice = s.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("You have selected Coca-Cola! $2.00 added to total.");
                        total += 2;
                        break;
                    case 2:
                        System.out.println(("You have selected Sprite! $2.00 added to total."));
                        total += 2;
                        break;
                    case 3:
                        System.out.println("You have selected Fanta Orange! $2.00 added to total.");
                        total +=2;
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Invalid input! Taking you back to the main menu.");
                        break;
                }
                break;
            case 2:
                displayMenu.snacks();
                System.out.print("Please enter your selection: ");
                choice = s.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("You have chosen Lays Chips! $1.00 added to total.");
                        total += 1;
                        break;
                    case 2:
                        System.out.println("You have chosen M&M's! $1.50 added to total.");
                        total += 1.5;
                        break;
                    case 3:
                        System.out.println("You have chosen Whispers! $3.00 added to total.");
                        total += 3;
                        break;
                    case 4:
                        System.out.println("You have chosen Astros! $2.00 added to total.");
                        total += 2;
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Invalid input! Taking you back to the main menu.");
                }
                break;
            case 3:
                displayMenu.sandwiches();
                System.out.print("Please enter your selection: ");
                choice = s.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("You have chosen the Chicken and Mayo sandwich! $4.00 added to total.");
                        total += 4;
                        break;
                    case 2:
                        System.out.println("You have chosen the Vegan sandwich! $3.00 added to total.");
                        total += 3;
                        break;
                    case 3:
                        System.out.println("You have chosen the Cheese and Tomato sandwich! $2.00 added to total.");
                        total += 2;
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Invalid input! Taking you back to the main menu.");
                }
                break;
            default:
                System.out.print("Invalid input! Please enter a valid choice: ");
                input = s.nextInt();
                break;
        }
        System.out.println("=======================");
        System.out.println("Current balance of items in your basket:  $" + total);
        System.out.println("=======================");

        displayMenu.show();
        System.out.print("Please enter your choice: ");
        input = s.nextInt();  
    }

    System.out.println("------");
    System.out.println("Your total amount owed is: $" + total);
    System.out.println("------");

    boolean paid = false;
    int amountPaid = 0;
    System.out.println("Input paid amount: ");
    amountPaid = s.nextInt();

    while(!paid){
    if (amountPaid > total) {
        System.out.println("Change owed: " + (amountPaid - total));
        System.out.println("Thank you for using SA Vendors! Enjoy your purchase!");
        paid = true;
    }else if (amountPaid == total){
        System.out.println("Exact amount entered. Thank you for using SA Vendors! Enjoy your purchase!");
        paid = true;
    }else{
        System.out.println("You still owe " + (total - amountPaid));
        paid = false;
    }
}
    s.close();
}
}