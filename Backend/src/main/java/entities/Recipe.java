/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author Henrik
 */
@Entity
@NamedQuery(name = "Recipe.deleteAllRows", query = "DELETE from Recipe")
public class Recipe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ingradientList;
    private double preparationTime;
    private String directions;

    public Recipe() {
    }

    public Recipe(String ingradientList, double preparationTime, String directions) {
        this.ingradientList = ingradientList;
        this.preparationTime = preparationTime;
        this.directions = directions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIngradientList() {
        return ingradientList;
    }

    public void setIngradientList(String ingradientList) {
        this.ingradientList = ingradientList;
    }

    public double getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(double preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    
}
