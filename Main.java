import java.util.Scanner;

class Main {
    
    Scanner input = new Scanner(System.in);
    
    public static void percentConvert(double numberToConvert) {
            double n = numberToConvert;
            double percent = n / 100;
            System.out.println("Percentage as a decimal");
        }
    
    static void defaultBudget(double amount) {
        
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
        
        double salary = amount;
        
        System.out.print("Enter your budget allocation for needs: ");
        needsAllocation = input.nextDouble();
        System.out.print("Enter your budget allocation for wants: ");
        wantsAllocation = input.nextDouble();
        System.out.print("Enter your budget allocation for savings: ");
        savingsAllocation = input.nextDouble();
        
        double needsAllocation = percentConvert(), wantsAllocation = percentConvert(), savingsAllocation = percentConvert();
        
        double needs = needsAllocation * salary, wants = wantsAllocation * salary, savings = savingsAllocation * salary;
        
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
    
    public static void main(String[] args) {
        
        int choice;
        double salary;
        
        System.out.print("Enter your monthly salary: ");
        salary = input.nextDouble();
        System.out.println("0 for Default Budget (50-30-20)");
        System.out.println("1 for Custom Budget");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        
        switch (choice) {
            case 0:
                defaultBudget(salary);
            case 1:
                customBudget(salary);
        }
        
    }
}