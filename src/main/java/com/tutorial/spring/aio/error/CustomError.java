package com.tutorial.spring.aio.error;

import java.util.ArrayList;
import java.util.List;

public class CustomError {

    private String description;
    private Integer code;

    private List<CustomError> subCustomErrors;

    public CustomError() {
    }

    CustomError(String description, Integer code, List<CustomError> subCustomErrors) {
        this.description = description;
        this.code = code;
        this.subCustomErrors = subCustomErrors;
    }

    public static ErrorBuilder builder() {
        return new ErrorBuilder();
    }

    public void addSubError(CustomError customError){
        if (subCustomErrors == null){
            subCustomErrors = new ArrayList<>();
        }
        subCustomErrors.add(customError);
    }

    public String getDescription() {
        return this.description;
    }

    public Integer getCode() {
        return this.code;
    }

    public List<CustomError> getSubErrors() {
        return this.subCustomErrors;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setSubErrors(List<CustomError> subCustomErrors) {
        this.subCustomErrors = subCustomErrors;
    }

    public String toString() {
        return "Error(description=" + this.getDescription() + ", code=" + this.getCode() + ", subErrors=" + this.getSubErrors() + ")";
    }

    public static class ErrorBuilder {
        private String description;
        private Integer code;
        private List<CustomError> subCustomErrors;

        ErrorBuilder() {
        }

        public ErrorBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public ErrorBuilder withCode(Integer code) {
            this.code = code;
            return this;
        }

        public ErrorBuilder withSubError(CustomError subCustomError) {
            if (subCustomErrors == null){
                subCustomErrors = new ArrayList<>();
            }
            subCustomErrors.add(subCustomError);
            return this;
        }

        public ErrorBuilder withSubErrors(List<CustomError> subCustomErrors) {
            this.subCustomErrors = subCustomErrors;
            return this;
        }

        public CustomError build() {
            return new CustomError(description, code, subCustomErrors);
        }

        public String toString() {
            return "Error.ErrorBuilder(description=" + this.description + ", code=" + this.code + ", subErrors=" + this.subCustomErrors + ")";
        }
    }
}
