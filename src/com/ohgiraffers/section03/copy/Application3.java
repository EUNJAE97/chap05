package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application3 {

    public static void main(String[] args) {
        /* 깊은 복사에 대해 이해할 수 있다. */

        /* 원본 배열 */
        int[] originArr = {1, 2, 3, 4, 5};

        print(originArr);

        /* 1. for문을 이용한 동일 인덱스 값 복사 */
        int[] copyArr1 = new int[10];

        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1);

        /* object의 clone()을 이용한 복사
         *  동일한 길이, 동일한 값을 가지는 배열이 생성 되어 복사 되며, 다른주소를 가지고 있다. */

        int[] copyArr2 = originArr.clone();

        print(copyArr2);

        /* 3. Sysyem의 arraycopy()를 이용한 복사 */
        int[] copyArr3 = new int[10];

        /* arraycopy = src 원본배열 ,scrPos (원본에서)복사 시작할 인덱스,dest 복사본배열
         * destPos 복사 시작할 인덱스,length 복사할 길이로 전달한다.*/
        System.arraycopy(originArr, 0, copyArr3, 3, 3);

        print(copyArr3);

        /* 4. Arrays의 copyOf()를 이용한 복사
         *  시작 인덱스부터 원하는 길이만큼 복사해서 사용한다. */
        int[] copyArr4 = Arrays.copyOf(originArr, 7);
        
        print(copyArr4);
    }

    public static void print(int[] iarr) {

        System.out.println("iarr의 hashCode : " + iarr.hashCode());

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");

        }
        System.out.println();
    }
}
