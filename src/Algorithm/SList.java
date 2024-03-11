package Algorithm;

import java.util.NoSuchElementException;

public class SList <E>{
    protected Node head;
    private int size;

    public SList() {
        this.head = null;   // 현재 맨 앞에 노드 비어있음
        this.size = 0;      // 리스트 값 0
    }
    // 다음 타켓을 탐색
    public int search(E target){
        Node p = head;
        for (int k = 0; k < size; k++){
            if (target == p.getItem()) return k;
            p = p.getNext();
        }
        return -1;
    }
    // 연결리스트 맨 앞에 새 노드 삽입
    public void insertFront(E newItem){
        // 노드 클래스의 생성자에서 newIntem 자리는 아이템이, head자리는 next이므로
        // 현재 head가 next로 바뀌면서 맨 앞에 다른 노드가 들어왔음을 의미
        head = new Node(newItem, head);
        size++;
    }
    // p 다음에 새 노드 삽입
    public void insertAfter(E newItem, Node p){
        // 현재 newItem을 p다음 노드로 정하고
        // 해당 노드의 다음 노드를 p의 원래 다음 노드로 설정
        p.setNext(new Node(newItem, p.getNext()));
        size++;
    }
    // 맨 앞 노드 삭제
    public void deleteFront(){
        if (size == 0) throw new NoSuchElementException();
        // 현재 head가 가리키고 있는 리스트의 다음값을 가리키므로서 연결을 끊음
        head = head.getNext();
        size--;
    }
    // 현재 p가 가리키고 있는 다음 노드를 삭제
    public void deleteAfter(Node p){
        if (p == null) throw new NoSuchElementException();
        Node t = p.getNext();
        // 현재 p가 가리키고 있는 노드의 다음 노드를 설정
        p.setNext(t.getNext());
        // 다음 노드 연결 끊음
        t.setNext(null);
        size--;
    }
    public void print(){
        if (size == 0) System.out.println("현재 비어있음.");
        Node p = head;
        for (int i = 0; i < size; i++){
            System.out.print(p.getItem() + " ");
            p = p.getNext();
        }
    }
    public int size(){
        return size;
    }
}
