public class Random {
    /**
     * 根据3~19的随机数，写出20~56的随机
     * @param args
     */
    public static void main(String[] args) {
        int testTime=10000000;
        int[] counts = new int[64];
//        for (int i = 0; i < testTime; i++) {
//            int ans = f1();
//            counts[ans]++;
//        }
//        for (int i = 0; i < counts.length; i++) {
//            System.out.println(i + "这个数出现"+counts[i]+"次");
//        }
//        System.out.println("======================");

        for (int i = 0; i < testTime; i++) {
            int ans =g();
            counts[ans]++;
        }
        for (int i = 0; i < 64; i++) {
            System.out.println(i + "这个数出现"+counts[i]+"次");
        }
    }

    public static int f1(){
        return (int)(Math.random()*17);
    }

    public static int f2(){
        int ans =0;
        do {
            ans= f1();
        }while (ans==8);
        return ans<8?0:1;
    }

    //0~36的随机概率
    public static int f3(){
        int sum = 0;
        for (int i = 5; i>=0; i--) {
            sum= sum+(f2()<<i);
        }
        return sum;
    }

    public static int f4(){
        int ans=0;
        do {
           ans = f3();
        }while (ans>36);
        return ans;
    }

    public static int g(){
        return f4()+20;
    }
}
