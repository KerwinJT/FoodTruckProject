# Food Truck Project
This program provides a simple interface to input data about Food Trucks. Using prompts, users will be guided through the steps to ensure data is properly inputed. This application is designed to accept a maximum of 5 Food Trucks can can accept as little as 0 Food Trucks.

## Topics and Technologies Used
#### Topics
This applications provides examples of data encapsulation, Object Oriented Programming, and method parameters/arguments.
#### Technologies
--Eclipse IDE
--Java 8
--Git
--GitHub Repositories
--MacOS Terminal

## Lessons Learned
It is important to remember that when using a mix of static and non-static methods, programmers must ensure the program can access non-static methods in the static main method. One way that I found to do this was instantiating an object of the class that contained the main method. This allowed me to access methods that were only accessible through that classes objects.

Another important lesson I learned was that static variables can be used to hold useful data that needs to be shared by objects of the same class. In this instance, I used a static variable to provide IDs to the Food trucks that was then incremented to ensure IDs were unique to each Food Truck.
