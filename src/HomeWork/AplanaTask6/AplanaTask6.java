package HomeWork.AplanaTask6;

public class AplanaTask6 {

    static int sigaryCount;
    static int dayOfWeek;

    public static void main(String[] args) {
        sigary();
    }

    public static boolean sigary() {
        dayOfWeek = 1 + (int) (Math.random() * 7);
        sigaryCount = (int) (Math.random() * 100);
        if ((dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 3 || dayOfWeek == 4 || dayOfWeek == 5) && sigaryCount >= 40 && sigaryCount <= 60) {
            System.out.println("Вечеринка белок удалась, у них " + sigaryCount + " сигар в будний день");
            return true;
        } else if ((dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 3 || dayOfWeek == 4 || dayOfWeek == 5) && sigaryCount < 40) {
            System.out.println("Вечеринка у белок получилась какая-то тухлая, у них " + sigaryCount + " сигар в будний день");
            return false;
        } else if ((dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 3 || dayOfWeek == 4 || dayOfWeek == 5) && sigaryCount > 60) {
            System.out.println("Хоть сегодня и будний день, но сигар у белок завались, а именно " + sigaryCount);
            return true;
        } else if ((dayOfWeek == 6 || dayOfWeek == 7) && sigaryCount < 40) {
            System.out.println("Для выходных сигар явно маловато, у белок " + sigaryCount);
            return false;
        } else {
            System.out.println("У белок достаточно сигар для выходных, а именно " + sigaryCount);
            return true;
        }
    }
}
