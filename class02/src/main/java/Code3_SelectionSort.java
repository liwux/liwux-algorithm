public class Code3_SelectionSort {
    public static void main(String[] args) {
        int maxLen = 5;
        int maxValue = 1000;
        int testTime = 10000;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = lenRandomValueRandom(maxLen,maxValue);
            int[] arr2 = copyArray(arr1);
            selectionSort(arr1);
            bubbleSort(arr2);
            if (!isSort(arr1)){
                for (int j = 0; j <arr2.length ; j++) {
                    System.out.print(arr2[j]+" ");
                }
                System.out.println();
                System.out.println("选择排序错了");
                break;
            }
        }

    }

    //返回一个数组arr,arr长度[0,maxLen-1],arr中每个值[0,maxValue-1]
    public static int[] lenRandomValueRandom(int maxLen,int maxValue){
        int length = (int)Math.random()*maxLen;
        int[] arr =new int[length];
        for (int i = 0; i <length ; i++) {
            arr[i] = (int)Math.random()*maxValue;
        }

        return arr;

    }

    public static int[] copyArray(int[] arr){
        int[] ans= new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

    //arr1和arr2一定等长
    public static boolean equalValues(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

    //arr1和arr2一定等长
    public static boolean isSort(int[] arr){
        if (arr.length<2){
            return true;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max>arr[i]){
                return false;
            }
            max = Math.max(max,arr[i]);
        }
        return true;
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
