package by.learn.boot.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operation {
    private double num1;
    private double num2;
    private double result;
    private String operation;
}
