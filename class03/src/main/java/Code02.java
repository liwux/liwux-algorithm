public class Code02 {

    //arr是有序的，>=num最左的位置
    public static int mostLeftNolessNumIndex(int[] arr,int num){
        if (arr==null||arr.length==0){
            return -1;
        }
        int L=0;
        int R=arr.length-1;
        int ans = -1;
        while (L<=R){
            int mid = (L+R)/2;
            if (arr[mid]>num){
                 ans=mid;
                 R = mid-1;
            }else {
                L = mid+1;
            }
        }
        return ans;
    }
}
