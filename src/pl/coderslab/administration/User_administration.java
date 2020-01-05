package pl.coderslab.administration;

import pl.coderslab.dao.UserDao;
import pl.coderslab.model.User;

import java.util.Scanner;

public class User_administration {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        boolean programLoop = true;
        while (programLoop) {
            for (int i = 0; i < userDao.findAll().length; i++) {
                userDao.printUser(userDao.findAll()[i]);
            }
//            boolean commandLoop = true;
//            while (commandLoop) {
                System.out.println("Powiedz co chcesz zrobić. \n" +
                        "Jeśli chcesz dodać nowego użytkownika wpisz 'add' \n" +
                        "Jeśli chcesz edytować istniejącego użytkownika wpisz 'edit'\n" +
                        "Jeśli chcesz usunąć użytkownika wpisz 'delete'\n" +
                        "Jeśli chcesz zakończyć pracę programu wpisz 'quit'");
                Scanner scanner = new Scanner(System.in);
                String command = scanner.nextLine();
                if (command.equals("add")) {
                    System.out.println("podaj nazwę użytkownika");
                    String name = scanner.nextLine();
                    System.out.println("podaj email użytkownika");
                    String email = scanner.nextLine();
                    System.out.println("podaj hasło użytkownika");
                    String password = scanner.nextLine();
                    boolean groupIdLoop = true;
                    int groupIdInt = 0;
                    while (groupIdLoop) {
                        System.out.println("podaj numer grupy do której należy użytkownik");

                        String grupIdString = scanner.nextLine();
                        try {
                            groupIdInt = Integer.parseInt(grupIdString);
                            groupIdLoop = false;
                        } catch (Exception e) {
                            System.out.println("musisz podać liczbę naturalną");
                        }
                    }
                    User user = new User(1, name, email, password, groupIdInt);
                    userDao.create(user);
                } else if (command.equals("edit")) {
                    boolean userIdLoop = true;
                    int userIdInt = 0;
                    while (userIdLoop) {
                        System.out.println("podaj numer użytkownika");
                        String userIdString = scanner.nextLine();
                        try {
                            userIdInt = Integer.parseInt(userIdString);
                            userIdLoop = false;
                        } catch (Exception e) {
                            System.out.println("musisz podać liczbę naturalną");
                        }
                    }
                    System.out.println("podaj nazwę użytkownika");
                    String name = scanner.nextLine();
                    System.out.println("podaj email użytkownika");
                    String email = scanner.nextLine();
                    System.out.println("podaj hasło użytkownika");
                    String password = scanner.nextLine();
                    boolean groupIdLoop = true;
                    int groupIdInt = 0;
                    while (groupIdLoop) {
                        System.out.println("podaj numer grupy do której należy użytkownik");

                        String grupIdString = scanner.nextLine();
                        try {
                            groupIdInt = Integer.parseInt(grupIdString);
                            groupIdLoop = false;
                        } catch (Exception e) {
                            System.out.println("musisz podać liczbę naturalną");
                        }
                    }
                    User user = new User(userIdInt, name, email, password, groupIdInt);
                    userDao.update(user);
                } else if (command.equals("delete")) {
                    boolean userIdLoop = true;
                    int userIdInt = 0;
                    while (userIdLoop) {
                        System.out.println("podaj numer użytkownika");
                        String userIdString = scanner.nextLine();
                        try {
                            userIdInt = Integer.parseInt(userIdString);
                            userIdLoop = false;
                        } catch (Exception e) {
                            System.out.println("musisz podać liczbę naturalną");
                        }
                    }
                    userDao.delete(userIdInt);
                } else if (command.equals("quit")) {
                    programLoop = false;
                } else {
                    System.out.println("Podałeś niepoprawną komendę");
                }
            }
//        }
    }
}
