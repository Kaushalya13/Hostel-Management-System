package org.hms.dao.custom.Impl;

import org.hms.dao.custom.ReservationDAO;
import org.hms.entity.Reservation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ReservationDAOImpl implements ReservationDAO {
    @Override
    public List<Reservation> getAll() throws SQLException, ClassNotFoundException, IOException {
        return null;
    }

    @Override
    public boolean add(Reservation entity) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public boolean update(Reservation entity) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException, IOException {
        return null;
    }
}
