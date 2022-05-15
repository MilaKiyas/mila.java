package hw6;

public class hw6 {

    public static void main(String[] args) {



        Animal[] animals = new Animal[10];
        animals[0] = new Cat("Кот сиамский", "Мурзик", 0, 0, 5000, 200, 20);
        animals[1] = new Cat("Кошка абиссинская", "Алиса", 0, 6, 4000, 250, 10);
        animals[5] = new Dog("Собака Дог (кобель)", "Наг", 0, 55, 10000, 1000, 200);
        animals[6] = new Dog("Собака Пудель (самка) ", "Лора", 0, 25, 5000, 500, 50);


        try {
            animals[2] = (Cat) animals[0].clone();
            animals[3] = (Cat) animals[1].clone();
            animals[4] = (Cat) ((Cat) animals[1]).clone("mutate");
            animals[7] = (Dog) animals[5].clone();
            animals[8] = (Dog) animals[6].clone();
            animals[9] = (Dog) ((Dog) animals[6]).clone("mutate");
        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
            System.out.println("Клонирование не реализовано");
        }
        System.out.println("Характеристики созданных животных");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------");



        System.out.println("Всего котов создано: " + (Cat.getCount() + Cat.getCountClone()));
        System.out.println("в том числе клонированных котов: " + Cat.getCountClone());
        System.out.println("Всего собак создано: " + (Dog.getCount() + Dog.getCountClone()));
        System.out.println("в том числе клонированных собак: " + Dog.getCountClone());
        System.out.println("Всего собак создано: " + Dog.getCountClone());
        System.out.println("Всего животных создано: " + Animal.getCount());
        System.out.println();
        System.out.println("Тестирование подопытных на выносливость: ");
        System.out.println("Бег: ");
        System.out.println("---------------------------------------------------------------------------------------");

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(500);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Плавание: ");
        System.out.println("---------------------------------------------------------------------------------------");


        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(50);
        }

    }
}
