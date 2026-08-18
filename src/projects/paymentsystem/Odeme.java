//package projects.paymentsystem;

public class Odeme {
    public void odemeYap(double tutar){
        System.out.println("genel ödeme yöntemi ile "+tutar+"TL ödendi");

    }
}

class KrediKarti extends Odeme{
    @Override
    public void odemeYap(double tutar){
        System.out.println("Kredi kartından " + tutar + " TL çekildi.");
    }
}

class Havale extends Odeme{
    @Override
    public void odemeYap(double tutar){
        System.out.println("havale ile"+tutar+"TL gönderildi.");
    }
}

void main(String[] args) {
    Odeme o1 = new KrediKarti();
    Odeme o2 = new Havale();


    o1.odemeYap(499);
    o2.odemeYap(6780);

}
