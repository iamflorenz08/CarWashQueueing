/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Florenz
 */
public class CarModel {
    private String plate_no;
    private String model;
    private String color;
    private String status;

    public CarModel() {
        
    }

    public CarModel(String plate_no, String model, String color, String status) {
        this.plate_no = plate_no;
        this.model = model;
        this.color = color;
        this.status = status;
    }
    

    public String getPlate_no() {
        return plate_no;
    }

    public void setPlate_no(String plate_no) {
        this.plate_no = plate_no;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
