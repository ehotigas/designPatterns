package decorator.proj1.ImageProcessor;

public class BasicImageProcessor implements IImageProcessor {

    @Override
    public void process(String path) {
        System.out.println("Basic Image Processor");
    }
}
