import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            // 숫자 랜덤설정
            int[] inputArr = CreateRandomNumber.random();

            String input = br.readLine();

            // 입력받은 문자열 배열화
            int[] inputArr = StringArrayConvert.func(input);

            // 배열에서 숫자 처리 -> bulls and cows
            int[] checkArr = bullsAndCows(inputArr); // pull Request 부탁드려요

            if(checkArr[0]==4){
                // 정답 체크 함수
                String answer = checkAnswer(checkArr); // pull Request 부탁드려요

                System.out.println(answer);
                System.out.println("4개의 숫자를 모두 맞히셨습니다! 게임 종료");
                break;
            }else {
                String answer = checkAnswer(checkArr);

                System.out.println(answer);
            }
        }














    }
}