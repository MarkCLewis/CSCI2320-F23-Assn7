package csci2320;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DisjointSetsTest {
  @Test public void newSetHasElement() {
    var ds = DisjointSet.makeSet("Pat");
    assertEquals("Pat", ds.getElement());
  }
}
