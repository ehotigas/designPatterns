package decorator.proj1.ImageProcessor;

public class WatermarkImageProcessor implements IImageProcessor {
    private IImageProcessor processor;
    public WatermarkImageProcessor(IImageProcessor processor, String watermark) {
        this.processor = processor;
    }

    @Override
    public void process(String path) {
        processor.process(path);
        System.out.println("Watermark added");
    }
}
