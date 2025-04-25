import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            header();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addStudent(scanner, students);
                    showStudents(students);
                    break;
                case 2:
                    showStudents(students);
                    break;
                case 3:
                    updateStudent(scanner, students);
                    break;
                case 4:
                    System.out.println("Pilihan 4");
                    break;
                case 5:
                    System.out.println("Pilihan 5");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (choice != 5);

        scanner.close();

    }

    public static void header() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan Mahasiswa");
        System.out.println("3. Ubah Mahasiswa");
        System.out.println("4. Hapus Mahasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilih: ");
    }

    public static void addStudent(Scanner scanner, ArrayList<Student> students) {
        System.out.println("Tambah Mahasiswa");
        System.out.println("Nama : ");
        String name = scanner.nextLine();
        System.out.println("NIM : ");
        String nim = scanner.nextLine();
        students.add(new Student(name, nim));
    }

    public static void showStudents(ArrayList<Student> students) {
        String title;
        if (students.isEmpty()) {
            title = "=".repeat(10) + " TIDAK ADA DATA YANG DAPAT DITAMPILKAN " + "=".repeat(10);
        } else {
            title = "=".repeat(10) + " DATA MAHASISWA " + "=".repeat(10);
        }
        System.out.println("=".repeat(title.length()));
        System.out.println(title);
        for (int i = 0; i < students.size(); i++) {
            System.out.println("No." + (i + 1) + " " + students.get(i));
        }
        System.out.println("=".repeat(title.length()));
    }

    public static void updateStudent(Scanner scanner, ArrayList<Student> students) {
        
    }
}