package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by CodeAcademy on 2017.07.11.
 */
public class CharacterStream1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //outputStream();
        inputStream();
    }

    private static void inputStream() throws UnsupportedEncodingException {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\CodeAcademy\\IdeaProjects\\codeacademy\\src\\main\\java\\streams\\text1.txt");
            int characterByte;
            while ((characterByte =  fileInputStream.read()) != -1){
                char character = (char)characterByte;
                stringBuilder.append(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuilder.toString());
    }

    private static void outputStream() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\CodeAcademy\\IdeaProjects\\codeacademy\\src\\main\\java\\streams\\text1.txt");
            fileOutputStream.write(98);
            fileOutputStream.write(97);
            fileOutputStream.write(100);
            fileOutputStream.flush();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
