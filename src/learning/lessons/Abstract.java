//package learning.lessons;

abstract class Abstract {
    abstract void sesCıkar();

    abstract void neYer();
}

class Kedi extends Abstract{
    @Override
    void sesCıkar(){
        System.out.println("miyaav");
    }

    void neYer(){
        System.out.println("kedi maması yer");
    }
}
class Kopek extends Abstract{
    @Override  // gövdesiz methodu doldurmak override etmek zorundayız.
    void sesCıkar(){
        System.out.println("hav");

    }

    void neYer(){
        System.out.println("köpek maması yer");
    }

}

void main(String[] args) {
    Kopek k = new Kopek();
    k.sesCıkar();
    k.neYer();


    Kedi c = new Kedi();
    c.sesCıkar();
    c.neYer();
}