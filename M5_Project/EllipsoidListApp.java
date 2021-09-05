import java.util.ArrayList;

public class EllipsoidListApp {

   public static void main(String[] args) {
      Ellipsoid ex1 = new Ellipsoid("ex1", 1,2,3);
      Ellipsoid ex2 = new Ellipsoid("ex2", 2.3,5.5,7.4);
      Ellipsoid ex3 = new Ellipsoid("ex3", 123.4,234.5,345.6);
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
      myList.add(ex1);
      myList.add(ex2);
      myList.add(ex3);
      EllipsoidList testList = new EllipsoidList("Ellipsoid Test List", myList);      
   
      System.out.println(testList);
      System.out.println(testList.summaryInfo());
      
   }


}