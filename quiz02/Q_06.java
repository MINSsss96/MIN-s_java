package quiz02;

public class Q_06 {
    //문제 6. 다음 점수들에 대한 순위계산을 한 후 출력하세요
    //
    //85, 50, 90, 75, 85, 60, 89, 98, 83, 65
    //
    //문제 7. 임의의 서로다른 세자리 숫자를 사용자가 입력하여 맞추는 게임입니다.
    //ⓐ 랜덤하게 서로 다른 세자리 숫자를 생성합니다.
    //ⓑ 사용자에게 서로다른 세자리 숫자를 입력받습니다.
    //    a, b를 통해 입력받은 수는 세자리 공간을 갖는 배열에 분리하여 저장합니다.
    //         String[] str = sc.next().split("");
    //    위 명령어로 입력받은 숫자를 문자열 배열에 각각 나누어 저장할 수 있습니다.
    //         123 입력 → str[0] = 1, str[1] = 2, str[2] = 3
    //    Integer.parseInt 함수로 정수로 변환 할 수 있습니다.
    //ⓒ 입력받은 세자리 숫자와 랜덤하게 생성한 숫자를 비교하여
    //   - 자리와 숫자까지 완전 일치하면 : strike
    //   - 자리는 일치하지 않지만 숫자가 존재한다면 : ball
    //ⓓ 총 10번의 기회를 부여해 게임을 진행합니다.
    //   - 10회 이하로 맞춘 경우
    //     정답입니다!!!
    //   - 10회 동안 못 맞춘경우
    //     실패했습니다!!! 정답은 000입니다.
    //
    //예> 생성 : 390
    //1번째. 서로 다른 세 자리 정수를 입력해 주세요.> 123
    //0 strike, 1 ball
    //2번째. 서로 다른 세 자리 정수를 입력해 주세요.> 145
    //0 strike, 0 ball
    //3번째. 서로 다른 세 자리 정수를 입력해 주세요.> 236
    //0 strike, 1 ball
    //4번째. 서로 다른 세 자리 정수를 입력해 주세요.> 389
    //1 strike, 1 ball
    //5번째. 서로 다른 세 자리 정수를 입력해 주세요.> 381
    //1 strike, 0 ball
    //6번째. 서로 다른 세 자리 정수를 입력해 주세요.> 307
    //1 strike, 1 ball
    //7번째. 서로 다른 세 자리 정수를 입력해 주세요.> 379
    //1 strike, 1 ball
    //8번째. 서로 다른 세 자리 정수를 입력해 주세요.> 390
    //3 strike, 0 ball
    //정답입니다!!!
    //계속하시겠습니까(Y/N)
    public static void main(String[] args) {

    }
}
