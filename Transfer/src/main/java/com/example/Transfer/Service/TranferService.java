package com.example.Transfer.Service;

import com.example.Transfer.DTO.TransferDTO;
import com.example.Transfer.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranferService {
    @Autowired
    private TransferRepository repository;

    public TransferDTO createUser(TransferDTO dto){
        return repository.save(dto);
    }
}
