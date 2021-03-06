package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="tbl_Card_Bind")  
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CardBinModel {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long Id;
    private int binNumber;
    private String binType;

    /*@ManyToOne
    private Attribute Attribute;*/


}

