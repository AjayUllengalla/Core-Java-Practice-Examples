public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = { 6,5,8,2,9,4};
        int n = nums.length;
        int temp=0;
        System.out.println("before sorting");
        for(int num : nums) {
            System.out.print(num + " ");
        }
        for(int i=0;i<n;i++) {
            for(int j = 0; j<n - i -1; j++) {
                if(nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

                }
            System.out.println(" ");
            for(int num : nums) {
                System.out.print(num + " ");
        }
        }
        System.out.println(" ");
        System.out.println("After sorting");
        for(int num : nums) {
            System.out.print(num + " ");

        }
    }

}
