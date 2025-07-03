package quiz02;

public class Lotto {
    public static void main(String[] args) {
        // 1~45 사이의 랜덤 값 6개 생성
        // 모든 수는 서로 달라야함
        // 로또 번호를 담을 배열 선언
        int[] lottoNumber = new int[6];
        //로또 생성 수를 카운트
        int i = 0;


        while (i < 6) {
            //중복여부를 체크하는 플래그
            boolean flag = false;

            // 로또 번호를 하나 생성
            int num = (int) (Math.random() * 45) + 1;
            // 같은 번호가 있는지 확인

            for (int j = 0; j < lottoNumber.length; j++) {
                if (num == lottoNumber[i]) {
                    flag = true;
                    break;
                }


            }
            //새로 생성한 값이 있는지 확인
            if (flag == false) {
                lottoNumber[i] = num;
                System.out.println(num);
                i++;
            } else {
                flag = false;
            }


        }
    }

}

