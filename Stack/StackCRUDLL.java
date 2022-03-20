class StackLL{
    LinkedList head;
    LinkedList LL;
    int size;
    StackLL(){
       LL = null;
       size = 0;
       head = LL;
    }
    int size(){
        return size;
    }
    int pushValue(int val){
        LinkedList n = new LinkedList(val,LL);
        size++;
        head = n;
        return 1;
    }
    int popValue(){
        if(size == 0){
            return -1;
        }
        else{
            LinkedList curr = head;
            head = head.next;
            size--;
            return curr.data;
        }
    }
    int peekValue(){
        if(head==null){
            return -1;
        }
        else{
            return head.data;
        }
    }
    void show(){
        LinkedList headptr = head;
        while(headptr !=null){
            System.out.print(headptr.data+" ");
            headptr = headptr.next;
        }
    }
}
class StackCRUDLL {
    public static void main(String[] args) {
        StackLL st = new StackLL();
        st.pushValue(1);
        //st.show();
        //st.popValue();
        System.out.println(st.popValue());
        System.out.println(st.popValue());
        st.show();
    }
}
