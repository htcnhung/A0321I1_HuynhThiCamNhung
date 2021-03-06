package service;

import bean.Position;
import repository.PositionRepository;
import service.impl.PositionService;

import java.util.List;

public class PositionServiceImpl implements PositionService {
    @Override
    public Position selectPositionById(String id) {
        return new PositionRepository().selectPositionById(id);
    }

    @Override
    public List<Position> getAllPosition() {
        return new PositionRepository().getAllPosition();
    }
}
