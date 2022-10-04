package ua.hillelit.lms.homework.part2.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

  private static final List<Writing> writingList = new ArrayList<>();

  public static void add(Writing writing) {
    writingList.add(writing);
  }

  public static String find(String name) {

    for (Writing personInfo : writingList) {
      if (name.equals(personInfo.getName())) {
        return personInfo.toString();
      }
    }

    return null;
  }

  public static String findAll(String name) {

    StringBuilder findAll = new StringBuilder();

    for (Writing personInfo : writingList) {
      if (name.equals(personInfo.getName())) {
        findAll.append(personInfo).append("\n");
      }
    }

    if (findAll.toString().isEmpty()) {
      return null;
    }

    return findAll.toString();
  }

}
