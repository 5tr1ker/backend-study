package d_statement;

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
}
