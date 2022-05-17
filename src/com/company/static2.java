package com.company;

/*
* static 선언이 필요한 변수
* 클래스 변수이다.
* 클래스에 존재하지만 클래스에 속하지않은 static 변수
* */
 class static2 {
    static int instNum = 100; //클래스 변수

    static2() {
        instNum++;
        System.out.println("인스턴스 생성 : " + instNum);
    }
}
    class ClassVar{
        public static void main(String[] args) {
            static2 cnt1 = new static2();
            static2 cnt2 = new static2();
            static2 cnt3 = new static2();
        }
    }

    class onlyCLassnoInstanse{
        public static void main(String[] args){
            static2.instNum -=25;
            System.out.println(static2.instNum);
        }
    }

