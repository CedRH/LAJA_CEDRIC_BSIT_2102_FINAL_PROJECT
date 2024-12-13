package com.ecofind;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EcomarketPlatform {
    private ShoppingCart cart = new ShoppingCart();
    private final List<MarketItem> availableItems = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    private final UserManager userManager = new UserManager();
    private User currentUser;

    public EcomarketPlatform() {
        initializeInventory();
    }

    private void initializeInventory() {
        availableItems.add(new ElectronicProduct("Solar Charger", "GreenTech", 90, 
                                                  true, "5W"));
        availableItems.add(new ClothingProduct("Organic Cotton Shirt", "EarthWear", 85, 
                                                "Cotton", true));
        availableItems.add(new ElectronicProduct("LED Light Bulb", "EcoLight", 80, 
                                                  true, "10W"));
        availableItems.add(new ClothingProduct("Recycled Polyester Jacket", "ReWear", 75, 
                                                "Polyester", false));
        availableItems.add(new ElectronicProduct("Energy Efficient Refrigerator", "CoolTech", 95, 
                                                  true, "150W"));
        availableItems.add(new ClothingProduct("Bamboo Socks", "GreenFeet", 70, 
                                                "Bamboo", true));
        availableItems.add(new ElectronicProduct("Electric Car", "EcoDrive", 100, 
                                                  true, "200kW"));
        availableItems.add(new ClothingProduct("Hemp T-Shirt", "NatureWear", 80, 
                                                "Hemp", true));
    }

    public void run() {
        while (true) {
            if (currentUser == null) {
                displayLoginMenu();
            } else {
                displayMainMenu();
            }
        }
    }

    private void displayLoginMenu() {
        System.out.println("\n--- Ecomarket Platform ---");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1: register(); break;
            case 2: login(); break;
            case 3: System.exit(0);
            default: System.out.println("Invalid option.");
        }
    }

    private void register() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userManager.register(username, password)) {
            System.out.println("Registration successful. You can now log in.");
        } else {
            System.out.println("Username already exists. Please try again.");
        }
    }

    private void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = userManager.login(username, password);
        if (user != null) {
            currentUser = user;
            System.out.println("Login successful. Welcome, " + username + "!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private void displayMainMenu() {
        System.out.println("\n--- Ecomarket Platform ---");
        System.out.println("1. View Available Items");
        System.out.println("2. Add Item to Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Purchase Items");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1: viewItems(); break;
            case 2: addToCart(); break;
            case 3: viewCart(); break;
            case 4: purchaseItems(); break;
            case 5: logout(); break;
            case 6: System.exit(0);
            default: System.out.println("Invalid option.");
        }
    }

    private void viewItems() {
        if (availableItems.isEmpty()) {
            System.out.println("No items available.");
            return;
        }

        for (int i = 0; i < availableItems.size(); i++) {
            MarketItem item = availableItems.get(i);
            System.out.printf("%d. %s (%s) - Sustainability Score: %d\n", 
                               i + 1, item.getName(), item.getBrand(), 
                               item.getSustainabilityScore());
        }
    }

    private void addToCart() {
        viewItems();
        System.out.print("Enter item number to add to cart: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        if (index >= 0 && index < availableItems.size()) {
            MarketItem item = availableItems.get(index);
            cart.addItem(item);
            System.out.println(item.getName() + " added to cart.");
        }
    }

    private void viewCart() {
        List<MarketItem> items = cart.getItems();
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        for (MarketItem item : items) {
            System.out.printf("%s (%s) - Impact: %.2f\n", 
                               item.getName(), item.getBrand(), 
                               item.calculateEnvironmentalImpact());
        }

        System.out.printf("Total Environmental Impact: %.2f\n", 
                           cart.getTotalEnvironmentalImpact());
    }

    private void purchaseItems() {
        List<MarketItem> items = cart.getItems();
        if (items.isEmpty()) {
            System.out.println("Cart is empty. Add items to cart before purchasing.");
            return;
        }

        System.out.println("Purchasing the following items:");
        for (MarketItem item : items) {
            System.out.printf("%s (%s)\n", item.getName(), item.getBrand());
            availableItems.remove(item); // Remove purchased item from available items
        }

        cart = new ShoppingCart(); // Clear the cart after purchase
        System.out.println("Purchase successful. Your cart is now empty.");
    }

    private void logout() {
        currentUser = null;
        System.out.println("You have been logged out.");
    }
}