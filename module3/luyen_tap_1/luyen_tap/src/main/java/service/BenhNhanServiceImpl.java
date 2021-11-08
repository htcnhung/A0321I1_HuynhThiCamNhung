package service;

import bean.BenhNhan;
import repository.BenhNhanRepository;
import service.impl.BenhNhanService;

import java.util.List;

public class BenhNhanServiceImpl implements BenhNhanService {
    private BenhNhanRepository benhNhanRepository = new BenhNhanRepository();
    @Override
    public List<BenhNhan> getAllBenhNhan() {
        return benhNhanRepository.selectAllBenhNhan();
    }

    @Override
    public BenhNhan selectBenhNhanById(String id) {
        return benhNhanRepository.selectBenhNhanById(id);
    }
}
