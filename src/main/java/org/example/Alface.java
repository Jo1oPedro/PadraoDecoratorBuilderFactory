package org.example;

public class Alface extends IngredienteDecorator {
    public Alface(IIngrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public Float getPrecoIngrediente() {
        return 0.4f;
    }

    @Override
    public String getIngrediente() {
        return "alface";
    }
}
