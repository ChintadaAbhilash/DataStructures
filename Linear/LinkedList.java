public class LinkedList {

    private static class Node {
        private int Value;
        private Node next;

        public Node(int item){
            this.Value = item;
        }
    }

    private Node First;
    private Node Last;

    private int Size;

    // isEmpty
    // O(1)
    public boolean isEmpty(){
        return First == null;
    }

    // Add First
    // O(1)
    public void AddFirst(int item){
        Node node = new Node(item);

        if(isEmpty()){
            First = Last = node;
        }
        else {
            node.next = First;
            First = node;
        }

        Size++;
    }

    // Add Last
    // O(1)
    public void AddLast(int item){
        Node node = new Node(item);
        if(isEmpty()){
            First = Last = node;
        }
        else {
            Last.next = node;
            Last = node;
        }

        Size++;
    }

    // Delete First
    // O(1)
    public void DeleteFirst() throws NoSuchFieldException {
        if (isEmpty()){
            throw new NoSuchFieldException();
        }

        if (First == Last){
            First = Last = null;
            Size = 0;
            return;
        }

        Node temp = First.next;
        First.next = null;
        First = temp;

        Size--;
    }

    // Delete Last
    // O(n)
    public void DeleteLast() throws NoSuchFieldException {
        if(isEmpty()){
            throw new NoSuchFieldException();
        }
        if(First == Last){
            First = Last = null;
            Size = 0;
            return;
        }

        Node temp = First;
        Node prev = null;

        while(temp != Last){
            prev = temp;
            temp = temp.next;
        }

        prev.next = null;
        Last = prev;

        Size--;
    }

    // Delete at Index
    // O(n)
    public void DeleteAtIndex(int index) throws NoSuchFieldException , IllegalArgumentException {
        if(isEmpty()){
            throw new NoSuchFieldException();
        }
        else if(index >= Size || index < 0){
            throw new IllegalArgumentException();
        }
        Node previous = First;
        Node current = First.next;

        if(index == 0){
            if(Size == 1){
                First = Last = null;
            }
            else{
                Node temp = First.next;
                First.next = null;
                First = temp;
            }
            Size--;
            return;
        }

        int count = 1;
        while(current.next != null){
            if(count == index){
                previous.next = current.next;
                current.next = null;
                Size--;
                return;
            }
            count += 1;
            previous = current;
            current = current.next;
        }
        previous.next = null;
        Last = previous;
        Size--;
    }

    // Contains
    // O(n)
    public boolean Contains(int item){
        if(!isEmpty()){
            Node temp = First;
            while(temp != null) {
                if (temp.Value == item) return true;
                temp = temp.next;
            }
            return false;
        }
        return false;
    }

    // Index of
    // O(n)
    public int IndexOf(int item){
        if (!isEmpty()) {
            Node temp = First;
            int count = 0;
            while (temp != null) {
                if (temp.Value == item) return count;
                temp = temp.next;
                count++;
            }
            return -1;
        }
        return -1;
    }

    // Size
    // O(1)
    public int SizeOf(){
        return Size;
    }

    // Print
    // O(n)
    public void Print(){
        if(First == null && Last == null){
            System.out.println(" Empty LinkedList ");
        }
        else{
            Node temp = First;
            while(temp != null){
                System.out.println(temp.Value);
                temp = temp.next;
            }
        }
    }

    // ToArray
    // O(n)
    public int[] toArray(){
        int[] array = new int[Size];
        Node temp = First;
        int index = 0;
        while(temp != null){
            array[index++] = temp.Value;
            temp = temp.next;
        }
        return array;
    }

    // Reverse
    // O(n)
    public void Reverse(){
        if(isEmpty()){
            System.out.println(" No Elements to be reversed ");
            return;
        }
        else if(First == Last){
            return;
        }

        Node current = First.next;
        Node previous = First;
        Node upcoming = current.next;

        while (current != null){
            if(current == upcoming) upcoming = current.next;
            current.next = previous;
            if(previous == First){
                previous.next = null;
            }
            previous = current;
            current = upcoming;
        }
        Last = First;
        First = previous;
    }

    // Kth Node from End
    // O(n)
    public int KthNodeFromEnd(int k) throws NoSuchFieldException , IllegalArgumentException{
        if(isEmpty()){
            throw new NoSuchFieldException();
        }
        else if(k > Size || k <= 0){
            throw new IllegalArgumentException();
        }

        Node previous = First;
        Node current = First;

        int distance = 0;

        while(current != null){
            if(current == Last){
                return previous.Value;
            }
            if(distance == k-1){
                previous = previous.next;
                current = current.next;
            }
            else{
                current = current.next;
                distance++;
            }
        }
        return -1;
    }
}
