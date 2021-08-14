public class Rabbit extends Animal implements LivingBeing {
    // override
    public void eat() {
        System.out.println("I eat Carrots!!");

    }
    @Override
    public void breath() {
        System.out.println("I am going to breath O2");
        
    }
    @Override
    public void age() {
        System.out.println("I can live upto 12 years");
        
    }


}
