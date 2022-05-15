package hw6;

public class Animal implements Cloneable {
    protected String type;
    protected String name;
    protected int flying;
    protected int swims;
    protected int goes;
    protected int run;
    protected int crawling;
    private static int count;


    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }


    protected Object clone() throws CloneNotSupportedException {
        count++;
        return super.clone();
    }


    public String toString() {
        return "Вид/порода: '" + type + '\'' +
                ", Кличка: '" + name + "\' \nТТХ:" +
                ", Может пролететь " + flying + "м. " +
                ", Может проплыть " + swims + "м. " +
                ", Может пройти " + goes + "м. " +
                ", Может пробежать " + run + "м. " +
                ", Может проползти " + crawling + "м. \n";
    }

    protected void run(int  distance) {
        if (run >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "  - УСПЕШНО пробежал(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- сошел(а) с дистанции ---- ");
        }
    }

    protected void swim(int distance) {
        if (swims >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "   - УСПЕШНО проплыл(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- не выполнил норматив ---- ");
        }
    }
}


