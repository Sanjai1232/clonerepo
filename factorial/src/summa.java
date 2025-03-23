public class summa {
    public static void main(String[] args) {
      int fv=0;
      int sv=1;
      int t;
        System.out.print(fv+",");
        System.out.print(sv+",");
        for (int i = 0; i <=4; i++) {
            t=fv+sv;
            System.out.print(t+",");
            fv=sv;
            sv=t;
        }
    }
}
