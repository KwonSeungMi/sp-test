import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Queue {
    static HashMap<String, String[]> totalQueue = new HashMap<String, String[]>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            String[] input = String.valueOf(sc.nextLine()).split(" ");

            if (input[0].equals("create")) {
                CreateQueue(input);
            }
            ;
            if (input[0].equals("enqueue")) {
                EnQueue(input);
            }
            if (input[0].equals("dequeue")) {
                // DeQueue(input);
            }

        }

    }

    public static void CreateQueue(String[] input) {
        if (totalQueue.get(input[1]) != null) {
            System.out.println("Queue Exist");
        } else {

            String[] queue = new String[Integer.valueOf(input[2])];

            totalQueue.put(input[1], queue);
            System.out.println("Queue Created : " + queue.length);

        }

    }

    public static void EnQueue(String[] input) {
        System.out.println(totalQueue);
        if (totalQueue.get(input[1]) == null) {
            System.out.println("Queue Not Exist");
        } else {
            String[] queue = totalQueue.get(input[1]);
            int count = 0;
            for (int ifr = 0; ifr < queue.length; ifr++) {
                count++;
                if (queue[ifr] == null) {
                    queue[ifr] = input[2];
                    count = -1;
                    break;
                }
            }
            if (count == -1) {
                totalQueue.put(input[1], queue);
                System.out.println("Enqueued");
            }

            else {
                System.out.println("Queue Full");

            }

        }

    }

    public static void DeQueue(String[] input) {
        String[] queue = totalQueue.get(input[1]);
        if (queue == null) {
            System.out.println("Queue Not Exist");
        } else {
            if (queue[0] == null) {
                System.out.println("Queue Empty");
            } else {
                System.out.println(queue[0] + " , " + 0);
            }

        }

    }

}
