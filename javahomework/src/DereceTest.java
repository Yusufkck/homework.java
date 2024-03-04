public class DereceTest {
    public static void main(String[] args) {
        String[] name = {"Kadir","Gökhan","Hakan","Suzan","Pınar","Mehmet","Ali","Emel","Fırat","James","Jale","Burak"};
        int[] minute = {341,273,278,329,445,402,388,270,243,334,412,265};
        Derece myDerece = new Derece(name,minute);
        myDerece.DisplayAllDerece();
    }
}
