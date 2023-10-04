package org.example;

public abstract class IngredienteDecorator implements IIngrediente {

    private IIngrediente ingrediente;

    public IngredienteDecorator(IIngrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public abstract Float getPrecoIngrediente();

    @Override
    public Float getPrecoLanche() {
        return this.ingrediente.getPrecoLanche() + this.getPrecoIngrediente();
    }

    public abstract String getIngrediente();
    @Override
    public String getEstruturaLanche() {
        return this.ingrediente.getEstruturaLanche() + " / " + this.getIngrediente();
    }
}
