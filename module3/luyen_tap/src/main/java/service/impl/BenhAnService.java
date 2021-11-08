package service.impl;

import bean.BenhAn;

import java.sql.SQLException;
import java.util.List;

public interface BenhAnService {
    public BenhAn selectBenhAn(String id);

    public List<BenhAn> selectAllBenhAn();

    public boolean deleteBenhAn(String id);

    public boolean updateBenhAn(BenhAn benhAn) throws SQLException;

    public BenhAn selectBenhAn1(String id);
}
