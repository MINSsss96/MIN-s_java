package dto;



import java.util.ArrayList;
import java.util.List;

public class EntertainmentDto {
    private int e_id;
    private String name;
//    private List<GirlDto> groups = new ArrayList<>();

    @Override
    public String toString() {
        return "Entertainment{" +
                "e_id=" + e_id +
                ", name='" + name + '\'' +
//                ", groups=" + groups +
                '}';
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<GirlDto> getGroups() {
//        return groups;
//    }
//
//    public void setGroups(List<GirlDto> groups) {
//        this.groups = groups;
//    }
}

