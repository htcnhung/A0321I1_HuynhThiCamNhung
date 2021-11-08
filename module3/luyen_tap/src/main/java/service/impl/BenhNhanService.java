package service.impl;

import bean.BenhNhan;

import java.util.List;

public interface BenhNhanService {
    public List<BenhNhan> getAllBenhNhan();
    public BenhNhan selectBenhNhanById(String id);
}
