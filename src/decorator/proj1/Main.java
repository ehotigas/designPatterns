package decorator.proj1;

import decorator.proj1.ImageProcessor.BasicImageProcessor;
import decorator.proj1.ImageProcessor.IImageProcessor;
import decorator.proj1.ImageProcessor.ResizeImageProcessor;
import decorator.proj1.ImageProcessor.WatermarkImageProcessor;

public class Main {
    public static void main(String[] args) {
        IImageProcessor processor = new BasicImageProcessor();
        processor = new WatermarkImageProcessor(processor, "test");
        processor = new ResizeImageProcessor(processor, 100, 100);
        processor.process("test");
    }
}
