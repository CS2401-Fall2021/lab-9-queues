# Lab 9: Queues

In this lab you will be modeling a system that handles requests. However your system has a few strange requirements

* It is slow to boot up. So unless you have at least 3 requests, nothing will happen
* It gets tired after too many reuqests, so it stops processing after 6 requests.
* There a high-priority and low-priority requests. Your system should respond to the high-priority requests before any of the low-priority requests
## Part 1: Request.java (5pts, 5 lines of code)
Define a Class Request in Request.java to have a String message and a boolean isHighPriority. Include the following method:
* Public void printRequest() which prints out "Handling Request:" + this request's message.
> Important: make sure you print out the message exactly as mispelling/missing punctuation will result in failed autograders.

## Part 2: Node.java (5 pts, 5 lines of code)
Define a Class Node which has the following fields:
* Node next 
* Request value

## Part 3: RequestQueue.java (60 pts, 50 lines of code)
Implement the following methods in RequestQueue.java.

> Hint: since you have different priorities, you won't want to use a single queue to represent your request queue.
1) public boolean isEmpty(): returns if there are no items in the queue
2) public int getSize(): returns number of items in the queue
3) public void add(Request request): adds a Request to your Queue. 
4) public boolean process(): removes all requests from your Queue if there are at least 3 requests. Calls printQuery on each request that is removed in the order it is removed. Returns true if it processed requests, false otherwise. 
   

Remember:
1) You should print nothing if there is no Query to remove.
2) You should not remove anything unless there are at least 3 requests
3) You should remove a maximum of 6 requests in a single Process() call.

## Part 4: ModelRequests.java main() method. (30 pts)
This is where you will implement your tests of RequestQueue's methods. There should be two (distinct) tests per method in addition to the existing example. Make sure you:
* Describe what you are testing in a comment
* Identify input
* Describe the expected output
* Call the method with said input to obtain actual output
