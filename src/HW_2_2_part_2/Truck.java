package HW_2_2_part_2;

public class Truck extends Bicycle implements Servicable {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}
