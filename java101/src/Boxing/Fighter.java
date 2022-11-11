package Boxing;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe){
        System.out.println("Dövüşçü " + this.name + ", " + foe.name + " isimli dövüşçüye " + this.damage + " hasar verdi.");
        if (foe.isDodge()){
            System.out.println(foe.name + " gelen hasarı blokladı!");
            return foe.health;
        }
        return foe.health-this.damage;
    }

    public boolean isDodge(){
        double random = Math.random() * 100;
        return random <= this.dodge;
    }
}
