# EcofindApp

EcofindApp is a console-based application that allows users to register, log in, view available eco-friendly products, add items to their shopping cart, and purchase items. The application also calculates the environmental impact of the items in the cart.

## Features

- User registration and login
- View available eco-friendly products
- Add items to the shopping cart
- View items in the shopping cart
- Purchase items from the shopping cart
- Calculate the total environmental impact of items in the cart

## Classes

### `EcofindApp`

The main class that starts the application.

### `MarketItem`

An abstract base class for all marketplace items.

### `ElectronicProduct`

A concrete class that extends `MarketItem` for electronic products.

### `ClothingProduct`

A concrete class that extends `MarketItem` for clothing products.

### `CartOperations`

An interface for shopping cart functionality.

### `ShoppingCart`

A concrete class that implements `CartOperations` for managing the shopping cart.

### `EcomarketPlatform`

The main platform class that manages the entire application, including user registration, login, and product management.

### `User`

A class that represents a user in the system.

### `UserManager`

A class that manages user registration and login.

## How to Run

1. Ensure you have Java installed on your machine.
2. Clone the repository or download the source code.
3. Navigate to the `src` directory in the terminal.
4. Compile the Java files:
    ```sh
    javac com/ecofind/*.java
    ```
5. Run the application:
    ```sh
    java com.ecofind.EcofindApp
    ```

## Github repository link



