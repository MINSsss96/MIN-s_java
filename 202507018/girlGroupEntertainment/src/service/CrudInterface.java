package service;

import dto.EntertainmentDto;
import dto.GirlDto;

import java.util.List;

public interface CrudInterface {
    List<EntertainmentDto> getListAll();

    GirlDto findById(int id);

    List<GirlDto> searchList(int id);
}
