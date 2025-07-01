package com.example.Transfer;

import com.example.Transfer.DTO.TransferDTO;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Set;

@SpringBootApplication
public class TransferApplication {

	public static void main(String[] args) {

		SpringApplication.run(TransferApplication.class, args);
		TransferDTO dto = new TransferDTO();

		dto.setFirstName("Gabriela");
		dto.setLastName("Salas");
		dto.setEmail("mail@mail");
		dto.setAmount(BigDecimal.ZERO);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validator = factory.getValidator();

		Set<ConstraintViolation<TransferDTO>> violations = validator.validate(dto);

		if(!violations.isEmpty()){
			violations.forEach(v->
					System.out.println(v.getMessage()));
		}else{
			System.out.println("Valid DTO");
		}
	}

}
