public class Arrayproblem {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = new int[4];
        array[0]= 6;
        array[1] = 15;
        array[2]= 4;
        array[3] = 2;
        int max = array[0];
       for(int i =0;i<array.length;i++){
           if(array[i] % 2!=0){
               if(max < array[i] ){
                   max = array[i];

               }
           }

       }
        System.out.println(max);
    }
}
