package Algorithm;

import java.util.NoSuchElementException;

// ArrayList 를 Array로 구현
/*
ArrayList 특징
    연속된 공간에 할당되는 방식.
    탐색이 빠르다
    삽입이나 삭제 시 최악의 경우 O(N) 시간 복잡도
    첫번째 요소와 맨 뒤 요소 삭제 O(1) 시간 복잡도
 */
public class ArrList <E>{
    private E a[];
    private int size;

    public ArrList() {
        a = (E[]) new Object[1];
        size = 0;
    }

    // k번째 값을 읽는다
    public E peek(int k){
        if (size == 0) throw new NoSuchElementException();
        return a[k];
    }
    // 가장 뒤에 노드 삽입
    public void insertLast(E newItem){
        // 현재 a 크기가 size와 같다면 (공간이 없다면) resize메소드 통해 크기 조절
        if (size == a.length) resize(2*a.length);
        a[size++] = newItem;
    }
    // k번째 자리에 새 노드 삽입
    public void insert(E newItem, int k){
        if (size == a.length) resize(2*a.length);
        // 맨 뒤에부터 k까지 한자리씩 뒤로 옮김
        for (int i = size -1; i >= k; i--) a[i+1] = a[i];
        // k번째 자리에 새 노드 삽입
        a[k] = newItem;
        size++;
    }
    // 배열의 크기를 조절
    private void resize(int newSize){
        // 새로운 사이즈의 t를 생성
        Object[] t = new Object[newSize];
        // 반복문을 돌면서 a에 있는 값 t에 넣어줌
        for (int i = 0; i < size; i++){
            t[i] = a[i];
        }
        a = (E[]) t;
    }
    // k번째 항목 삭제
    public E delete(int k){
        // 배열이 현재 비어있다면 예외 발생
        if (isEmpty()) throw new NoSuchElementException();
        E item = a[k];  // k번째 값 item 변수에 저장
        for (int i = k; i < size; i++){  // k번째부터 한칸씩 앞으로 이동
            a[i] = a[i+1];
        }
        size--; // k번째 항목 삭제
        if (size > 0 && size == a.length/4) {
            // 현재 배열이 1/4 크기가 되면 배열 크기 1/2 축소
            resize(a.length/2);
        }
        return item;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void print(){
        if (isEmpty()) System.out.println("배열이 비어 있음");
        else {
            for (int i = 0; i < size; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

}
