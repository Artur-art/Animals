public class Main {
    public static void main(String[] args) {


        Herbivores horse = new Herbivores("Лошадь", "степь", 60);
        Herbivores gazelle = new Herbivores("Газель", "полупыстыня", 85);
        Herbivores giraffe = new Herbivores("Жираф", "пустыня", 40);

        Predators hyena = new Predators("Гиена", 14, "полупустыня", 65);
        Predators tiger = new Predators("Тигр", 17, "полупустыня", 65);
        Predators bear = new Predators("Медведь", 3, "лес", 50);

        Amphibians frog = new Amphibians("Лягушка", 2,"болото");
        Amphibians grassSnake = new Amphibians("Уж", "болото");

        NotFlying peacock=new NotFlying("Павлин",5,"лес");
        NotFlying penguin=new NotFlying("Пингвин","Антарктика");
        NotFlying dodo=new NotFlying("Додо","лес");

        Flying seagull=new Flying("Чайка","море");
        Flying albatros=new Flying("Альбатрос",3,"море");
        Flying falcon=new Flying("Сокол",5,"степь");
        Flying hawk=new Flying("Ястреб", "Степь");

        seagull.fly();
        seagull.eat();
        seagull.sleep();
        seagull.move();
        seagull.hanting();
        System.out.println(seagull.getTypeMovement());
        System.out.println(seagull.getLivingEnvironment());

        System.out.println(peacock.equals(penguin));
        System.out.println(frog.toString());
        System.out.println(seagull.toString());
        System.out.println(peacock.toString());
        System.out.println(horse.toString());
        System.out.println(hyena.toString());
        System.out.println(hyena.getSpeed());
        System.out.println(hawk.toString());


    }
}
