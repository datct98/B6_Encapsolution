package kiemtra2;

import kiemtra2.model.User;
import kiemtra2.utils.Constant;
import kiemtra2.view.HomeView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Create default value
        User userDefault = new User("dat","dat@gmail.com","123");
        ArrayList<User> users = new ArrayList<>(Arrays.asList(userDefault));
        Scanner scanner = new Scanner(System.in);

       /*
       // Test regex
        String email = "dat@gmail2.com";
        String password = "Chudat18!";
        //System.out.println(Pattern.matches(Constant.REGEX_EMAIL, email));
        System.out.println(Pattern.matches(Constant.REGEX_PASSWORD, password));
        */
        HomeView homeView = new HomeView();
        homeView.displayHomeView(scanner, users);

    }
}
