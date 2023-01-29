public class Main {
    public static void main(String[] args) {

       int a=1;
       int b=3;
       int c=a*b;
       int d=c;
        System.out.println((d / c + 2) >= b || !(c + b - c / a == 3));
        //d/c+2=3/ 3 uguale a b=3 quindi Vero ||  Vero ma ! davanti la parentesi quindi Falso
        //Vero||Falso
        //soluzione: Vero



        int x=5;
        int y=6;
        boolean t=false;
        boolean f=true;
         System.out.println( (x * x - y * y / 2 != 12) || !t && f);
         //x*x=25
        //y*y=36
        //36/2=18
        //25-18=7
        //7 diverso da 12 quindi Vero
        // ||vero && vero=Vero
        // Vero||Vero=Vero
        //soluzione: Vero


    }
}