package service;

import bean.AttachService;
import repository.AttachServiceRepository;
import service.impl.AttachServiceService;

import java.util.List;

public class AttachServiceServiceImpl implements AttachServiceService {

    AttachServiceRepository attachServiceRepository = new AttachServiceRepository();

    @Override
    public AttachService selectAttachServiceById(String id) {
        return attachServiceRepository.selectAttachServiceById(id);
    }

    @Override
    public List<AttachService> getAllAttachService() {
        return attachServiceRepository.getAllAttachService();
    }
}
