import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        char[] ch = new char[n];

        String str = kb.next();
        int snt = 0;
        int lnt = 0;
        for (int i = 0; i < n; i++) {
            ch[i] = str.charAt(i);

            if (ch[i] == 'S') {
                snt++;
            } else {
                lnt++;
            }
        }

        int tmp = snt + (lnt / 2) + 1;
        System.out.println(Math.min(n, tmp));
    }
}
