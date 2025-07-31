package file;

public class TextFile extends File {
    private String content;

    public TextFile(String name, String content) {
        super(name);

        this.content = content;
    }

    @Override
    public long getSize() {
        return content.length();
    }
}
