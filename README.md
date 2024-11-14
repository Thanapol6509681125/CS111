# Assignment and Control Statement Project

## Folder Structure

### 1. `6509681125-Assignment`

This folder contains a package `homework1` with two main classes:

- **Product Class**: 
  - Represents a product with a description (name) and unit price.
  - Methods:
    - `setDescription(String name)`: Sets the product name.
    - `getDescription()`: Retrieves the product name.
    - `setUnitprice(float price)`: Sets the unit price.
    - `getUnitprice()`: Retrieves the unit price.
    - `print()`: Displays the product name and price.

- **LineItem Class**: 
  - Represents a line item with quantity and an associated product.
  - Methods:
    - `setQty(int qty)`: Sets the quantity of the line item.
    - `getQty()`: Retrieves the quantity.
    - `setProduct(Product product)`: Associates a product with the line item.
    - `getProduct()`: Retrieves the associated product.
    - `getTotalPrice()`: Calculates and returns the total price by multiplying the product's unit price by the quantity.
  - The `main` method demonstrates the usage of `Product` and `LineItem` classes by creating products and calculating total prices for each line item.

### 2. `Control Statement`

This folder contains classes for performing basic calculations and control statements.

- **DoSummation Class**:
  - Reads two integers from user input.
  - Uses methods from the `Calculator` class to calculate either the sum or count of specific numbers within a given range.
  
- **Calculator Class**:
  - Provides utility methods for various calculations:
    - `sumBetween2Integers(int x1, int x2)`: Calculates the sum of all integers between two numbers.
    - `countOddNumbersFrom(int x1, int x2)`: Counts the odd numbers between two integers.
    - `sumOfEvenNumbersBetween(int x1, int x2)`: Sums the even numbers between two integers.
    - `printText()`: Reads and prints a line of text from the user.
    - `printTextNTimes()`: Displays a greeting in Thai, English, or French based on the user’s language selection.

