package org.hms.bo.custom.Impl;

import org.hms.bo.custom.ReservationBO;
import org.hms.dto.ReservationDTO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ReservationBOImpl implements ReservationBO {
    @Override
    public List<ReservationDTO> getAllReservation() throws SQLException, ClassNotFoundException, IOException {
        return null;
    }

    @Override
    public boolean addReservation(ReservationDTO dto) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public boolean updateReservation(ReservationDTO dto) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public boolean deleteReservation(String id) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public String generateNewReservationID() throws SQLException, ClassNotFoundException, IOException {
        return null;
    }
}
