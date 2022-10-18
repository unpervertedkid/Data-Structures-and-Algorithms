import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
      long time  = Long.MIN_VALUE;
      for(int i = 100; i < 200; i++){
          long start = System.currentTimeMillis();
          int[] result = solution(i);
          long end = System.currentTimeMillis();
          System.out.print("[");
          for (int num : result){
              System.out.print(num+ " ");
          }
          System.out.print("]\n");
          time = Math.max(time,(end - start));
      }

      System.out.println("Max time taken = " + time + " milliseconds");


  }
  private static int[] solution(int num){
      //List to store the rootsSquared of the numbers
      List<Integer> rootsSquared = new ArrayList<>();
      int remainder = num;
      while(remainder > 0){
          int root = (int) Math.floor(Math.sqrt(remainder));
          int rootSquared = root * root;
          rootsSquared.add(rootSquared);
          remainder -= rootSquared;
      }
      return arrayListToArray(rootsSquared);
  }
  private static int[] arrayListToArray(List<Integer> intArrayList){
      int[] intArray = new int[intArrayList.size()];
      for(int i = 0; i < intArray.length; i++){
          intArray[i] = intArrayList.get(i);
      }
      return intArray;
  }
}
