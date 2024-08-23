package template.proj3;

import java.io.IOException;

public interface IFile {
    String read() throws IOException;
    void write() throws IOException;
    String getPath();
    String getContent();
}
