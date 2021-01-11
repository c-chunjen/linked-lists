public class DoubleLinkedLists {

    public DoubleLinkedLists previous = null;
    public DoubleLinkedLists next = null;
    public int data;

    public DoubleLinkedLists(int d) {
        data = d;
    }

    public void Append(int d) {
        DoubleLinkedLists end = new DoubleLinkedLists(d);
        DoubleLinkedLists current = this;
        
        while(current.next != null) {
            current = current.next;
        }

        end.previous = current;
        current.next = end;
    }

    public static void main(String[] args) {

        DoubleLinkedLists x = new DoubleLinkedLists(1);

        x.Append(2);
        x.Append(3);
        x.Append(4);
        x.Append(5);


        System.out.println(x.data);
        while(x.next != null) {
            x = x.next;
            System.out.print(x.data);
            System.out.println("," + x.previous.data);
        }

    }

}