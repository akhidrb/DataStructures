public class MinHeap {

  private int[] Heap;
  private int size;
  private int maxSize;

  public MinHeap(int maxSize) {
    this.maxSize = maxSize;
    this.size = 0;
    Heap = new int[maxSize + 1];
    Heap[0] = Integer.MIN_VALUE;
  }

  private boolean isLeaf(int pos) {
    return pos <= size && pos > (size / 2);
  }

  private int getParent(int pos) {
    return pos / 2;
  }

  private int getLeftChild(int pos) {
    return pos * 2;
  }

  private int getRightChild(int pos) {
    return (pos * 2) + 1;
  }

  private void swap(int fpos, int spos) {
    int tmp = Heap[fpos];
    Heap[fpos] = Heap[spos];
    Heap[spos] = tmp;
  }

  private boolean hasRightChild(int pos) {
    return getRightChild(pos) <= size;
  }

  private void minHeapify(int pos) {
    if (!isLeaf(pos)) {
      if (Heap[pos] >  Heap[getLeftChild(pos)] ||
          (hasRightChild(pos) && Heap[pos] > Heap[getRightChild(pos)])) {
        int minChildIndex = getLeftChild(pos);
        if (hasRightChild(pos) && Heap[getLeftChild(pos)] > Heap[getRightChild(pos)]) {
          minChildIndex = getRightChild(pos);
        }
        swap(pos, minChildIndex);
        minHeapify(minChildIndex);
      }
    }
  }

  public void insert(int element) {
    if (size == maxSize) return;
    Heap[++size] = element;
    int current = size;
    while (current > 1 && Heap[current] < Heap[getParent(current)]) {
      swap(current, getParent(current));
      current = getParent(current);
    }
  }

  public int pop() {
    int popped = Heap[1];
    Heap[1] = Heap[size--];
    minHeapify(1);
    return popped;
  }

  public void print() {
    for (int i=1; i <= size / 2; i++) {
      StringBuilder strB = new StringBuilder();
      strB.append("Node: ").append(Heap[i]).append(", ");
      strB.append("Left: ").append(Heap[getLeftChild(i)]);
      if (hasRightChild(i)) {
        strB.append(", ").append("Right: ").append(Heap[getRightChild(i)]);
      }
      System.out.println(String.valueOf(strB));
    }
  }

}
