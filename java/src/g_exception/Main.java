package g_exception;

public class Main {

    public static void main(String[] args) throws Exception {
        TryCatchTest tct = new TryCatchTest();
        System.out.println("0번 째");
        tct.method12(false);

        System.out.println("---");
        System.out.println("0번 째");
        tct.method12(true);

        try(TryWithResources twr = new TryWithResources())  {
            System.out.println("try-with-resource 실행");
            twr.method02(true);
        } catch (Exception e) {
            System.out.println("종료..");
            e.printStackTrace();
        }

    }

}
