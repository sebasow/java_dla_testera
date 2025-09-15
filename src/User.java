public class User {

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    User(String firstName, String lastName, String email, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    void getFullName(){
        System.out.println(firstName + " " + lastName);
    }

    void getFullInfo(){
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }


    int getUserAge(){
        return age;
    }

    boolean isUserAdult(){
        return age >= 18;
    }


    void greetings(String name){
        System.out.println("Hello " + name + ". Nice to meet you!");
    }

    void greetings(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName + ". Nice to meet you!");
    }

    void howOldAreYou (String name, int userAge){
        System.out.println("Hi " + name + ". You are " + userAge + " old age");
    }

    int yourAgePlusTen(int userAge){
        return userAge + 10;
    }



}

