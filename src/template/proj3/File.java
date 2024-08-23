package template.proj3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class File implements IFile {
    private String content;
    private String path;

    public File(String path, String content) {
        this.path = path;
        this.content = content;
    }

    public File(String path) {
        this(path, "");
    }


    @Override
    public String read() throws IOException {
        return String.join(
            "\n",
            Files.readAllLines(Paths.get(path))
        );
    }

    @Override
    public void write() throws IOException {
        Files.write(
            Paths.get(path),
            Arrays.asList(content.split("\n"))
        );
    }

    @Override
    public boolean exists() {
        return Files.exists(Paths.get(path));
    }

    @Override
    public void delete() throws IOException {
        Files.delete(Paths.get(path));
    }


    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getPath() {
        return path;
    }
}
