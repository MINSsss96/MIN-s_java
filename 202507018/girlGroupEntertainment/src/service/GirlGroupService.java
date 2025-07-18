package service;

import db.DBConn;
import dto.EntertainmentDto;
import dto.GirlDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GirlGroupService implements CrudInterface {
    Connection conn = DBConn.getConnection();
    PreparedStatement psmt = null;
    String sql;

    @Override
    public List<EntertainmentDto> getListAll() {
        List<EntertainmentDto> entertainmentDtoList = new ArrayList<>();
        ResultSet rs = null;

        try {
            while (rs.next()) {
                sql = "SELECT * FROM entertainment";
                psmt = conn.prepareStatement(sql);
                rs = psmt.executeQuery();
                EntertainmentDto dto = new EntertainmentDto();
                dto.setE_id(rs.getInt("id"));
                dto.setName(rs.getString("name"));
//                dto.setGroups((List<GirlDto>) rs.getArray("group"));
                entertainmentDtoList.add(dto);
            }
            rs.close();
            psmt.close();

        } catch (SQLException e) {
            System.out.println(e.toString());;
        }

        return entertainmentDtoList;
    }

    @Override
    public GirlDto findById(int id) {
        return null;
    }

    @Override
    public List<GirlDto> searchList(int id) {


        return List.of();
    }
}
