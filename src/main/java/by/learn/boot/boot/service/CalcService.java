package by.learn.boot.boot.service;

import by.learn.boot.boot.entity.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public Operation calc(double a, double b, String operation) {
        switch (operation) {
            case "sum":
                return new Operation(a, b, a + b, operation);
            case "sub":
                return new Operation(a, b, a - b, operation);
            case "mul":
                return new Operation(a, b, a * b, operation);
            case "div":
                return new Operation(a, b, a / b, operation);
        }
        return null;
    }
}
