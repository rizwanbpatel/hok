package drive;

import java.io.BufferedInputStream;
import java.util.Scanner;

final class BracketStringSplit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int K = solution(sc.nextLine());
        System.out.println(K);
    }

    private static int solution(String s) {
        char[] charArray = s.toCharArray();

        int openingBracket = 0;
        int closingBracket = 0;
        boolean openingBracketR = false;
        int count;

        for (int i = 0; i < charArray.length; i++) {
            if (isOpeningBracket(charArray[i])) {
                if (!openingBracketR) {
                    openingBracket++;
                }
            }else{
                closingBracket++;
            }
        }

        if(openingBracket == closingBracket){
            count = closingBracket;
        }else if(openingBracket < closingBracket){
            count = openingBracket + (closingBracket - openingBracket);
        }else{
            count = closingBracket;
        }
        return count;
    }

    private static boolean isOpeningBracket(char c) {
        return c == '(';
    }
}
