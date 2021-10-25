package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="Atribute")

@Getter
@Setter
public class AttributeModel {
    
    private long Id;
    private int Key;
    private int value;

}
