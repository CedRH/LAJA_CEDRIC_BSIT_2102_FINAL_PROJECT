# EcofindApp

EcofindApp is an innovative console-based application designed to promote sustainability and eco-conscious living. The application provides users with a platform to explore and purchase eco-friendly products while raising awareness about their environmental impact. With EcofindApp, users can perform several key functions, including registration and login, ensuring a personalized and secure shopping experience. Once logged in, users can browse a wide range of eco-friendly products, complete with detailed descriptions and environmental benefits for each item.

The application allows users to build a shopping cart by adding their chosen items, which they can review and modify before proceeding to checkout. One of EcofindApp's standout features is its ability to calculate the environmental impact of the items in the cart. This feature provides users with insights into how their purchases contribute to sustainability by considering factors such as carbon footprint reduction, recyclability, and renewable materials used in the products.

EcofindApp also offers seamless purchasing options, ensuring a user-friendly experience from start to finish. The application emphasizes promoting eco-friendly practices and educating users about the importance of making environmentally responsible choices. By using EcofindApp, individuals can take meaningful steps toward reducing their ecological footprint while supporting businesses that prioritize sustainability.
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



