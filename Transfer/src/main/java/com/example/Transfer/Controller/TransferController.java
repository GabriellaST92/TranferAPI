package com.example.Transfer.Controller;

import com.example.Transfer.DTO.TransferDTO;
import com.example.Transfer.Service.TranferService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transfer")
public class TransferController {
    private final TranferService service;

    public TransferController(TranferService service) {
        this.service = service;
    }

    @GetMapping
    public String getTransfer(){
        return "Transfer info";
    }

    @PostMapping
    public TransferDTO saveUser(@Valid @RequestBody TransferDTO dto)
    {
        return service.createUser(dto);

    }
}
