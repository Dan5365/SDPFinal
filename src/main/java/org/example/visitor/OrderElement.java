package org.example.visitor;

public interface OrderElement {
    void accept(Visitor visitor);
}