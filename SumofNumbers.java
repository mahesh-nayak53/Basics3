public class SumofNumbers {
    public static void main(String[] args){
        int[] arr = {23,4,5,6,4,10};

        int sum = 0;
        for(int x : arr){
            sum += x;
        }

        System.out.println("sum of numbers is : "+ sum);
    }      
}
