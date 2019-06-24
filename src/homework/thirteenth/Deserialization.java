package homework.thirteenth;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
  public static Animal[] deserializeAnimalArray(byte[] data) {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
    try (ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
      int size = objectInputStream.readInt();
      Animal[] animals = new Animal[size];
      for (int i = 0; i < size; i++) {
        animals[i] = (Animal) objectInputStream.readObject();
      }
      return animals;
    } catch (ClassNotFoundException | IOException | ClassCastException e) {
      throw new IllegalArgumentException(e);
    }
  }
}
