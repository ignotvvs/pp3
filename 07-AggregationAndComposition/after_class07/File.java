package after_class07;

public class File {
    private String name;
    private int size;
    private boolean isHidden;

    public File(String name, int size, boolean isHidden) {
        this.name = name;
        this.size = size;
        this.isHidden = isHidden;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public String toString() {
        return name;
    }

}
