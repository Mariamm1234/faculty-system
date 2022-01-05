package com.company;

class student extends person {
    private double GPA;
    private int level;
    String department;

    public student() {
        setAge(20);
        setAddress("Assiut");
        this.GPA = 4;
    }
    public String toString()
    {printData();
    System.out.println("GPA : "+GPA+"\n Level : "+level+"\n Department : "+department);
    return "0";}

    public void setGPA(double GPA) {
        if(GPA>=1&&GPA<=4)
        this.GPA = GPA;
        else
            throw new ArithmeticException("this input is not valid");
    }

    public double getGPA() {
        return GPA;
    }

    public void setLevel(int level) {
        if(level>=1&&level<=4)
        this.level = level;
        else
            throw new ArithmeticException("this input is not valid");
    }

    public int getLevel() {
        return level;
    }
}
