import java.util.Scanner;

public class Scanners {


    public static void main(String[] args) {
        String startDesc = "You are in the opening of a forest. In front of you is a very small house made mostly of wood.";
        String houseDesc = "This isn't a small house, but a kitchen. There is a single table and a stove. Next to the stove there are two pots and a spoon. On the table there are various ingredients and tools. It smells nice in here.";
        String tableDesc = "On the table there is a medium-sized jug of water, a white onion, 3 cloves of garlic, a chopping board, and a knife. There is also a small scrap of paper that seems to have writing on it.";
        String scrapDesc = "The scrap reads: '2 tomatoes, chopped \n3 cloves of garlic, minced \n1 white onion, diced \nwater \nbasil \nvegetable broth'";
        String herbGardenDesc = "The only thing here is an empty, medium-sized patch of dirt and a table next to it. There seems to be something on the table.";
        String tomatoGardenDesc = "You find yourself in a tomato garden. There are many tomatoes here, all ripe.";
        //int tomatoNo = 0;

        Scanner scanner = new Scanner(System.in);
        String room = "Entrance";
        while (true) {
            System.out.println(room);
            //tomatoNo = tomatoNo++;
            //System.out.println(tomatoCount());
            if (room == "Entrance"){
                System.out.println(startDesc);
                String response = scanner.nextLine();
                if (response.equals("north")){
                    room = "House";
                }
                else if (response.equals("east")) {
                    room = "Tomato Garden";
                }
                else if (response.equals("west")) {
                    room = "Herb Shed";
                }
                else if (response.equals("south")) {
                    System.out.println("Can't go that way, never go into the forest.");
                }
                else if (response.equals("tomato check")) {
                    System.out.println("There is no tomato here.");
                }
            }
            else if (room == "Herb Shed"){
                System.out.println(herbGardenDesc);
                String response = scanner.nextLine();
                if (response.equals("north")){
                    System.out.println("You walk into a wall.");
                }
                else if (response.equals("east")) {
                    room = "Entrance";
                }
                else if (response.equals("west")) {
                    System.out.println("That is the wall.");
                }
                else if (response.equals("south")) {
                    System.out.println("That is a wall.");
                }
                else if (response.equals("tomato check")) {
                    System.out.println("There is a tomato here!");
                }
            }
            else if (room == "Tomato Garden"){
                System.out.println(tomatoGardenDesc);
                String response = scanner.nextLine();
                if (response.equals("north")){
                    System.out.println("You walk into a wall.");
                }
                else if (response.equals("east")) {
                    System.out.println("That is the wall.");
                }
                else if (response.equals("west")) {
                    room = "Entrance";
                }
                else if (response.equals("south")) {
                    System.out.println("That is a wall.");
                }
                else if (response.equals("tomato check")) {
                    System.out.println("There is a tomato here!");
                }
            }
            else if (room == "House"){
                System.out.println(houseDesc);
                String response = scanner.nextLine();
                if (response.equals("north")){
                    System.out.println("You walk into a wall.");
                }
                else if (response.equals("east")) {
                    System.out.println("That is the wall.");
                }
                else if (response.equals("west")) {
                    System.out.println("That is the wall.");
                }
                else if (response.equals("south")) {
                    room = "Entrance";
                }
                else if (response.equals("tomato check")) {
                    System.out.println("There is a tomato here!");
                }
            }
        }


    }
}