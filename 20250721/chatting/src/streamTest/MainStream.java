package streamTest;

import java.io.InputStream;

public class MainStream {
    public static void main(String[] args) {

        // 1 바이트 씩 밖에 전송이 안됨.
        InputStream in = System.in; // 키보드 입력(Byte Stream)
        try {
            // 1. 키보드에서 A를 인코딩 010000 으로 컴퓨터 전송
            // 2. ByteStream 을 통해서 input
            // 3. read() 읽어요... 010000 -> 65 변환
            // 4. 65 숫자를 부호화(디코딩) -> 출력
            int data = in.read();
            System.out.println((char) data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
