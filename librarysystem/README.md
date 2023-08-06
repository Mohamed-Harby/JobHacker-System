# Library Management System

## Requirements
Develop a library management system with the following requirements:

1. The application should have a `Library` class which represents a library and contains the following attributes: library name, library code, and a list of books.

2. Each book should have a `Book` class which represents a book and contains the following attributes: book title, author name, book ID, book version, and book availability status.

3. The application should have a `User` class which represents a library user and contains the following attributes: user name, user ID, and a list of borrowed books.

4. The application should have the following methods:
    - A method to add a new book to the library.
    - A method to remove a book from the library.
    - A method to check out a book.
    - A method to return a book.
    - A method to display the list of available books.
    - A method to display the list of borrowed books.
    - A method to display the book details of a specific book.

5. The application should print a clear error message and exit the program in case of unavailable books, invalid book IDs, etc.

6. The application should have a `main` method which simulates the use of the application:
    - It should create a library object, add books to the library, remove books from the library, check out books, return books, and display book details, the list of available books, and the list of borrowed books.

7. The application should use appropriate object-oriented programming concepts such as encapsulation, inheritance, polymorphism, and abstraction.

8. The application should be well-documented with comments explaining the purpose of each class, method, and attribute.

9. The application should be thoroughly tested using test cases scenarios for all methods:
    - For each method, define test cases that cover all the possible scenarios. Test cases should cover both valid and invalid input scenarios.

## Test Cases

Create a `TestCases` file inside the `Resources` folder to cover all the test cases scenarios you have applied to test your code.

Example:
1. Test adding a book:
    - Scenario 1: Adding a book with all required fields with correct data.
      Input: Book{ID = 0123, title = 'JobHacker-System', author = 'JOBHacker', version = '1', isAvailable = true}
      Output: The JobHacker-System book is successfully added to the library.

    - Scenario 2: Adding a book with invalid data.
      Input: Book{ID = -555, title = 'JobHacker-System', author = 'JOBHacker', version = '1', isAvailable = true}
      Output: "Invalid ID, Please enter valid data."

2. Test Removing a book: (Add similar scenarios for other methods)