package _11_danh_sach.thuc_hanh.bai_1;

//Bước 1: Tạo lớp MyGenericStack với các thuộc tính:
import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }
    //Bước 2: Cài đặt phương thức push()
    public void push(T element) {
        stack.addFirst(element);
    }
    //Bước 3: Cài đặt phương thức pop()
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack.removeFirst();


    }
    //Bước 4: Cài đặt phương thức size()
    public int size() {
        return stack.size();
    }
    //Bước 5: Cài đặt phương thức isEmpty()
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }


}
