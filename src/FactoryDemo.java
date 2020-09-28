
interface Food {
    public void make();
}

class Hongshaojichi implements Food {

    @Override
    public void make() {
        System.out.println("红烧鸡翅");
    }
}

class Hongshaorou implements Food {

    @Override
    public void make() {
        System.out.println("红烧肉");
    }
}

class Factory {
    public static Food makeFood(String food) {
        Food a = null;
        if(food.equals("鸡翅")) {
            a = new Hongshaojichi();
        }
        if(food.equals("五花肉")) {
            a = new Hongshaorou();
        }
        return a;
    }
}








public class FactoryDemo {
    public static void main(String[] args) {
        Food food = null;
        food = Factory.makeFood("鸡翅");
        food.make();
        System.out.println("end");
    }
}
