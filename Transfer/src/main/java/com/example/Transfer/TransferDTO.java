package com.example.Transfer;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class TransferDTO {
    @NotBlank(message = "First name cannot be null")
    @Pattern(regexp = "^[A-Za-z]+$", message = "First name should be only letters and no spaces")
    private String firstName;

    @NotBlank(message = "Last name cannot be null")
    @Pattern(regexp = "^[A-Za-z]+$")
    private String lastName;

    @NotBlank(message = "email cannot be null")
    @Email
    private String email;

    @NotNull(message = "Amount cannot be null")
    @Digits(integer = 5, fraction = 2)
    private BigDecimal amount;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmail(){
        return this.email;
    }
    public BigDecimal getAmount(){
        return this.amount;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAmount(BigDecimal amount){
        this.amount = amount;
    }
}
