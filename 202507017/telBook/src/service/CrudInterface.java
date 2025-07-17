package service;

import dto.TelDto;

import java.util.ArrayList;
import java.util.List;

public interface CrudInterface {
    int insertData(TelDto dto);

    int updateData(TelDto dto);

    int deleteData(int id);

    List<TelDto> getListAll(); // 전체 찾기

    TelDto findById(int id); // 한개 데이터 찾기

    List<TelDto> searchList(String keyword); // 이름으로 검색

}
