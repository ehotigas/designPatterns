package decorator.proj1.ImageProcessor;

public class ResizeImageProcessor implements IImageProcessor {
    private IImageProcessor processor;
    public ResizeImageProcessor(IImageProcessor processor, int height, int width) {
        this.processor = processor;
    }

    @Override
    public void process(String path) {
        processor.process(path);
        System.out.println("Resizing image");
        
    }
}
