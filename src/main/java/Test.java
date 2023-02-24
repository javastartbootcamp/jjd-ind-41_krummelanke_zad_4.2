class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", "samozatrudniony");
        Person person2 = new Person("Anna", "Nowak", "kucharka");

        Task task1 = new Task("Sprzątanie", "codzienne sprzątanie biura", -1, person1);
        Task task2 = new Task("Gotowanie", "gotowanie obiadu", 1, person2);
        Task task3 = new Task("Malowanie", "malowanie ścian na biało");
        Task task4 = new Task("Ozonowanie", "dezynfekowanie pomieszczeń ozonem", 0);

        task1.showTask();
        task2.showTask();
        task3.showTask();
        task4.showTask();

    }
}
