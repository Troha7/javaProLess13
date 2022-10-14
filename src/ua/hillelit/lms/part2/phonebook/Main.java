package ua.hillelit.lms.part2.phonebook;

public class Main {

  public static void main(String[] args) {

    Phonebook phonebook = new Phonebook();
    phonebook.add(new Writing("Peter", "911"));
    phonebook.add(new Writing("Vasil", "0997777777"));
    phonebook.add(new Writing("Ivan", "0666767678"));
    phonebook.add(new Writing("Vasil", "123456789"));
    phonebook.add(new Writing("Peter", "097777765"));

    System.out.println(phonebook.find("Peter"));

    System.out.println(phonebook.findAll("Vasil"));

  }

}
