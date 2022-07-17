# Description
1. Create a pizza receipt management system that consists of the following classes and relationships among them:
    - [x] A [Pizza](Pizza.java) class that minimally stores the following data fields for a pizza:
            - radius of the pizza
            - topping
            - a *shared* special ingredient of your choice 
            - The following methods should also be provided:
                - A constructor that initializes the radius, topping, and the food name fields
                    - The food name field must be part of a parent [FastFood](FastFood.java) class.
    - [x] A [MyOrderList](MyOrderList.java) class that minimally stores the following in a FastFood order list:
            - fast food orders with a timestamp (an TreeMap)
            - The following methods should also be provided:
                - Method to add a fast food order 
                - Method to get the orders
            *The list should maintain a total of only 2 orders with reciept info at a time*

2. Write a second main program called [TreeMapInAction](TreeMapInAction.java) that provides a menu to allow the user to: 
    - create a FastFood 
    - view all orders 

# TODO:
~~-Store orders in a map (TreeMap so map is soreted by key) instead of an TreeMap~~
    ~~- See if you can remove the last key (timestamp) and value (FastFood object) from the map~~
    ~~- See in what order are objects stored in a Java Map; is it oldest...recent? ~~
        ~~- if so, then appending entries and removing the first item in the map would make sense; allows the user to view recent orders.~~ 

