package org.java.practice.design.pattern.behavior.byintermediate.visitor;

/**
 * Created by yang.jin on 07/11/2017.
 */
public class ConcreteVisitor2 implements Visitor{

    @Override
    public void visit(Element ele) {
        System.out.println("ConcreteVisitor2 visit the element"+ele.getElement());
    }
}
