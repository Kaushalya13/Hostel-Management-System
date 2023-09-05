package org.hms.bo.custom.Impl;

import org.hms.bo.custom.StudentBO;
import org.hms.dto.StudentDTO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class StudentBOImpl implements StudentBO {
    @Override
    public List<StudentDTO> getAllStudent() throws SQLException, ClassNotFoundException, IOException {
        return null;
    }

    @Override
    public boolean addStudent(StudentDTO dto) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public boolean updateStudent(StudentDTO dto) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public boolean deleteStudent(String id) throws SQLException, ClassNotFoundException, IOException {
        return false;
    }

    @Override
    public String generateNewStudentID() throws SQLException, ClassNotFoundException, IOException {
        return null;
    }
}
