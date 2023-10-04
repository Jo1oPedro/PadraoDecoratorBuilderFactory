package org.example;

public class Tomate extends IngredienteDecorator {
    public Tomate(IIngrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public Float getPrecoIngrediente() {
        return 0.4f;
    }

    @Override
    public String getIngrediente() {
        return "tomate";
    }
}
