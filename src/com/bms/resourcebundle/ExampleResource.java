package com.bms.resourcebundle;

import java.util.ListResourceBundle;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class ExampleResource extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] { 
            { "greeting", "hello" } 
        };
    }

}
