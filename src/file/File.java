package file;

public abstract class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public abstract long getSize();
}
