import java.util.*;

public class ArrayList {
  public static void main(String[] args) {
    List<Integer> a = new LinkedList<Integer>();

    for (int i = 0; i < 10; i++) {
      a.add(i);
    }

    for (int j = 0; j < 10; j++) {
      System.out.println(a.get(j));
    }
  }
}
