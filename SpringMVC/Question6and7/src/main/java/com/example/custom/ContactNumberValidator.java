package com.example.custom;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class ContactNumberValidator implements 
ConstraintValidator<ContactNumberConstraint, String> 
{

	public boolean isValid(String value, ConstraintValidatorContext context) 
	{
		return value != null && value.matches("^[1-9][0-9]{9}$");
	}

}
