package dto;

import java.time.LocalDate;

public class GirlGroup {
    private int g_id;
    private String name;
    private LocalDate Debut;

    @Override
    public String toString() {
        return "GirlGroup{" +
                "g_id=" + g_id +
                ", name='" + name + '\'' +
                ", Debut=" + Debut +
                '}';
    }

    public LocalDate getDebut() {
        return Debut;
    }

    public void setDebut(LocalDate debut) {
        Debut = debut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }
}
