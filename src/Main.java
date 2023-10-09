import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Items> cart = new ArrayList<>();

        System.out.println("Welcome to the Football Items Shop!");

        while (true) {
            System.out.println("\nPlease choose a category:");
            System.out.println("1. Kits");
            System.out.println("2. Balls");
            System.out.println("3. Boots");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Thank you for visiting our shop. Goodbye!");
                break;
            }

            Items item = null;

            switch (choice) {
                case 1:
                    item = purchaseKit(scanner);
                    break;
                case 2:
                    item = purchaseBall(scanner);
                    break;
                case 3:
                    item = purchaseBoot(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid category.");
                    break;
            }

            if (item != null) {
                cart.add(item);
                System.out.println("Added to cart: " + item.getName() + " - Size: " + item.getSize() + " - Price: $" + item.getPrice());
            }
        }

        displayPurchasedItems(cart);
    }

    private static Items purchaseKit(Scanner scanner) {
        System.out.println("\nSelect a kit:");
        System.out.println("1. Original Kit - 11990 KZT");
        System.out.println("2. Replica Kit - 6990 KZT");
        System.out.println("3. Personalized Kit - 13990 KZT");

        int kitChoice = scanner.nextInt();

        System.out.println("\nEnter the size of the kit:");
        double size = scanner.nextDouble();

        Pricing pricing = new OriginalPrice(); // Default strategy for Kits

        switch (kitChoice) {
            case 1:
                return new Kits("Original", 11990, size, pricing);
            case 2:
                return new Kits("Replica", 6990, size, pricing);
            case 3:
                return new Kits("Personalized", 13990, size, pricing);
            default:
                System.out.println("Invalid kit choice.");
                return null;
        }
    }

    private static Items purchaseBall(Scanner scanner) {
        System.out.println("\nSelect a ball:");
        System.out.println("1. Original Ball - 12990 KZT");
        System.out.println("2. Replica Ball - 7990 KZT");

        int ballChoice = scanner.nextInt();

        System.out.println("\nEnter the size of the ball(futsal-5 or football-6):");
        double size = scanner.nextDouble();

        Pricing pricing = new OriginalPrice(); // Default strategy for Balls

        switch (ballChoice) {
            case 1:
                return new Balls("Original", 12990, size, pricing);
            case 2:
                return new Balls("Replica", 7990, size, pricing);
            default:
                System.out.println("Invalid ball choice.");
                return null;
        }
    }

    private static Items purchaseBoot(Scanner scanner) {
        System.out.println("\nSelect boots:");
        System.out.println("1. Nike- 19990 KZT");
        System.out.println("2. Adidas - 19990 KZT");
        System.out.println("3. Puma- 19990 KZT");
        System.out.println("4. Replica - 14990 KZT");

        int bootsChoice = scanner.nextInt();

        System.out.println("\nEnter the size of the boots:");
        double size = scanner.nextDouble();

        Pricing pricing = new OriginalPrice(); // Default strategy for Boots

        switch (bootsChoice) {
            case 1:
                return new Boots("Nike", 19990, size, pricing);
            case 2:
                return new Boots("Adidas", 19990, size, pricing);
            case 3:
                return new Boots("Puma", 19990, size, pricing);
            case 4:
                return new Boots("Replica", 14990, size, pricing);
            default:
                System.out.println("Invalid boots choice.");
                return null;
        }
    }

    private static void displayPurchasedItems(List<Items> cart) {
        System.out.println("\nItems Purchased:");

        for (Items item : cart) {
            System.out.println(item.getName() + " - Size: " + item.getSize() + " - Price: $" + item.getPrice());
        }

        double totalPrice = calculateTotalPrice(cart);
        System.out.println("Total Price: $" + totalPrice);
    }

    private static double calculateTotalPrice(List<Items> cart) {
        double totalPrice = 0;

        for (Items item : cart) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }


    }
