/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTimeExamples;

/**
 *
 * @author PietroS
 */
import java.util.*;

public class Tax_en_US extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"tax", new UsTaxCode()}};
    }

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle(
                "resourcebundles.Tax", Locale.US);
        System.out.println(rb.getObject("tax"));
    }
}

class UsTaxCode {}
