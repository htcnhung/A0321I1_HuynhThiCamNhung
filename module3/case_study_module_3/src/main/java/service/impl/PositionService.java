package service.impl;

import bean.Position;

import java.util.List;

public interface PositionService {
    public Position selectPositionById(String id);
    public List<Position> getAllPosition();
}
