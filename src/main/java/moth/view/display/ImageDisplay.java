package moth.view.display;

import moth.model.entity.Image;

public class ImageDisplay {

    public void show(Image image) {
        System.out.println("Image: " + image.getFilename());
        System.out.println("Password: " + "*".repeat(image.getPassword().length()));
    }
}
