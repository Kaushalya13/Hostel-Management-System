package org.hms.bo.custom.Impl;

import org.hms.bo.custom.UserBO;
import org.hms.dto.UserDTO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserBOImpl implements UserBO {
    @Override
    public List<UserDTO> getAllUsers() throws SQLException, ClassNotFoundException, IOException {
        return null;
    }

    @Override
    public boolean addUser(UserDTO dto) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public boolean updateUser(UserDTO dto) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public boolean deleteUser(String id) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public String generateNewUserID() throws SQLException, ClassNotFoundException, IOException {
        return null;
    }
}
