package academy.devdojo.maratonajava.javacore.Mexception.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Leitor 1 fechando...");
    }
}
