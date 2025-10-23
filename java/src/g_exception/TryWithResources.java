package g_exception;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResources implements AutoCloseable {

    public void method01() {
        int score = 0;

        try(FileInputStream fis = new FileInputStream("wow.txt");
            DataInputStream dis = new DataInputStream(fis)) {

            while(true) {
                score += dis.readInt();
            }

        } catch (EOFException e) {
            System.out.println("파일 조회 끝 : " + score);
        } catch (IOException e) {
            System.out.println("예외 발생");
            e.printStackTrace();
        }
    }

    public void method02(boolean flag) throws Exception {
        System.out.println("메서드가 호출되었습니다.");

        if(flag)
            throw new Exception("예외가 발생하였습니다.. ;ㅅ;");

    }

    @Override
    public void close() throws Exception {
        System.out.println("Close 가 호출되었습니다.");
        throw new Exception("이또한 예외가 발생했네요..");
    }
}
