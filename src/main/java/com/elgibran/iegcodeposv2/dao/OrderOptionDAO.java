/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.elgibran.iegcodeposv2.dao;

import com.elgibran.iegcodeposv2.model.OrderOption;
import java.util.ArrayList;

/**
 *
 * @author IBRAHIM EL GIBRAN
 */
public interface OrderOptionDAO {

    public Long getMaxId();

//    add Category
    public void addOrderOption(OrderOption orderOption);

//    update Category
    public void updateOrderOption(OrderOption orderOption);

//    delete Category
    public void deleteOrderOption(OrderOption orderOption);

//    list of Category
    public ArrayList<OrderOption> selectOrderOption();

    public void comboBoxOrderOption();

}
