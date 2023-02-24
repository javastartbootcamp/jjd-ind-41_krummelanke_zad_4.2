import java.io.PrintStream;

class Task {
    private String name;
    private String description;
    private int priority = -88;
    private Person assignee;

    public Task(String name, String description, int priority, Person assignee) {
        this(name, description, priority);
        this.assignee = assignee;
    }

    public Task(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;

    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;

    }

    private boolean highPriority() {
        if (priority > 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean mediumPriority() {
        if (priority == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean lowPriority() {
        if (priority < 0 && priority != -88) {
            return true;
        } else {
            return false;
        }
    }

    private void showPriority() {
        if (highPriority()) {
            System.out.printf("Priorytet zadania jest wysoki%n%n");
        } else if (mediumPriority()) {
            System.out.printf("Priorytet zadania jest normalny%n%n");
        } else if (lowPriority())  {
            System.out.printf("Priorytet zadania jest niski%n%n");
        } else {
            System.out.printf("Priorytet zadania jest nieokreślony%n%n");
        }
    }

    public void showTask() {
        String basicInfo = ("Zadanie: " + name + " - " + description);
        if (assignee == null) {
            System.out.println(basicInfo + ", zadanie nie ma przypisanej osoby");
            showPriority();
        } else {
            System.out.println(basicInfo + ", osoba odpowiedzialna: " + assignee.firstName +
                    " " + assignee.lastName + " - " + assignee.jobTitle);
            showPriority();
        }

    }
}
