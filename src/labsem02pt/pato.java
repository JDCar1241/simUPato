package labsem02pt;
public abstract class pato {

    private volable volable;
    private cuaqueable cuaqueable;

    private String nombre;

    public pato(String nombre) {
        this.nombre = nombre;
    }

    public void setvolable(volable fb) {
        this.volable = fb;
    }

    public void setCuaqueable(cuaqueable cq) {
        this.cuaqueable = cq;
    }
    abstract void mostrar();

    public void realizarVuelo() {
        volable.volar();
    }
    public void realizarCuaqueo() {
        cuaqueable.cuaquear();
    }

    public void nadar() {
        System.out.println(nombre + " todos los patos nadan");
    }

}
    