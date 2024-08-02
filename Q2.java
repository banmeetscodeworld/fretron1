//Q2-
import java.util.*;


public class MyClass {
    public static void distributeApples(ArrayList<Integer> list, int share, ArrayList<Integer> personList) {
        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int weight = iterator.next();
            if (sum + weight <= share) {
                sum += weight;
                personList.add(weight);
                iterator.remove();
            }
        }
    }
  public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      int total= sc.nextInt();//total amount paid
      int x= sc.nextInt();//ram paid
      int y= sc.nextInt();//sham paid
      int z= sc.nextInt();//rahim paid
      
      System.out.println("run distribute_apple");
      int w=0;
      ArrayList<Integer> list= new ArrayList<>();
      while(w!= -1){
          w= sc.nextInt();
          System.out.println("Enter apple weight in gram (-1 to stop ) : "+w);
          list.add(w);
      }
      
      list.remove(list.size() - 1);//removing -1
      int totalWeight = 0;
      for (int weight : list) {
          totalWeight += weight;
      }

      //getting total share for each person
      int xShare = (x * totalWeight) / total;
      int yShare = (y * totalWeight) / total;
      int zShare = (z * totalWeight) / total;

      Collections.sort(list, Collections.reverseOrder());//sorting list in descending order
      /*for(int i=0;i<list.size();i++){
          System.out.print(list.get(i)+" ");
      }*/
      
      ArrayList<Integer> xAns= new ArrayList<>();
      ArrayList<Integer> yAns= new ArrayList<>();
      ArrayList<Integer> zAns= new ArrayList<>();
      //calculating apples for each person
      
      distributeApples(list, xShare, xAns);
      distributeApples(list, yShare, yAns);
      distributeApples(list, zShare, zAns);
      
      System.out.println("Apples for Ram: " + xAns);
      System.out.println("Apples for Sham: " + yAns);
      System.out.println("Apples for Rahim: " + zAns);
  }
}



