class Stack{
    int[] arr;
    int size=0;
    Stack(int x){
        arr = new int[x];
    }
    int size(){
        return size;
    }
    int peekValue(){
        if(size<=0){
            return -1;
        }
        else{
            return arr[size-1];
        }
    }
    boolean pushValue(int val){
        if(size == arr.length){
            return false;
        }
        else{
            arr[size] = val;
            size++;
            return true;
        }
    }
    int popValue(){
        if(size == 0){
            return -1;
        }
        else{
            size--;
            return arr[size];
        }
    }
    void show(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
class StackCRUDArray {
    public static void main(String[] args) {
        Stack st = new Stack(3);
        System.out.println(st.popValue());
        st.show();
        st.pushValue(1);
        st.pushValue(2);
        st.pushValue(3);
        System.out.println(st.pushValue(4));
        st.show();
        System.out.println(st.popValue());
        System.out.println(st.peekValue());
        st.show();
        // System.out.println(st.popValue());
        // System.out.println(st.popValue());
        // System.out.println(st.popValue());
        // System.out.println(st.peekValue());
    }
}
