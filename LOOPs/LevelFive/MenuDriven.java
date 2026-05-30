import java.util.*;

public class MenuDriven{
public static void main(String... donPaps){
Scanner input = new Scanner(System.in);

while(true){
System.out.print("""
=========== MENU ===========
1. FOODs
2. DRINKS
3. DESSERTS
4. EXIT
""");

System.out.print("Enter your choice: \n");
int userInput = input.nextInt();

switch(userInput){
case 1:
System.out.print("""
            =========== FOODS ===========
            1. Local Dishes
            2. Asian Dishes
            3. Intercontinental Dishes
            4. Mexican Dishes
            """);

System.out.print("Enter your choice: ");
userInput = input.nextInt();

switch (userInput) {
case 1:
System.out.print("""
                    =========== Local Dishes ===========
                    1. Jollof Rice
                    2. Amala and Ewedu
                    3. Pounded Yam and Egusi
                    4. Eba and Okro Soup
                    """);
return;

case 2:
System.out.print("""
                    =========== Asian Dishes ===========
                    1. Fried Rice
                    2. Sushi
                    3. Ramen
                    4. Dumplings
                    """);
return;

case 3:
System.out.print("""
                    =========== Intercontinental Dishes ===========
                    1. Spaghetti Bolognese
                    2. Grilled Chicken and Fries
                    3. Beef Steak
                    4. Caesar Salad
                    """);
return;

case 4:
System.out.print("""
                    =========== Mexican Dishes ===========
                    1. Tacos
                    2. Burritos
                    3. Quesadillas
                    4. Nachos
                    """);
return;

default:
System.out.println("Invalid choice");
}
return;

case 2:
System.out.print("""
            =========== DRINKS ===========
            1. Soft Drinks
            2. Juices
            3. Hot Drinks
            4. Mocktails
            """);

System.out.print("Enter your choice: ");
userInput = input.nextInt();

switch (userInput) {
case 1:
System.out.print("""
		    ===========  Soft Drinks ===========
                   
                    1. Coca-Cola
                    2. Pepsi
                    3. Fanta
                    4. Sprite
                    """);
return;

case 2:
System.out.print("""
                    =========== Juices ===========
                    1. Orange Juice
                    2. Apple Juice
                    3. Pineapple Juice
                    4. Watermelon Juice
                    """);
return;

case 3:
System.out.print("""
                    =========== Hot Drinks ===========
                    1. Coffee
                    2. Tea
                    3. Hot Chocolate
                    4. Cappuccino
                    """);
return;

case 4:
System.out.print("""
                    =========== Mocktails ===========
                    1. Virgin Mojito
                    2. Shirley Temple
                    3. Fruit Punch
                    4. Lemon Mint Cooler
                    """);
return;

default:
System.out.println("Invalid choice");
}
return;

case 3:
System.out.print("""
            =========== DESSERTS ===========
            1. Cakes
            2. Ice Creams
            3. Pastries
            4. Chocolates
            """);

System.out.print("Enter your choice: ");
userInput = input.nextInt();

switch (userInput) {
case 1:
System.out.print("""
                    =========== Cakes ===========
                    1. Chocolate Cake
                    2. Red Velvet Cake
                    3. Vanilla Cake
                    4. Cheesecake
                    """);
return;

case 2:
            System.out.print("""
                    =========== Ice Creams ===========
                    1. Vanilla
                    2. Chocolate
                    3. Strawberry
                    4. Mint
                    """);
return;

case 3:
System.out.print("""
                    =========== Pastries ===========
                    1. Doughnut
                    2. Croissant
                    3. Meat Pie
                    4. Puff Puff
                    """);
return;

case 4:
System.out.print("""
                    =========== Chocolates ===========
                    1. Milk Chocolate
                    2. Dark Chocolate
                    3. White Chocolate
                    4. Truffles
                    """);
return;

default:
System.out.println("Invalid choice");
}
return;

case 4:
System.out.println("Exiting program...");
return;

}
}


}
}

