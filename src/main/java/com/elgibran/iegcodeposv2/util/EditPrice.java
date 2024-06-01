/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elgibran.iegcodeposv2.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Java Programming with IBRAHIM EL GIBRAN
 */
@Setter
@Getter
@ToString
public class EditPrice {

    private Long todaysMenuId;
    private Long menuId;
    private Float price;
    private String recipe;
    private String ingredients;
}
