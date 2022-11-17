public class GreaterNum {
    public static void main(String[] args) {
        int a = 5;
        int b = 17;
        int c= 9;
        int d = 11;
        //int max = arr[0];
        if(a>b && a>c && a>d){
            System.out.println(a);
        }
        if(b>a && b>c && b>d){
            System.out.println(b);
        }
        if (c>a && c>b && c>d){
            System.out.println(c);
        }
        if(d>a && d>b && d>c){
            System.out.println(d);
        }

    }

}
