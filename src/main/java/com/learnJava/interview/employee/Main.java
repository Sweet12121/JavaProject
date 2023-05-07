package com.learnJava.interview.employee;

    abstract class Employee {
        protected int salary;
        protected String grade;

        abstract void setSalary(int salary);
        abstract int getSalary();
        abstract void setGrade(String grade);
        abstract String getGrade();

        public void label() {
            System.out.println("Employee's data:");
        }
    }

    class Engineer extends Employee {
        private int salary;
        private String grade;
        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return this.salary;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getGrade() {
            return this.grade;
        }
    }

    class Manager extends Employee {
        private int salary;
        private String grade;
        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return this.salary;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getGrade() {
            return this.grade;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Engineer eng = new Engineer();
            eng.setSalary(5000);
            eng.setGrade("Senior");
            eng.label();
            System.out.println("Salary: " + eng.getSalary());
            System.out.println("Grade: " + eng.getGrade());

            Manager mgr = new Manager();
            mgr.setSalary(8000);
            mgr.setGrade("Executive");
            mgr.label();
            System.out.println("Salary: " + mgr.getSalary());
            System.out.println("Grade: " + mgr.getGrade());
        }
    }


