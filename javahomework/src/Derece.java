public class Derece {
    private String[] name;
    private int[] minutes;
    public Derece(String[] namearray , int[] minutesarray){
        this.name = namearray;
        this.minutes = minutesarray;
    }
    public String[] getName() {
        return name;
    }
    public void setName(String[] name){
        this.name = name;
    }
    public int[] getMinutes() {
        return minutes;
    }
    public void setMinutes(int[] minutes){
        this.minutes=minutes;
    }
    public int getbest(){
        int bestminute = minutes[0];
        int value = 0;
        for (int i = 0; i <minutes.length ; i++) {
            if (minutes[i] < bestminute){
                bestminute = minutes[i];
                value = i;
            }
        }
        return value;
    }
    public int getsecondbest(){
        int bestminute = minutes[0];
        int firstvalue = getbest();
        int value = 0;
        for (int j = 0; j <minutes.length ; j++) {
            if (j == firstvalue)
                continue;
            if (minutes[j] < bestminute){
                bestminute = minutes[j];
                value = j;
            }
        }
        return value;
    }
    public int getthirdtbest(){
        int bestminute = minutes[0];
        int firstvalue = getbest();
        int secondvalue = getsecondbest();
        int value = 0;
        for (int k = 0; k <minutes.length ; k++) {
            if (k == firstvalue || k == secondvalue)
                continue;
            if (minutes[k] < bestminute){
                bestminute = minutes[k];
                value = k;
            }
        }
        return value;
    }
    public  void DereceArrangement(){
        int best = 0;
        int secondbest = 0;
        int thirdbest =0;
        for (int i = 0; i < minutes.length; i++) {
            if (minutes[i] >= 400)
                thirdbest++;
            else if (minutes[i] >= 300) {
                secondbest++;
            }
            else if (minutes[i] >=200)
                best++;
        }
        System.out.println("A -> " + best);
        System.out.println("B -> " + secondbest);
        System.out.println("C -> " + thirdbest);
    }
    public void DisplayDerece(){
        int i = getbest();
        System.out.println("Birinci : " + name[getbest()] + " " + minutes[getbest()] + "'");
        int j = getsecondbest();
        System.out.println("İkinci  : " + name[getsecondbest()] + " " + minutes[getsecondbest()] + "'");
        int k = getthirdtbest();
        System.out.println("Üçüncü  : " + name[getthirdtbest()] + " " + minutes[getthirdtbest()] + "'");
    }
    public void DisplayAllDerece(){
        DisplayDerece();
        DereceArrangement();
    }
}
