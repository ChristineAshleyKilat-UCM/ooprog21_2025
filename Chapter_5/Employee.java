class Employee {
    private int employeenumber;
    private double payrate;
    private static final int MAX_EMPLOYEE_NUMBER = 9999;
    private static final double MAX_PAY_RATE = 60.00;
    private static final double OVER_TIME_RATE = 1.5;

    public Employee(int employeenumber, double payrate) {
        setEmployeeNumber(employeenumber);
        setPayRate(payrate);
    }

    public void setEmployeeNumber(int employeenumber) {
        if (employeenumber > 0 && employeenumber <= MAX_EMPLOYEE_NUMBER) {
            this.employeenumber = employeenumber;
        } else {
            this.employeenumber = 1;  
        }
    }

    public void setPayRate(double payrate) {
        if (payrate > 0) {
            this.payrate = payrate;
        } else {
            this.payrate = 10.0; 
        }
    }

    public int getEmployeeNumber() {
        return employeenumber;
    }

    public double getPayRate() {
        return payrate;
    }

    public double calculateRegularPay(double hoursworked) {
        double regularhours = Math.min(hoursworked, 40);
        return regularhours * payrate;
    }

    public double calculateOvertimePay(double hoursworked) {
        if (hoursworked > 40) {
            double overtimehours = hoursworked - 40;
            return overtimehours * payrate * OVER_TIME_RATE;
        } else {
            return 0;
        }
    }
}