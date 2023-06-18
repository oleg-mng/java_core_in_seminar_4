package org.inwork;

public class Cat extends Animal{
    public Cat(String name, int distance) {
        super(name,distance);
    }

    @Override
    void swim(int distance) throws AnimalSwimException{
        throw new AnimalSwimException("Кот не умеет плавать ", name, distance);

    }

    @Override
    void run(int distance) throws AnimalRunException{
        if (distance < this.distance){
            this.distance -= distance;
        }
        else throw new AnimalRunException("Коту не пробежит такую дистанцию", name, distance);

    }
}
