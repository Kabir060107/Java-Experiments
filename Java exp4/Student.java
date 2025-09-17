class Student {
    private String name; 
    private int roll_no;

    public Student() {
        this.name = "John";
        this.roll_no = 2;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + roll_no);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}