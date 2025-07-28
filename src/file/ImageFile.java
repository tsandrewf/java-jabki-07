package file;

public class ImageFile extends File {
    int width;
    int height;
    int bytesPerPixel;

    public ImageFile(String name, int width, int height, int bytesPerPixel) {
        super(name);

        this.width = width;
        this.height = height;
        this.bytesPerPixel = bytesPerPixel;
    }

    @Override
    public long getSize() {
        return ((long) this.width) * ((long) this.height) * ((long) this.bytesPerPixel);
    }
}
