import java.util.Arrays;
import java.util.Scanner;
public class Test {
  static Request r0= new Request("h0",/*isHighPriority=*/ true);
  static Request r1= new Request("h1",/*isHighPriority=*/ true);
  static  Request r2= new Request("h2",/*isHighPriority=*/ true);
  static Request r3= new Request("h3",/*isHighPriority=*/ true);
  static  Request r4= new Request("l0",/*isHighPriority=*/ false);
  static Request r5= new Request("l1",/*isHighPriority=*/ false);
  static Request r6= new Request("l2",/*isHighPriority=*/ false);
  static Request r7= new Request("l3",/*isHighPriority=*/ false);

  static Request[] requests={r0,r1,r2,r3,r4,r5,r6,r7};
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    String[] inputs=line.split("-");
    int[] array;
    if(inputs.length>1) {
      array= Arrays.stream(inputs[1].split(","))
          .map(String::trim).mapToInt(Integer::parseInt).toArray();
    } else {
      array = new int[]{};
    }
    RequestQueue rq= new RequestQueue();
    processRequests(rq,array);
    if(inputs[0].equals("size")){
      System.out.println("size:"+rq.getSize());
    }
    if(inputs[0].equals("empty")){
      System.out.println("size:"+rq.isEmpty());
    }
    if(inputs[0].equals("p1")){
      System.out.println("p1:"+rq.process());
    }
    if(inputs[0].equals("p2")){
      System.out.println("p2:"+rq.process());
      int[] array2;
      if(inputs.length>1) {
        array2= Arrays.stream(inputs[2].split(","))
            .map(String::trim).mapToInt(Integer::parseInt).toArray();
      } else {
        array2 = new int[]{};
      }
      processRequests(rq,array2);
      System.out.println("p2:"+rq.process());
    }
  }
  public static void processRequests(RequestQueue rq, int[] array){
    for(int i: array){
      rq.add(requests[i]);
    }
  }
}
