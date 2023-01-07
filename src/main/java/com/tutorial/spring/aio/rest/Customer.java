package com.tutorial.spring.aio.rest;

import com.tutorial.spring.aio.validation.StartsWith;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer {
    @NotNull(message = "name null olamaz")
    @NotEmpty
    @NotBlank
    @Size(min = 2,max = 100)
    @StartsWith(value = "ali")
    String name;

    @NotEmpty
    @NotBlank
    @Size(min = 2,max = 100)
    String surname;

    @NotEmpty
    @Size(min = 2,max = 100)
    String username;

    @NotEmpty
    @NotBlank
    @Size(min = 2,max = 30)
    String password;

    @Size(min = 2,max = 50)
    String city;
}
