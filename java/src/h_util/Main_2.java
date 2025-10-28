package h_util;

public class Main_2 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("abc").append("de");

        StringBuffer sb2 = new StringBuffer("abc").append("de");
        System.out.println("sb == sb2 : " + (sb==sb2));
        System.out.println("sb equals sb2 : " + (sb.equals(sb2)));
        System.out.println("sb str == sb2 str : " + (sb.toString().equals(sb.toString())));

        StringBuffer sb3 = new StringBuffer(32);
        System.out.println("버퍼 크기 : " + sb3.capacity());
        System.out.println("문자열 추가 : " + sb3.append("hello"));
        System.out.println("문자열 사이 추가 : " + sb3.insert(2 , " he"));
        System.out.println("문자열 사이 제거 : " + sb3.delete(5,32));
        System.out.println("문자열 바꾸기 : " + sb3.replace(0 , 2 , "sui"));
        System.out.println("문자열 뒤바꾸기 : " + sb3.reverse());
        System.out.println(sb);
    }
}
