package decorator.io;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class LowerCaseInputStreamTest {

    @Test
    public void testRead() {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\NM.Rabotaev\\IdeaProjects\\patterns\\src\\test\\resources\\test.txt")));
            while ((c = in.read())>=0) {
                System.out.print((char)c);
            }
            in.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}