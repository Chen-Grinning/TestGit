package lab2;

public class Homework2_3 {


}

class Figure {
    Mediator mediator;
    public void update() {}
}

class Button extends Figure {

    public void update() {

    }
}

class List extends Figure {

    public void update() {

    }
}

class ComboBox extends Figure {

    public void update() {

    }
}

class TextBox extends Figure {

    public void update() {

    }
}

class Label extends Figure {

    public void update() {

    }
}

class Mediator {

    public static void change(Figure... figures) {
        for (Figure figure : figures) {
            figure.update();
        }
    }
}
