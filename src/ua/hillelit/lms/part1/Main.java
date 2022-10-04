package ua.hillelit.lms.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    String[] arrWords = {"wolf", "fox", "cat", "bird", "dog", "pig", "duck", "cat", "fish", "bird"};
    List<String> words = new ArrayList<>(Arrays.asList(arrWords));
    String str = "bird";
    System.out.println("Count occurance: " + countOccurance(words, str));

    Double[] arrNum = {1.0, 2.0, 3.0, 4.0, 5.0};
    System.out.println(toList(arrNum));

    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 4, 5, 6, 6));
    System.out.println("Find unique numbers: " + findUnique(numbers));

    calcOccurance(words);

    System.out.println(findOccurance(words));

  }

  private static int countOccurance(List<String> words, String str) {

    if (words == null || str == null) {
      return 0;
    }

    int count = 0;

    for (String word : words) {

      if (word == null) {
        return 0;
      }
      if (word.contains(str)) {
        count++;
      }

    }
    return count;
  }

  private static List<Number> toList(Number... arrNum) {
    if (arrNum == null) {
      return null;
    } else {
      return new ArrayList<>(Arrays.asList(arrNum));
    }
  }

  private static <T extends Number> List<T> findUnique(List<T> numList) {

    List<T> uniqueNumList = new ArrayList<>();

    for (T number : numList) {
      if (!uniqueNumList.contains(number)) {
        uniqueNumList.add(number);
      } else {
        uniqueNumList.remove(number);
      }
    }

    return uniqueNumList;
  }

  private static void calcOccurance(List<String> words) {

    for (String word : words) {
      int count = 0;
      for (String s : words) {
        if (word.contains(s)) {
          count++;
        }
      }
      System.out.println(word + ": " + count);
    }

  }

  private static List<String> findOccurance(List<String> words) {

    List<String> findWords = new ArrayList<>();
    List<String> countWords = new ArrayList<>();

    for (String word : words) {
      if (!findWords.contains(word)) {
        findWords.add(word);
      }
    }

    for (String findWord : findWords) {
      int count = 0;
      for (String word : words) {
        if (findWord.contains(word)) {
          count++;
        }
      }
      countWords.add("{name: \"" + findWord + "\", occurrence: " + count + "}");
    }

    return countWords;
  }

}
