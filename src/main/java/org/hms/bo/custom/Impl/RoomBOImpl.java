package org.hms.bo.custom.Impl;

import org.hms.bo.custom.RoomBO;
import org.hms.dto.RoomDTO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class RoomBOImpl implements RoomBO {
    @Override
    public List<RoomDTO> getAllRooms() throws SQLException, ClassNotFoundException, IOException {
        return null;
    }

    @Override
    public boolean addRoom(RoomDTO dto) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public boolean updateRoom(RoomDTO dto) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public boolean deleteRoom(String id) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public String generateNewRoomID() throws SQLException, ClassNotFoundException, IOException {
        return null;
    }
}
