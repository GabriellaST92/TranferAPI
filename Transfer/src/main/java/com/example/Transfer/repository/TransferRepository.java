package com.example.Transfer.repository;

import com.example.Transfer.DTO.TransferDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository {
    TransferDTO save(TransferDTO dto);

}
