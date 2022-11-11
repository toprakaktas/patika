package Boxing;
public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if (checkWeight()){

            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("------- YENİ ROUND -------");
                if (firstHit() == f1) {
                    f2.health = f1.hit(f2);
                    System.out.println(f2.name + " isimli dövüşçünün kalan sağlığı: " + f2.health);
                    f1.health = f2.hit(f1);
                    System.out.println(f1.name + " isimli dövüşçünün kalan sağlığı: " + f1.health);
                }
                else{
                    f1.health = f2.hit(f1);
                    System.out.println(f1.name + " isimli dövüşçünün kalan sağlığı: " + f1.health);
                    f2.health = f1.hit(f2);
                    System.out.println(f2.name + " isimli dövüşçünün kalan sağlığı: " + f2.health);

                }
                if (isWin()) break;
            }
        }else
            System.out.println("Sporcuların sikletleri uyuşmuyor.");
    }

    public boolean checkWeight(){
        return (f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    public boolean isWin(){
        if (this.f2.health == 0){
            System.out.println(f1.name + " kazandı!");
            return true;
        }else if (this.f1.health == 0){
            System.out.println(f2.name + " kazandı!");
            return true;
        }else
            return false;
    }


    //dövüşe başlayacak kişinin %50 olasılık ile seçildiği metot
   public Fighter firstHit(){
        double chance;
        chance = Math.random(); // 0.0 ve 1.0 arasında sayı üretiyor
        //bu sayı 0.0 ve 0.5 arasında ise f1 dövüşçüsü seçiliyor
        if (chance <= 0.5) {
            return f1;
        }
        //değilse f2
        else {
            return f2;
        }
    }
}
