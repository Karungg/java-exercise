import java.util.Scanner;

public class IPK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        header();

        String name = getStringInput(scanner, "Masukkan nama : ");
        String nim = getStringInput(scanner, "Masukkan NIM : ");
        String classRoom = getStringInput(scanner, "Masukkan kelas : ");
        int uts = getValidIntInput(scanner, "Masukkan nilai UTS : ");
        int uas = getValidIntInput(scanner, "Masukkan nilai UAS : ");
        int attendance = getValidIntInput(scanner, "Masukkan nilai kehadiran : ");

        System.out.println("HASIL PERHITUNGAN AKHIR");

        Student student1 = new Student(name, nim, classRoom, uts, uas, attendance);
        student1.finalResult();

        scanner.close();
    }

    public static void header() {
        String title = "=".repeat(10) + " UBSI " + "=".repeat(10);
        System.out.println("=".repeat(title.length()));
        System.out.println(title);
        System.out.println("=".repeat(title.length()));
        System.out.println("\nHASIL AKHIR PERKULIAHAN");
    }

    public static int getValidIntInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (Exception e) {
                System.out.println("Mohon masukkan angka");
                scanner.nextLine();
            }
        }
    }

    public static String getStringInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        String name = scanner.nextLine();
        return name;
    }
}
