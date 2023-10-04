package org.example;

public class Pao implements IIngrediente{
    @Override
    public Float getPrecoLanche() {
        return 1f;
    }

    @Override
    public String getEstruturaLanche() {
        return "pao";
    }
}
