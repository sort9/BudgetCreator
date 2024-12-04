import java.util.Scanner;

class Main {
    
    static void defaultBudget(double amount) {
        
        Scanner input = new Scanner(System.in);
        
        double salary = amount;
        
        double needs = 0.50 * salary, wants = 0.30 * salary, savings = 0.20 * salary;
        
        try {
            System.out.println("Salary: $" + salary);
            System.out.println("Allowance for Needs: $" + needs);
            System.out.println("Allowance for Savings: $" + savings);
            System.out.println("Allowance for Wants: $" + wants);
        }
        catch (Exception e) {
            System.out.println("An error occured somewhere...");
        }
    }
    
    static void customBudget(double amount) {
        
        Scanner input = new Scanner(System.in);
        
        double salary = amount;
        double needsAllocation, wantsAllocation, savingsAllocation, totalAllocation;
        
        // collect needs budget allocation info
        do {
            System.out.print("Enter your budget allocation for needs: ");
            needsAllocation = input.nextDouble();
            if (needsAllocation < 0 || needsAllocation > 1) {
                    System.out.println("Error. Number not entered as a decimal to be calculated as a percentage. Please Try again."); 
            }
        }
        while (needsAllocation < 0 || needsAllocation > 1);
        
        // collect wants budget allocation info
        do {
            System.out.print("Enter your budget allocation for needs: ");
            wantsAllocation = input.nextDouble();
            if (wantsAllocation < 0 || wantsAllocation > 1) {
                    System.out.println("Error. Number not entered as a decimal to be calculated as a percentage. Please Try again."); 
            }
        }
        while (wantsAllocation < 0 || wantsAllocation > 1);
        
        // collect savings budget allocation info
        do {
            System.out.print("Enter your budget allocation for needs: ");
            savingsAllocation = input.nextDouble();
            if (savingsAllocation < 0 || savingsAllocation > 1) {
                    System.out.println("Error. Number not entered as a decimal to be calculated as a percentage. Please Try again."); 
            }
        }
        while (savingsAllocation < 0 || savingsAllocation > 1);
        
        totalAllocation = needsAllocation + wantsAllocation + savingsAllocation;
        
        // error handling for when total allocation is greater than 1
        if (totalAllocation > 1) {
            System.out.println("Error: Salary not allocated properly | Reason: total budget allocation is more than 1");
            // input reprompt functionality or change code that comes before this
        }
        
        // error handling for when total allocation is less than 1
        if (totalAllocation < 1) {
            System.out.println("Error: Salary not allocated properly | Reason: total budget allocation is less than 1");
            // input reprompt functionality or change code that comes before this
        }
        
        double needs = needsAllocation * salary;
        double wants = wantsAllocation * salary;
        double savings = savingsAllocation * salary;
        
        try {
            System.out.println("-------------------------------");
            System.out.println("Salary: $" + salary);
            System.out.println("\n-------------------------------");
            System.out.println("\nAllowance for Needs: $" + needs);
            System.out.println("Allowance for Savings: $" + savings);
            System.out.println("Allowance for Wants: $" + wants);
        }
        catch (Exception e) {
            System.out.println("An error occured somewhere...");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int choice;
        double salary;
        
        System.out.print("Enter your monthly salary: ");
        salary = input.nextDouble();
        System.out.println("0 for Default Budget (50-30-20)");
        System.out.println("1 for Custom Budget");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        
        switch (choice) {
            case 0:
                defaultBudget(salary);
                break;
            case 1:
                customBudget(salary);
                break;
        }
        
    }
}