package javaproject;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;

public class checkAnswer {
    public static void main(String[] args) {
    }

    public static String checkAnswerMethod(int[] result) {
    	if (result[0] == 4) {
    		return "정답입니다!";
    	}
    	
    	else{
    		return result[0] + "S" +result[1] + "B입니다";
    	}
    }

}


