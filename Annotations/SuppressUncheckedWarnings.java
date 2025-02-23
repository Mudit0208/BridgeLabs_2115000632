import java.util.ArrayList;

public class SuppressUncheckedWarnings {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(10);
        list.add(3.14);

        for (Object item : list) {
            System.out.println(item);
        }
    }
}
