import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\Test\\Test.txt");
        if (file.isFile() == true) {
            long length = file.length();
            if (length == 0) {
                boolean isDelete = file.delete();
                System.out.println("Файл " + file.getName() + " был пустой и удален" );
            }
            else
                System.out.println("Файл " + file.getName() + " весит " + length + " байт");
        }
        else
            System.out.println(file.getName()+" не найден");

        File file1 = new File("D:\\Test\\Test1.txt");
        if (file1.isFile() == true) {
            long length1 = file1.length();
            if (length1 == 0) {
                boolean isDelete = file1.delete();
                System.out.println("Файл " + file1.getName() + " был пустой и удален" );
            }
            else
                System.out.println("Файл " + file1.getName() + " весит " + length1 + " байт");
        }
        else
            System.out.println(file1.getName()+" не найден");

        File file2 = new File("D:\\Test\\Test2.txt");
        if (file2.isFile() == true) {
            long length2 = file1.length();
            if (length2 == 0) {
                boolean isDelete = file2.delete();
                System.out.println("Файл " + file2.getName() + " был пустой и удален" );
            }
            else
                System.out.println("Файл " + file2.getName() + " весит " + length2 + " байт");
        }
        else
            System.out.println("Файл " + file2.getName()+" не найден");

    }
}
