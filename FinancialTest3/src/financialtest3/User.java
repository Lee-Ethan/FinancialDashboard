/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialtest3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jerry
 */
public class User {

    String firstName;
    String lastName;
    String email;
    String password;
    boolean income;
    boolean salary;
    Map< String, Integer> investments
            = new HashMap< String, Integer>();
    Map< String, Integer> expenses
            = new HashMap< String, Integer>();

    public User() {

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIncome(boolean income) {
        this.income = income;
    }

    public void setSalary(boolean salary) {
        this.salary = salary;
    }

    public void setInvestments(Map<String, Integer> investments) {
        this.investments = investments;
    }

    public void setExpenses(Map<String, Integer> expenses) {
        this.expenses = expenses;
    }
    
}
