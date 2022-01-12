package com.company;

public class Main {
    /*
    * 열혈 Java 3강
    03-01 상수
    Int num = 3 + 4
    정수를 저장 하는 방법은 바이트,숏,인트, 등등으로 저장 가능
    Final 선언이 붙어 있는 변수 = 상수
    상수의 이름은 모두 대문자로 짓는 것이 관례이다.
    둘이상의 단어로 이루어 질 경우 언더바로 연결한다

    * * */
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        final char CONST_CHAR = '상';
        final int CONST_ASSIGNED;

        CONST_ASSIGNED =12;

        System.out.println(MAX_SIZE);
        System.out.println(CONST_CHAR);
        System.out.println(CONST_ASSIGNED);

    }
}
