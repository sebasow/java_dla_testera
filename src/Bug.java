public class Bug {

    String title;
    String bugDescirption;
    String authorEmail;
    int priority;
    boolean isOpen;

    Bug(String title, String bugDescirption, String authorEmail, int priority){
        this.title = title;
        this.bugDescirption = bugDescirption;
        this.authorEmail = authorEmail;
        this.priority = priority;
        this.isOpen = true;
    }

    void getAllInfo(){
        System.out.println("Informacje na temat błędu:\n" + title + " " + bugDescirption + " " + authorEmail + " " + priority + " " + isOpen);
    }

    void getAuthorEmail(){
        System.out.println("Osoba zgłaszająca błąd: " + authorEmail);
    }

    void getBugStatus(){
        if (isOpen) {
            System.out.println("Bug otwarty");
        }
        else {
            System.out.println("Bug zamknięty");
        }
    }

    int getPriority(){
        return priority;
    }

}
