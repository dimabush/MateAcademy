package homework.twelve;

import java.util.stream.IntStream;

public class RandomStream {
  public static IntStream pseudoRandomStream(int seed) {
    return IntStream.iterate(seed, n -> (n * n) % 10000 / 10);
  }
}
