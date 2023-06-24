package com.inheritance;

public class wagesemp {
    private int empid;
    private String empname;
    private String dept;
    private String dateofjoin;
    private int noofworkingdays;

    public wagesemp (int empid, String empname, String dept, String dateofjoin, int noofworkingdays)
    {
        super();
        this.empid=empid;
        this.empname=empname;
        this.dept=dept;
        this.dateofjoin=dateofjoin;
        this.noofworkingdays=noofworkingdays;
    }

    public double calculatesalary()
    {
        double grosssal = 2000 * noofworkingdays;
        return grosssal;
    }

    public void showsal()
    {
        System.out.println("*******Salary Slip*******");
        System.out.println("Employee Id ="+ empid);
        System.out.println("Employee name ="+ empname);
        System.out.println("Employee Department ="+ dept);
        System.out.println("Date Of Joining ="+dateofjoin);
    }


}
