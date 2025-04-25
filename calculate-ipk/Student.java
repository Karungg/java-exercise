public class Student {

    private String name;
    private String nim;
    private String classRoom;
    private int uts;
    private int uas;
    private int attendance;

    public Student(String name, String nim, String classRoom, int uts, int uas, int attendance) {
        this.name = name;
        this.nim = nim;
        this.classRoom = classRoom;
        this.uts = uts;
        this.uas = uas;
        this.attendance = attendance;
    }

    public void finalResult() {

        double total = (this.uts * .3) + (uas * .4) + (attendance * .3);
        String status = "";

        if (total >= 90) {
            status = "LULUS DENGAN CUMLAUDE";
        } else if (total >= 80) {
            status = "LULUS DENGAN BAIK";
        } else if (total >= 70) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }

        System.out.println("=".repeat(26));
        System.out.println("NAMA LENGKAP : " + name);
        System.out.println("NIM : " + nim);
        System.out.println("KELAS : " + classRoom);
        System.out.println("NILAI UTS : " + uts);
        System.out.println("NILAI UAS : " + uas);
        System.out.println("NILAI KEHADIRAN : " + attendance);
        System.out.println("=".repeat(26));
        System.out.println("NILAI AKHIR : " + total);
        System.out.println("STATUS : " + status);
        System.out.println("=".repeat(26));
    }
}
