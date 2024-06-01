/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elgibran.iegcodeposv2.util;

import java.sql.Date;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author IBRAHIM EL GIBRAN
 */
@Setter
@Getter
public class ComboBoxList {
    private Long id;
    private String name;
    private Date timeStamp;
    
    public ComboBoxList(Long id, String name){
        this.id =id;
        this.name =name;
    }
    
     public ComboBoxList(Long id, Date timeStamp){
        this.id =id;
        this.timeStamp =timeStamp;
    }
    
    public void setSelectedId(ArrayList<ComboBoxList> comboBoxList,String id,javax.swing.JComboBox cb){
        for(ComboBoxList name:comboBoxList){
            if(name.getId().toString().equals(id)){
                cb.setSelectedItem(name);
            }
        }
    }
    
    public String toString(){
        return this.name;
    }
}
