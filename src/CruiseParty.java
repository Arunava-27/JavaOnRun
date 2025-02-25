import java.util.Scanner;

public class CruiseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Time Frame (T) : ");
        int t = sc.nextInt();

        int entry[] = new int[t];
        int leave[] = new int[t];
        int entryTot = 0;
        int leaveTot = 0;

        for (int i = 0; i < t; i++) {
            entry[i] = sc.nextInt();
            leave[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            entryTot += entry[i];
            leaveTot += leave[i];
        }
        int maxGuest = entryTot - leaveTot;
        System.out.print("Maximum Guest : "+ maxGuest);
    }
}
