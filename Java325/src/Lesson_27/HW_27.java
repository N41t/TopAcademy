package Lesson_27;

/*
toDo: Реализовать методы
Нельзя добавлять одного и того же пользователя, сделать это через проверки equals() и hashcode()
 */



import java.util.Objects;
import java.util.Scanner;

public class HW_27 {
    static public boolean checkUnikalLogin(User[] users , String login){
        for (int i = 0; i < users.length; i++) {
            if (users[i]!=null &&
                    users[i].getLogin().equals(login)){
                return  true;
            }
        }

        return false;
    }

    public static void changeLogin(User[] users , String login) {

    }

    public static void main(String[] args) {
        String action, name, login, password, repeadPassword;

        Scanner scanner = new Scanner(System.in);
        int index = 0;
        User[] users = new User[100];

        while (true) {
            scanner = new Scanner(System.in);
            System.out.println("1 - Sign in");
            System.out.println("2 - Registration");
            System.out.println("3 - Print Users");
            System.out.println("4 - Exit");
            System.out.print("\nEnter: ");
            action = scanner.nextLine();

            if (action.equals("1")) {
                System.out.println("Sign in");
                scanner = new Scanner(System.in);
                System.out.println("Enter Login : ");
                login = scanner.nextLine();
                System.out.println("Enter Password : ");
                password = scanner.nextLine();

                boolean isSignIn = false;
                int user  = 0;
                for (int i = 0; i < index; i++) {
                    if (users[i].getPassword().equals(password) &&
                            users[i].getLogin().equals(login)){
                        isSignIn = true;
                        user = i;
                        break;
                    }
                }

                while (isSignIn){
                    scanner = new Scanner(System.in);
                    System.out.println("Dobro pojolovat v proqramu " + users[user].getName());
                    System.out.println("1 - Change login");
                    System.out.println("2 - Change password");
                    System.out.println("3 - Change name");
                    System.out.println("4 - Back");
                    System.out.println("5 - Exit");

                    action = scanner.nextLine();

                    if (action.equals("1")) {

                        while(true) {
                            System.out.println("Input new login: ");
                            String newLogin = scanner.nextLine();

                            if (newLogin.isEmpty()) {
                                System.out.println("Login cannot be empty!");
                            } else if (checkUnikalLogin(users, newLogin)){
                                System.out.println("This login already exists");
                            } else {
                                users[user].setLogin(newLogin);
                                System.out.println("Login was successfully changed");
                                break;
                            }

                        }

                    } else if (action.equals("2")) {

                        while(true) {

                            System.out.println("Enter new password: ");
                            String newPassword = scanner.nextLine();
                            System.out.println("Enter repeat new password : ");
                            String repeatNewPassword = scanner.nextLine();

                            if (newPassword.isEmpty() && repeatNewPassword.isEmpty()) {
                                System.out.println("Password cannot be empty!");
                            } else if (!(newPassword.equals(repeatNewPassword))){
                                System.out.println("Password mismatch");
                            } else {
                                users[user].setPassword(newPassword);
                                System.out.println("Password was successfully changed");
                                break;
                            }

                        }

                    } else if (action.equals("3")) {

                        while (true) {
                            System.out.println("Enter new name: ");
                            String newName = scanner.nextLine();

                            if (newName.isEmpty()) {
                                System.out.println("Name cannot be empty!");
                            } else {
                                users[user].setName(newName);
                                System.out.println("Name was successfully changed");
                                break;
                            }
                        }

                    } else if (action.equals("4")) {
                        break;
                    }else {
                        System.out.println("Ne pravilniy vvod");
                    }


                }
            } else if (action.equals("2")) {
                System.out.println("Registration");
                scanner = new Scanner(System.in);
                System.out.println("Enter Login : ");
                login = scanner.nextLine();
                System.out.println("Enter Name : ");
                name = scanner.nextLine();
                System.out.println("Enter Password : ");
                password = scanner.nextLine();
                System.out.println("Enter Repead Password : ");
                repeadPassword = scanner.nextLine();

                if (repeadPassword.equals(password) ){
                    if (!checkUnikalLogin(users,login)){
                        User user = new User(login, password, name);

                        users[index] = user;
                        index++;

                        System.out.println("Vas polzovatel bil zaregistrirovan");
                    }else{
                       System.out.println("Danniy login zanet");
                    }
                }else{
                    System.out.println("Paroli ne sovpadayut");
                }


            } else if (action.equals("4")) {
                System.out.println("Bye bye");
                break;
            } else if (action.equals("3")) {
                if (index>0){
                    System.out.println("Print Users");
                    for (int i = 0; i < index; i++) {
                        System.out.println(users[i].getInfo());
                    }
                }else{
                    System.out.println("Users empty");
                }

            } else {
                System.out.println("Error enter number");
            }
        }
    }
    }

class User {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, name);
    }

    private String login;
    private String password;
    private String name;

    public User(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public String getInfo(){
        String pass = "";
        for (int i = 0; i < password.length(); i++) {
            pass+="*";
        }
        return this.name + "  ( " + this.login + " " + pass + " ) ";
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

