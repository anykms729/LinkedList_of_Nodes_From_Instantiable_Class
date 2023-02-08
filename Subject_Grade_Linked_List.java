public class Subject_Grade_Linked_List<T> {
    Node<T> head = null;
    Node<T> tail = null;

    public static void main(String[] args) {
        Subject_Grade subject_grade1 = new Subject_Grade("Data Structure", 1);
        Subject_Grade subject_grade2 = new Subject_Grade("Distributed System", 2);
        Subject_Grade subject_grade3 = new Subject_Grade("Algorithms", 3);
        Subject_Grade subject_grade5 = new Subject_Grade("Data Structure", 5);

        Subject_Grade_Linked_List Subject_Grade_Linked_List = new Subject_Grade_Linked_List();
        Subject_Grade_Linked_List.add(subject_grade1);
        Subject_Grade_Linked_List.add(subject_grade2);
        Subject_Grade_Linked_List.add(subject_grade3);

        // To check if grade is updated when node which has same subject exists

        Subject_Grade_Linked_List.add(subject_grade5);
        System.out.println(Subject_Grade_Linked_List.toString());
        System.out.println("Size: "+Subject_Grade_Linked_List.size());
        System.out.println("Average: "+Subject_Grade_Linked_List.get_average());
    }

    public class Node<T> {
        Subject_Grade data;
        Node<T> next;

        public Node(Subject_Grade data) {
            this.data = data;
            this.next = null;
        }

        public Node(Subject_Grade data, Node<T> next) {
            this.data = data;
            this.next = next;
        }


        @Override
        public String toString() {
            return "Node {" +
                    " data= " + data +
                    '}';
        }
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public int size() {
        Node<T> traverse = head;
        int size = 1;
        while (traverse.next != null) {
            size++;
            traverse = traverse.next;
        }
        return size;
    }

    public double get_average() {
        Node<T> traverse = head;
        double total_Grade = 0;
        double average;

        if (isEmpty() == true) throw new RuntimeException("Empty list");

        while (traverse != null) {
            total_Grade = total_Grade + traverse.data.getGrade();
            traverse = traverse.next;
        }
        average = total_Grade / size();
        return average;
    }

    // To update node if node is found based on given parameter
    public void updateNode(String findSubject, int grade) {
        Node<T> traverse = head;
        do {
            if (traverse.data.getSubject() == findSubject) {
                traverse.data.setGrade(grade);
                return;
            }
            traverse = traverse.next;
        } while (traverse != null);
        return;
    }

    public boolean isExist(String subject) {
        boolean existOrNot = false;

        Node<T> traverse = head;
        while (traverse != null) {
            if (traverse.data.getSubject() == subject) {
                existOrNot = true;
                return existOrNot;
            }
            traverse = traverse.next;
        }
        return existOrNot;
    }

    public void add(Subject_Grade subject_grade) {
        if (isEmpty()) {
            head = tail = new Node<T>(subject_grade, null);
        }
        else if (isExist(subject_grade.getSubject()) == true) {
            updateNode(subject_grade.getSubject(), subject_grade.grade);
        }
        else {
            tail.next = new Node<T>(subject_grade, null);
            tail = tail.next;
        }
    }

    void removeAt(int position) {
        // If linked list is empty
        if (head == null)
            return;
        // Store head node
        Node temp = head;

        // If head needs to be removed
        if (position == 0) {
            head = temp.next; // Change head
            return;
        }

        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next; // Unlink the deleted node from list
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node<T> traverse = head;
        while (traverse != null) {
            sb.append(traverse.data);
            if (traverse.next != null) {
                sb.append(", ");
            }
            traverse = traverse.next;
        }
        sb.append(" ]");
        return sb.toString();
    }
}



