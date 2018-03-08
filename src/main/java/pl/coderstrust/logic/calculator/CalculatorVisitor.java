package pl.coderstrust.logic.calculator;

import pl.coderstrust.model.Invoice;

import java.math.BigDecimal;

public interface CalculatorVisitor {

    public BigDecimal visit(Invoice invoice);
}
