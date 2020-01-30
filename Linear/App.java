import java.util.Arrays;
//import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        AbhiStack stack = new AbhiStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.Print();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.Print();
    }

    /*

    public static void StackOperationsTesting(){
        StackOperations operate = new StackOperations();
        String a = operate.Reverse("Abhilash");
        System.out.println(a);
        System.out.println(operate.BalanceParanthesis("({{{<1> + <2>}}{}})"));
    }

    public static void CustomLinkedList(){
        LinkedList List = new LinkedList();
        List.AddLast(1);
        List.AddLast(2);
        List.AddLast(3);
        List.AddLast(4);
        System.out.println(Arrays.toString(List.toArray()));
        System.out.println("-----------------------------------");
        List.AddFirst(0);
        System.out.println(Arrays.toString(List.toArray()));
        System.out.println("-----------------------------------");
        System.out.println(List.IndexOf(2));
        System.out.println("-----------------------------------");
        System.out.println(List.Contains(100));
        System.out.println("-----------------------------------");
        List.DeleteFirst();
        List.DeleteLast();
        System.out.println(Arrays.toString(List.toArray()));
        System.out.println("-----------------------------------");
        System.out.println(List.SizeOf());
        System.out.println("-----------------------------------");
        System.out.println(Arrays.toString(List.toArray()));
        System.out.println("-----------------------------------");
        List.Reverse();
        System.out.println(Arrays.toString(List.toArray()));
        System.out.println("-----------------------------------");
        List.DeleteAtIndex(2);
        System.out.println(Arrays.toString(List.toArray()));
        System.out.println("-----------------------------------");
        System.out.println(List.SizeOf());
        System.out.println("-----------------------------------");
        System.out.println(List.KthNodeFromEnd(2));
    }

    public static void DefaultLinkedList(){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        System.out.println(list.contains(5));
        System.out.println(list);
    }

    public static void check_arrays(){
        //array_print();
        //array_print_2();

        Array numbers = new Array();
        numbers.Insert(10);
        numbers.Insert(20);
        numbers.Insert(30);
        numbers.Insert(40);
        numbers.Insert(50);
        //numbers.Print();
        numbers.RemoveAt(0);
        numbers.RemoveAt(3);
        //numbers.Print();
        numbers.InsertAt(0 , 10);
        //numbers.Print();
        numbers.InsertAt(4 , 50);
        //System.out.println(numbers.IndexOf(50));
        numbers.Print();
    }

    public static void array_print(){
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int value : arr) System.out.println(value);
    }

    public static void array_print_2(){
        int[] arr = {10 , 20 , 30};
        System.out.println(Arrays.toString(arr));
    }
    */
}
