import java.util.*;
class ArrayCRUD{
    static void insertAtStart(int[] arr, int val){
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=val;
        for(int i:arr){
            System.out.println(i);
        }
    }
    static void insertAtEnd(int[] arr, int val){
        arr[arr.length-1] = val;
        for(int i:arr){
            System.out.println(i);
        }
    }
    static void insertAtGivenPosition(int[] arr, int pos, int val){
        if(pos>arr.length-1 || pos<0){
            System.out.println("position exceeded index number");
        }
        else{
            for(int i=arr.length-1;i>pos;i--){
                arr[i]=arr[i-1];
            }
            arr[pos]=val;
            for(int i:arr){
                System.out.println(i);
            }
        }
    }
    static void insertInSortedArray(int[] arr, int val){
        for(int i=arr.length-1;i>0;i--){
            if(arr[i-1]>val){
                arr[i]=arr[i-1];
            }
            else{
                arr[i]=val;
                return;
            }
        }
        arr[0] = val;
    }
    static void deleteAtStart(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void deleteAtEnd(int[] arr){
        arr[arr.length-1]=-1;
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void deleteGivenNumber(int[] arr, int val){
        int pos=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                pos=i;
                break;
            }
        }
        if(pos>=0){
            while((pos+1)<arr.length){
                arr[pos]=arr[pos+1];
                pos++;
            }
            for(int i:arr){
                System.out.print(i+" ");
            }
        }else{
            System.out.println("NNumber not found");
        }
    }
    static void deleteAtGivenIndex(int[] arr, int index){
        if(index<0 || index>=arr.length){
            System.out.println("Not a valid index");
        }
        else{
            while((index+1)<arr.length){
                arr[index] = arr[index+1];
                index++;
            }
            
            for(int i:arr){
                System.out.print(i+" ");
            }
        }
    }
    static void removeDuplicatesFromSortedArray(int[] arr){
        int i=0,j=1;
        while(i<arr.length-1){
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i+1];
                j++;
            }
            i++;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    static void printAllElements(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    static void reverseArray(int[] arr){
        int left=0, right=arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        printAllElements(arr);
    }
    static void printMinAndMax(int[] arr){
        int maxnum=arr[0],minnum=arr[0];
        for(int i=0;i<arr.length;i++){
            maxnum=Math.max(maxnum,arr[i]);
            minnum=Math.min(minnum,arr[i]);
        }
        System.out.println("max num: "+maxnum+" min num: "+minnum);
    }
    static void sumOfArrayElements(int[] arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println(sum);
    }
    static boolean checkIfArrayIsSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0};//0 is just for extra space
        //insertAtStart(arr, 5);
        int[] arr1 = {2,5,6,9,10,0};
        //insertAtEnd(arr1, 11);
        int[] arr2={3,4,5,6,10,12,0};
        //insertAtGivenPosition(arr2, 9, 7);
        int[] arr3={1,2,3,5,7,8,0};
        insertInSortedArray(arr3, 4);
        // for(int i:arr3){
        //     System.out.println(i);
        // }
        int[] arr4 = {1,2,3,5,4};
        //deleteAtStart(arr4);
        //deleteAtEnd(arr4);
        int[] arr5={1,2,3,5,6,8,9};
        //deleteGivenNumber(arr5, 5);
        //deleteAtGivenIndex(arr5, 2);
        int[] arr6={1,1,2,2,3,4,5,6,6};
        //removeDuplicatesFromSortedArray(arr6);
        //reverseArray(arr6);
        //printMinAndMax(arr6);
        //sumOfArrayElements(arr6);
        int[] arr7={2,3,4,5,6,2};
        System.out.println(checkIfArrayIsSorted(arr7));
    }
}