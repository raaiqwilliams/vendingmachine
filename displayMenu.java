public class displayMenu{

    static void show(){
        System.out.println("------------------------");
        System.out.println("Welcome to SA Vendors!");
        System.out.println("------------------------");
        System.out.println(" ");

        System.out.println("---");
        System.out.println("Please choose a category: ");
        System.out.println("---");

        System.out.println("1. Cooldrinks.");
        System.out.println("2. Snacks.");
        System.out.println("3. Sandwiches.");
        System.out.println("0. Cancel or proceed to checkout.");
        System.out.println("---");
    }

    static void cooldrinks(){
        System.out.println("Cooldrink list: ");
        System.out.println("1. Coca-Cola. ($2)");
        System.out.println("2. Sprite. ($2)");
        System.out.println("3. Fanta Orange. ($2)");
        System.out.println("4. Back to menu.");
    }

    static void snacks(){
        System.out.println("Snack List: ");
        System.out.println("1. Lays Chips. ($1)");
        System.out.println("2. M&M's. ($1.50)");
        System.out.println("3. Whispers. ($3)");
        System.out.println("4. Astros. ($2)");
        System.out.println("5. Back to menu.");
    }

    static void sandwiches(){
        System.out.println("Sandwich List:");
        System.out.println("1. Chicken and Mayo. ($4)");
        System.out.println("2. Vegan (Avo, Feta). ($3)");
        System.out.println("3. Cheese and Tomato. ($2)");
        System.out.println("4. Back to main menu.");
    }
}