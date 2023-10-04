package org.example;

import java.lang.reflect.Constructor;

public class LancheBuilder {
    IIngrediente lanche;
    public LancheBuilder() {
        this.lanche = (IIngrediente) new Pao();
    }

    public IIngrediente constroiLanche() {
        if(this.lanche.getEstruturaLanche().equals("pao")) {
            throw new IllegalArgumentException("Lanche incompleto");
        }

        return this.lanche;
    }

    public LancheBuilder adicionaIngrediente(String ingrediente) throws ClassNotFoundException {
        Class<?> classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("org.example." + ingrediente);
            Constructor<?> constructor = classe.getConstructor(IIngrediente.class);
            objeto = constructor.newInstance(this.lanche);
            this.lanche = (IIngrediente) objeto;
        } catch (Exception exception) {
            throw new IllegalArgumentException("Ingrediente invalido");
        }

        return this;
    }
}
