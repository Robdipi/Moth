package moth.model.entity;

public class Image {

    private final String filename;
    private final String password;

    public Image(String filename, String password) {
        this.filename = filename;
        this.password = password;
    }

    public String getFilename() {
        return filename;
    }

    public String getPassword() {
        return password;
    }
}
