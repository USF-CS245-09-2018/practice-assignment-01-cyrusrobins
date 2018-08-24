public class FibonacciIterative implements Fibonacci {

    @Override
    public int fibonacci(int n) {
        int num1 = 1;
        int num2 = 1;
        int fibNum = 0;
        if(n==0||n==1)
            return 1;
        for(int i=2;i<n;i++){
            fibNum = num1+num2;
            num1 = num2;
            num2 = fibNum;
        }
        return fibNum;
    }
}
