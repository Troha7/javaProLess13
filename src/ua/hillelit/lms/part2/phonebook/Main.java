package ua.hillelit.lms.part2.phonebook;

public class Main {

  public static void main(String[] args) {

    Phonebook.add(new Writing("Peter", "911"));
    Phonebook.add(new Writing("Vasil", "0997777777"));
    Phonebook.add(new Writing("Ivan", "0666767678"));
    Phonebook.add(new Writing("Vasil", "123456789"));
    Phonebook.add(new Writing("Peter", "097777765"));

    System.out.println(Phonebook.find("Peter"));

    System.out.println(Phonebook.findAll("Vasil"));

  }

}
