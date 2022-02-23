package Options_menu;

import java.util.Scanner;

public class Main_menu {

    public static void main(String[] args) {



        choices.choices();
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        menu.menu(choice);
    }
}
