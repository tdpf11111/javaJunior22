package lesson16;

import java.util.Objects;

public class Tovar {
    private int id;
    private String name;
    private int price;

    public Tovar() {
    }

    public Tovar(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tovar)) return false;
        Tovar tovar = (Tovar) o;
        return getId() == tovar.getId() && getPrice() == tovar.getPrice() && Objects.equals(getName(), tovar.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPrice());
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
