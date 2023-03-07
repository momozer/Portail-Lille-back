package com.niji.lille.portailLille.servcie.serviceImp;

import com.niji.lille.portailLille.entity.Idee;
import com.niji.lille.portailLille.repository.IdeeRepository;
import com.niji.lille.portailLille.servcie.IdeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IdeeServiceImp implements IdeeService {


    @Autowired
    private IdeeRepository ideeRepository;

    public IdeeServiceImp(IdeeRepository ideeRepository){}
    @Override
    public List<Idee> findAll() {
        return ideeRepository.findAll();
    }

    @Override
    public Idee save(Idee entity) {
        return ideeRepository.save(entity);
    }

    @Override
    public Idee findById(String id) {
        return ideeRepository.findById(id).orElse(null);
    }


    @Override
    public void deleteById(String id) {
        ideeRepository.deleteById(id);
    }
}
