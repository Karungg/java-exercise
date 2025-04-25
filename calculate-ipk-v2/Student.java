public class Student {
    private String name;
    private String nim;

    public Student(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }

    @Override
    public String toString() {
        return "Nama : " + name + ". NIM : " + nim;
    }
}
