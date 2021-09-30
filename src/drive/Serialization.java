package drive;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

final class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Bar bar = new Bar();
        bar.b = 456;
        bar.f = 10;

        FileOutputStream fos = new FileOutputStream("bar.ser");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(bar);
        oos.close();

        FileInputStream fis = new FileInputStream("bar.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Bar b = (Bar) ois.readObject();
        System.out.println(b.f + " | " + b.b);

    }
}
