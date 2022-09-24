import java.util.Scanner;

public class combinasyon {
    public static void main(String[] args) {
//C(n,r) = n! / (r! * (n-r)!)
        Scanner inp= new Scanner(System.in);
        int n,r,nEksir,totaln=1, totalr=1, totalnEksir=1;

        double C;

        System.out.println("lütfen n değerini giriniz:");
        n=inp.nextInt();

        System.out.println("lütfen r değerini giriniz:");
       r=inp.nextInt();


        for (int i=1; i<=n; i++) {
            totaln *= i;
            System.out.println(i);

        }for (int j=1; j<=r; j++){
            totalr*=j;
            System.out.println(j);

        } nEksir=n-r;
        for (int k=1; k<=nEksir; k++){
             totalnEksir*=k;
            System.out.println(k);
        }
        C=totaln/(totalr*(totalnEksir));
        if (n>r){
            System.out.println(C);
        }else {
            System.out.println("lütfen girilen sayıları kontrol ediniz:");
        }

    }
}
