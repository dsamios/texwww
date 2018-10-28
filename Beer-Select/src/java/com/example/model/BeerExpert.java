	
package com.example.model;

import java.util.*;

public class BeerExpert {
   public List getStyles(String style) {

     List styles = new ArrayList();

     if (style.equals("amber")) {
       styles.add("Amber Beer 1");
       styles.add("Amber Beer 2");
     }
     else if (style.equals("blonde")) {
       styles.add("Blonde Beer 1");
       styles.add("Blonde Beer 2");
       styles.add("Blonde Beer 3");
     }
     else if (style.equals("dark")) {
       styles.add("Dark Beer 1");
     }
     else if (style.equals("golden")) {
       styles.add("Golden Beer 1");
       styles.add("Golden Beer 2");
     }
     else {
       styles.add("Red Beer 1");
     }
     return(styles);
   }
}