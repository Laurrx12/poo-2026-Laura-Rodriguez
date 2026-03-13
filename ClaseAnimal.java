public class ClaseAnimal {
static class Animal {
    void sonido(){
        System.out.println("el animal hace un sonido");
    }
}

static class vaca extends Animal {
    void sonido(){
        System.out.println("la vaca muge");
    }
}

static class gallina extends Animal {
    void sonido(){
        System.out.println("la gallina cacarea (coo, coo)");
    }
}

static class pollo extends Animal {
    void sonido(){
        System.out.println("el pollito pio, el pollito piooooooo");
    }
}

static class cordero extends Animal {
    void sonido(){
        System.out.println("el cordero hace beeeee");
    }
}
 public static void main(String[] args){
     Animal a= new Animal();
     vaca b= new vaca();
     gallina c= new gallina();
     pollo d= new pollo();
     cordero e= new cordero();
     a.sonido();
     b.sonido();
     c.sonido();
     d.sonido();
     e.sonido();
 }
}