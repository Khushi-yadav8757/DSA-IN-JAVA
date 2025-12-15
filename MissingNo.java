//Missing Number in Array (1 to N)
class Main {
    public static int missingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(missingNumber(arr, 5));
    }
}
