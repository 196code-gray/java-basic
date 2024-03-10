package Algorithm;

import java.util.NoSuchElementException;

// 배열로 연결 리스트 구현하기
/*
연결 리스트 특징
    삽입이나 삭제시 항목들의 이동이 필요 없음
    항목 탐색시 항상 첫 노드부터 원하는 노드를 찾을 때까지 차례로 방문.(순차탐색)
 */
public class Node<E> {
    private E item;
    private Node<E> next;

    public Node(E item, Node<E> node) {
        this.item = item;
        this.next = node;
    }
    public E getItem() {
        return item;
    }
    public Node<E> getNext(){
        return next;
    }
    public void setItem(E item) {
        this.item = item;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }
}
