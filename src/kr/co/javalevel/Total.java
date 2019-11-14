package kr.co.javalevel;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Total {
    public static void main(String[] args) {
        List<String> customerList = loadFile("C:\\JavaLevelCheck\\customer.csv");
        List<String> orderList = loadFile("C:\\JavaLevelCheck\\order.csv");
        List<String> productList = loadFile("C:\\JavaLevelCheck\\product.csv");
        
        System.out.println(customerList);
        System.out.println(productList);
        System.out.println(orderList);
        
        Customer customer = new Customer(Integer.parseInt(customerList.get(0)), customerList.get(1));
        System.out.println(customer.getCustomerNumber() + " " + customer.getCustomerName());
        
        Product product = new Product(Integer.parseInt(productList.get(0)), productList.get(1));
        System.out.println(product.getProductNumber() + " " + product.getProductName());
        
        Order order = new Order(Integer.parseInt(orderList.get(0)), customer, product);
        System.out.println(order.getOrderNumber() + " " + order.getCustomerNumber().getCustomerNumber() + " " + order.getProductNumber().getProductNumber());
        
        System.out.println(order.toString());
    }

    private static List<String> loadFile(String path) {
        List<String> list = new ArrayList<>();
        BufferedReader br = null;
        String line;
    
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            while ((line = br.readLine()) != null) {
                if(line.indexOf("식별번호") < 0) {
                    String[] field = line.split(",");
                    
                    for(int i=0; i<field.length; i++) {
                        list.add(field[i]);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
