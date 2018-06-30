package factory.factorymethod;

/**
 * 小猫工厂
 */
public class CatFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
