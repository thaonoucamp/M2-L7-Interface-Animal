package Animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String sound() {
        return "Cuc ta cuc tac..!";
    }

    @Override
    public String eat() {
        return "could be rice !";
    }
}
