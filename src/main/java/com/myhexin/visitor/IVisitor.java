package com.myhexin.visitor;

import com.myhexin.visitor.impl.CommonEmployee;
import com.myhexin.visitor.impl.Manager;

/**
 * 访问者模式,多个访问者,多用于统计功能。
 * 并且与适配器模式多用于项目的重构
 */
public interface IVisitor {

    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);
}
