/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.elgibran.iegcodeposv2.dao;

import com.elgibran.iegcodeposv2.model.Invoice;
import java.util.ArrayList;

/**
 *
 * @author IBRAHIM EL GIBRAN
 */
public interface InvoiceDAO {

    public Long getMaxId();

//    add Invoice
    public void addInvoice(Invoice invoice);

//    update Invoice
    public void updateInvoice(Invoice invoice);

//    delete Invoice
    public void deleteInvoice(Invoice invoice);

//    list of Invoice
    public ArrayList<Invoice> selectInvoice();

    public void comboBoxInvoice();

    public ArrayList<Invoice> getSalesUser(Long userId, Long startId, Long endId);

    public void invoiceDateTimeComboBox();
    
    public void invoiceDateTimeComboBox(Long userId) ;

}
