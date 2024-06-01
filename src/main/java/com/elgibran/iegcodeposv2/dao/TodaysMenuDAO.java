/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.elgibran.iegcodeposv2.dao;

import com.elgibran.iegcodeposv2.model.Category;
import com.elgibran.iegcodeposv2.model.Menu;
import com.elgibran.iegcodeposv2.model.TodaysMenu;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author IBRAHIM EL GIBRAN
 */
public interface TodaysMenuDAO {

    public Long getMaxId();

//    add TodaysMenu
    public void addTodaysMenu(TodaysMenu todaysMenu);

//    update TodaysMenu
    public void updateTodaysMenu(TodaysMenu todaysMenu);

//    delete TodaysMenu
    public void deleteTodaysMenu(TodaysMenu todaysMenu);

//    list of TodaysMenu
    public ArrayList<TodaysMenu> selectTodaysMenu();

    public void comboBoxTodaysMenu();

    public ArrayList<TodaysMenu> getMenuList();

    public Boolean selectTodaysMenu(Long id);

    public Boolean getTodaysMenuDRemove(Long menuId);

    public void updateTodaysMenu(Long id);

    public Boolean getTodaysMenuDeletedRecover(Long menuId);

    public void addMenuOfTheDay(Menu menu);

    public ArrayList<Category> selectTodaysMenuCategory();

//    public LinkedList<com.elgibran.IegcodePosv2.model.TodaysMenu> getMenuByCategoryIdMenuId(Long id);
    public abstract LinkedList<TodaysMenu> getMenuByCategoryIdMenuId(Long id);

    public void updateMenuPrice(TodaysMenu tm);

}
