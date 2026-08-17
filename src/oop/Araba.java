package oop;

public class Araba {
    private String marka;
    private int hiz;

    public Araba(String marka, int hiz){
        this.marka=marka;
        this.hiz=hiz;

    }

    public void hiziArtir(int miktar){
        this.hiz+=miktar;
        System.out.println(marka+"yeni hızı"+this.hiz);

    }

    public void bilgiGöster(){
        System.out.println("marka:"+marka +"|"+"hız"+ hiz);
    }
}

