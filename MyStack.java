public class MyStack {
    public static void main(String[] args) {
        int size=10;
        GStack<String> stringStack=new GStack<String>(size);

        stringStack.push("seoul");
        stringStack.push("busan");
        stringStack.push("LA");
        for(int i=0; i<size; i++) {
            String str = stringStack.pop();
            if(str != null) System.out.println(str);
        }
        GStack<Integer> intStack = new GStack<Integer>(size);
        intStack.push(1);
        intStack.push(3);
        intStack.push(5);
        for(int i=0; i<size; i++) {
            Integer is = intStack.pop();
            if(is != null) System.out.println(is);
        }
    }
}
class GStack<T> {
    private int top=0;
    private T[] arr;
    public GStack(int size) {
        this.arr= (T[]) new Object[size];
    }
    public boolean isStackFull() {
        return top == arr.length;
    }
    public void push(T item) {
        if(!isStackFull())
            this.arr[top++]=item;
        else
            System.out.println("StackIsFull");
    }
    public T pop() {
        if(top==0)
            return null;
        int previousTop = top;
        top--;
        return arr[previousTop -1];
    }
}
