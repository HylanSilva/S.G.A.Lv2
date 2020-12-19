/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper.Rent;

import DAO.RentDAO;
import View.Rent.RentView;

/**
 *
 * @author Samuel
 */
public class RentHelper {
    
    private final RentView view;
    private final RentDAO rentDAO;

    public RentHelper(RentView view, RentDAO rentDAO) {
        this.view = view;
        this.rentDAO = rentDAO;
    }
}
