package d_statement;

import java.util.Scanner;

public class Statement {

    public void StatementEx1() {
        final int THREE = 3;

        switch (3) {
            case 1:
                System.out.println("this is 1");
            case 2:
                System.out.println("this is 2");
            case THREE:
                System.out.println("this is 3");
            case 4:
                System.out.println("this is 4");
            case 'a':
                System.out.println("this is 5");
        }
    }

    public void StatementEx2() {
        switch ("a") {
            case "b":
                System.out.println("this is 1");
            case "c":
                System.out.println("this is 2");
            case "d":
                System.out.println("this is 3");
            case "a":
                System.out.println("this is 4");
            //case "b":
            case "ab":
                System.out.println("this is 5");
        }
    }

    public void StatementEx3() {
        for(int i = 1; i < 1; i++) {
            System.out.println("실행되나?");
        }

        int i = 0;
        for(System.out.println("테스트"); true ; System.out.println("헐")) {
            if(i > 10) break;
            i++;
            System.out.println("실행되니 : ");
        }
    }

    public void StatementEx4() {
        int arr[] = {1,2,3,4,5};

        for(int input : arr) {
            System.out.println(input);
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void StatementEx5() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }

    public void StatementEx6() {
        int i = 6;
        while(--i!=0) {
            System.out.println("카운트 다운 : " + i);

            for(int j = 0; j <= 2_000_000_000; j++) ;

        }

        System.out.println("폭발!");
    }

    public void StatementEx7() {
        int i = 0;
        for( ; i < 5; i++);
        {
            System.out.println(i);
        }
    }

    public void StatementEx8() {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while(input > 0) {
            int temp = input % 10;
            sum += temp;

            input /= 10;
        }

        System.out.println(sum);
    }

    public void StatementEx9() {
        Loop1 : for(int i = 1; i <= 9; i++) {
            System.out.printf("[ %d 단 ] \n", i);
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d \n", i , j , i*j);

                if(i * j > 30) {
                    //continue Loop1; // Loop #1
                    break Loop1;
                }

                continue; // Loop #2
                // break;
            }
        }

        System.out.println("[출력 완료]");
    }

}
