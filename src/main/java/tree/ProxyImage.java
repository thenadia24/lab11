package tree;

import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements MyImage{
    private Map<String, MyImage> c = new HashMap<>();
    private String file;

    @Override
    public void display(){
        MyImage image;
        if (c.containsKey(file)) {
            image = c.get(file);
        } else {
            image = new RealImage(file);
            c.put(file,image);
        }
        image.display();
    }
    public ProxyImage(String file) {
        this.file = file;
    }
}