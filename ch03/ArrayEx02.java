package ch03;

public class ArrayEx02 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("배열의 크기 : " + numbers.length);

        // 향상된 기능의 for
        for (int value : numbers) {
            System.out.println(value);
        }

        System.out.println("================");

        // 베열의 크기만 선언
        int[] nums = new int[5];
        nums[0] = 1;
        nums[3] = 3;
        // nums 의 0번째 위치에 5를 누적
        nums[0] = nums[0] +5;

        // nums[5] = 7;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        for (int i : nums) {
            System.out.println(i);

        }
    }
}
