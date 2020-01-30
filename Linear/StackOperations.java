import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackOperations {

    private final List<Character> LeftObjs = Arrays.asList('(' ,'{' , '[' ,'<');
    private final List<Character> RightObjs = Arrays.asList(')' ,'}' , ']' ,'>');

    public String Reverse(String input){
        Stack<Character> list = new Stack<>();
        /*
        for(int i = 0 ; i < input.length() ; i++){
            list.push(input.charAt(i));
        }
        String reverse = "";
        while(!list.isEmpty()){
            char item = list.pop();
            reverse += item;
        }
        */
        for(char ch : input.toCharArray()){
            list.push(ch);
        }
        StringBuffer reverse = new StringBuffer();
        while(!list.isEmpty()){
            reverse.append(list.pop());
        }
        return reverse.toString();
    }

    public boolean BalanceParanthesis(String input){
        Stack<Character> list = new Stack<>();
        for(char ch : input.toCharArray()){
            if(isLeft(ch)){
                list.push(ch);
            }
            else if(isRight(ch)){
                if(list.isEmpty()){
                    return false;
                }
                char top = list.pop();
                if(!MatchChar(top , ch)){
                    return false;
                }
            }
        }
        if(list.size() > 0){
            return false;
        }
        return true;
    }

    private boolean isLeft(char a){
        if(LeftObjs.contains(a)){
            return true;
        }
        return false;
    }

    private boolean isRight(char a){
        if(RightObjs.contains(a)){
            return true;
        }
        return false;
    }

    private boolean MatchChar(char a , char b){
        if(LeftObjs.indexOf(a) == RightObjs.indexOf(b)){
            return true;
        }
        return false;
    }
}

class AbhiStack{

    private int[] stack;
    private int size;

    public AbhiStack(int size){
        stack = new int[size];
        this.size = size;
    }

    private static int count = -1;

    public int pop(){
        if(count == -1){
            throw new IllegalArgumentException();
        }
        int ret = stack[count];
        count--;
        return ret;
    }

    public void push(int item){
        if(count == size-1){
            throw new StackOverflowError();
        }
        stack[++count] = item;
    }

    public int peek(){
        if(count == -1){
            throw new IllegalArgumentException();
        }
        return stack[count];
    }

    public boolean isEmpty(){
        if(count == -1){
            return true;
        }
        return false;
    }

    public void Print(){
        System.out.println(Arrays.toString(Arrays.copyOfRange(stack , 0 , count+1)));
    }
}