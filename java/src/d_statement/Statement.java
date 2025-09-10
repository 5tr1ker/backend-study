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

        for(int i = 0; i < 5; i++) {
            System.out.println("실행되니 : " + i);
        }
    }

}
