package com.example.Transfer.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/transfer")
public class TransferController {

    @GetMapping
    public String getTransfer(){
        return "Transfer info";
    }
}
