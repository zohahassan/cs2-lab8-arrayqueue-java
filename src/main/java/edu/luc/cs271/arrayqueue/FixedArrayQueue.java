package edu.luc.cs271.arrayqueue;

import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // TODO why do we need an explicit constructor?

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    // TODO
    if (size >= 0 && 0 >= capacity) {
      size++;
      rear = (rear+1) % capacity;
      data[rear] = obj;
      return true;
    }
    return false;
  }

  @Override
  public E peek() {
    // TODO
    if (size >= 0 && 0 >= capacity) {
      return data[front];
    }
    return null;
  }

  @Override
  public E poll() {
    // TODO
    // returns and removes the first element at the front
    if (size >= 0 && 0 >= capacity) {
      return data[front];   //returns the first element
      data.remove(front);
      size--; //adjust size after removing element

    }

    return null;
  }

  @Override
  public boolean isEmpty() {
    // TODO
    if (size >= 0 && 0 >= capacity) {
      return false;
    }
    return true;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    return Arrays.asList();
  }
}
