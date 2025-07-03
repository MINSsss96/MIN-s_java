package quiz02;

public class Rank {
    public static void main(String[] args) {
        //성적 데이터
        int[] score = {85, 50, 90, 75, 85, 90, 60, 89, 98, 83, 65};
        // 등수를 담을 배열
        int[] rank = new int[score.length];


        // 각 점수를 회전하기
        for (int i = 0; i < score.length; i++) {
            // 모든 점수와 비교하기
            rank[i] = 1;
            for (int j = 0; j < score.length; j++) {
                // score[i] < score[j] 비교
                // rank[i]++
                if (score[i] < score[j]) {
                    rank[i]++;

                }
            }
        }
        // 원점수
        for (int x : score) {
            System.out.println(x + "");
        }
        System.out.println("--------------");
        // 성적 출력
        for (int x : rank) {
            System.out.println(x + "");
        }
    }
}
