import java.util.ArrayList;
import java.util.List;

public class LambdaQue8
{
  public static void main(String args[])
  {
      Thread t1=new Thread(()->{
          List<Integer> list = new ArrayList<Integer>();
          list.add(2);
          list.add(4);
          list.add(6);
          list.add(8);
          System.out.println(list);
          //Consumer<List<Integer>> numList = list->list.stream();
          //nodify.addThen(numList).accept(list);
      });
      t1.start();
  }
}
