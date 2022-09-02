public class Code06_PrintB {
    public static void print(int num){
        for (int i=31;i>=0;i--){
            System.out.print((num&(1<<i))==0? "0":"1");
        }
        System.out.println();
    }

    public static void print1(int num){
        for (int i = 31; i >=0 ; i--) {
            System.out.print((num&(1<<i))==0?0:1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //print(1);
        int test =100;
        //System.out.println(test<<1);

        int a= Integer.MAX_VALUE;
        //System.out.println(a);
        //print(-1);
        int b =  -2;
        int c = -1;
        print1(b);
        print(c);
        print(b | c );//111111
        print(b ^ c );//111111
        print(b & c);//0000000
//        System.out.println(b);
//        System.out.println(c);
    }
}
