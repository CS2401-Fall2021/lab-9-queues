public class ModelRequests{
  public static void main(String[] args) {
    Request request1= new Request("h1",/*isHighPriority=*/ true);
    Request request2= new Request("h2",/*isHighPriority=*/ true);
    Request request3= new Request("h3",/*isHighPriority=*/ true);
    Request request4= new Request("l1",/*isHighPriority=*/ false);
    Request request5= new Request("l2",/*isHighPriority=*/ false);
    Request request6= new Request("l3",/*isHighPriority=*/ false);
    RequestQueue requestQueue= new RequestQueue();
    System.out.println("expeted is Empty=true. Actual:"+ requestQueue.isEmpty());
    requestQueue.add(request1);
    System.out.println("expeted size=1. Actual:"+ requestQueue.getSize());
    System.out.println("Process should return false as there are not enough querries:"+requestQueue.process());
    requestQueue.add(request2);
    requestQueue.add(request3);
    System.out.println("Process should return true and print h1,h2,h3:"+requestQueue.process());
    requestQueue.add(request4);
    requestQueue.add(request2);
    requestQueue.add(request3);
    System.out.println("Process should return true and print h2,h3,l1:"+requestQueue.process());

    // YOUR OWN TESTS GO HERE:
    // WHAT ARE YOU TESTING FOR?

  }

}