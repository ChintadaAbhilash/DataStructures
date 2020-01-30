
public class Array {
    private int[] items;
    private int Count = 0;

    public Array(){
        items = new int[1];
    }

    public void Insert(int Item){
        // O(n) implementation

        // check if Array is full ,
        // if full , resize the array and copy previous into new array
        if(items.length == Count) {
            int[] newItems = new int[Count*2];
            for(int i = 0 ; i < items.length ; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }

        // Insert Element at end of Array
        items[Count++] = Item;
    }

    public void InsertAt(int Index , int Item){
        // Check if Array is full

        if (items.length == Count){
            int[] newItems = new int[Count * 2];
            for(int i = 0 ; i < items.length ; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }

        for(int i = Count - 1 ; i >= Index ; i--){
            items[i+1] = items[i];
        }
        items[Index] = Item;
        Count++;
    }

    public void RemoveAt(int Index){
        // O(n) implementation

        // Validate the index
        if (Index < 0 || Index >= Count) {
            throw new IllegalArgumentException();
        }
        // Copy everything to left
        for (int i = Index ; i < Count ; i++){
            items[i] = items[i+1];
        }
        // Handling the last value
        Count--;
    }

    public int IndexOf(int Value){
        // O(n) implementation

        for(int i = 0 ; i < Count ; i++){
            if(items[i] == Value){
                return i;
            }
        }
        return -1;
    }

    public void Print(){
        // O(n) implementation

        for(int i = 0 ; i < Count ; i++){
            System.out.println(items[i]);
        }
    }
}
