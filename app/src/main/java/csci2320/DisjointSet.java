package csci2320;

public class DisjointSet<E> {
  /**
   * Makes a new disjoint set that represents the provided element type.
   * @param <E> The element type.
   * @param elem The representative element for the set.
   * @return A new disjoint set whose only element in the one provided.
   */
  public static <E> DisjointSet<E> makeSet(E elem) {
    // TODO: Implement
    throw new UnsupportedOperationException("Method not implemented.");
  }

  // TODO: Add any member data/constructors here.

  /**
   * Returns the representative element for the current set. This should be
   * the <code>elem</code> that the set was created with.
   * @return
   */
  public E getElement() {
    // TODO: Implement
    throw new UnsupportedOperationException("Method not implemented.");
  }

  /**
   * Union <code>this</code> to <code>that</code>.
   * @param that the other set to union with the current one.
   */
  public void union(DisjointSet<E> that) {
    // TODO: Implement
    throw new UnsupportedOperationException("Method not implemented.");
  }

  /**
   * Finds the representative set for the current set. Note that this is not
   * the element data. That is done with <code>getElement</code>.
   * @return the root of the tree this set is part of.
   */
  public DisjointSet<E> findSet() {
    // TODO: Implement
    throw new UnsupportedOperationException("Method not implemented.");
  }
}
