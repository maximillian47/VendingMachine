package com.vendingmachine;


public interface VendingMachine {

    Product selectProduct(int _selectedProductID);
    void dispenseProduct(int _selectedProductID);
    //    void refundChange();

}
