/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.elgibran.iegcodeposv2.dao;

import com.elgibran.iegcodeposv2.model.InvoiceLineMenu;
import java.util.ArrayList;

/**
 *
 * @author IBRAHIM EL GIBRAN
 */
public interface InvoiceLineMenuDAO {

    public Long getMaxId();

//    add InvoiceLineMenu
    public void addInvoiceLineMenu(InvoiceLineMenu invoiceLineMenu);

//    update InvoiceLineMenu
    public void updateInvoiceLineMenu(InvoiceLineMenu invoiceLineMenu);

//    delete InvoiceLineMenu
    public void deleteInvoiceLineMenu(InvoiceLineMenu invoiceLineMenu);

//    list of InvoiceLineMenu
    public ArrayList<InvoiceLineMenu> selectInvoiceLineMenu();

    public void comboBoxInvoiceLineMenu();

    public ArrayList<InvoiceLineMenu> selectInvoiceLineMenuByInvoiceId(Long id);

}
