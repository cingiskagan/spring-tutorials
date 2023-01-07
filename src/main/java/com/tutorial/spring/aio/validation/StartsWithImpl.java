package com.tutorial.spring.aio.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StartsWithImpl implements ConstraintValidator<StartsWith, String> {

    private StartsWith anno;

    @Override
    public void initialize(StartsWith constraintAnnotation) {
        anno = constraintAnnotation;
    }

    @Override
    public boolean isValid(String value,
                           ConstraintValidatorContext context) {
        if(value == null){
            return false;
        }else{
            return value.startsWith(anno.value());
        }

    }

}
