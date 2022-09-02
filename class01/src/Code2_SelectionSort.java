public class Code2_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,7,9,6,8};
        if (arr==null || arr.length<2){
            print(arr);
        }else {
            //selectionSort(arr);
            //bubbleSort(arr);
            //insertSort(arr);
            insertSort2(arr);
            print(arr);
        }
    }

    public static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    public static void selectionSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int minValueIndex=i;
            for (int j=i+1;j<arr.length;j++){
               minValueIndex = arr[j]<arr[minValueIndex]?j:minValueIndex;
            }
            swap(arr,i,minValueIndex);
        }
    }

    public static void bubbleSort(int[] arr){
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr.length-i-1;j++){
//                int maxValueIndex=j+1;
//
//                maxValueIndex = arr[j]>arr[maxValueIndex]?maxValueIndex:j;
//                swap(arr,j,maxValueIndex);
//            }
//        }
        int N=arr.length;
        for (int end = N-1;end>=0;end --){
            for (int second=1;second<=end;second++){
                if (arr[second-1]>arr[second]){
                    swap(arr,second-1,second);
                }
            }
        }
    }


    public static void insertSort(int[] arr){
        int N = arr.length;
        for (int end=1;end <N;end++){
            int newNumberIndex = end;
            while (newNumberIndex-1>=0 && arr[newNumberIndex-1]>arr[newNumberIndex]){
                swap(arr,newNumberIndex-1,newNumberIndex);
                newNumberIndex--;
            }

        }
    }

    public static void insertSort2(int[] arr){
        int N = arr.length;
        for (int end=1;end <N;end++){
            for (int pre=end-1;pre>=0&&arr[pre]>arr[pre+1];pre--){
                swap(arr,pre,pre+1);
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
