package org.example;

public class Carne extends IngredienteDecorator {

    public Carne(IIngrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public Float getPrecoIngrediente() {
        return 0.5f;
    }

    @Override
    public String getIngrediente() {
        return "carne";
    }
}
