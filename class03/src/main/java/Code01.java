import java.util.Arrays;

public class Code01 {
    public static void main(String[] args) {
        int maxLen = 5;
        int maxValue = 1000;
        int testTime = 10000;
        boolean succeed= true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = lenRandomValueRandom(maxLen,maxValue);
            Arrays.sort(arr1);
            int value = (int) (((maxValue+1)*Math.random())-(int)(maxValue*Math.random()));
            if (test(arr1,value)!=find(arr1,value)){
                System.out.println("出错了");
                succeed = false;
                break;
            }
        }
        System.out.println("Nice~~");

    }

    public static boolean find(int[] arr,int num){
        if (arr==null||arr.length==0) {
            return false;
        }
        int L =0;
        int R = arr.length;
        while (L<=R){
            int mid = (L + R)/2;
            if (arr[mid]==num) return true;
            else if (arr[mid]<num) {
                L = mid +1;
            }else {
                R = mid-1;
            }
        }
        return false;
    }

    //for test
    public static boolean test(int[] sortedArr,int num){
        for (int cur:sortedArr) {
            if (cur==num){
                return true;
            }
        }
        return false;
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


}
