package ch03;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6};
        // 배열을 선언하면서 초기값을 설정
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

        //배열의 크기를 출력
        System.out.println(nums.length);
        // 객체는 두가지를 갖는다
        // 매서드(M) : 동자을 나타낸다. ->()가 붙는다.
        // 속성(properties) : 값을 갖는다
        // 반복문을 이용해서 배열(nums)의 내용을 출력

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
