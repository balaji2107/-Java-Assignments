package assignmentone;

import java.util.Scanner;


public class FindBMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many person added to find BMI: ");
        int personCount=sc.nextInt();
        sc.nextLine();
        PersonAdd[] persons=new PersonAdd[personCount];
        for(int i=0;i<personCount;i++) {
            System.out.println("Enter the name of person " + (i + 1));
            String personName = sc.nextLine();
            System.out.println("Enter weight of person " + (i + 1) + " in kg: ");
            double personKg = sc.nextDouble();
            System.out.println("Enter height of person " + (i + 1) + " in cm: ");
            double personHeight = sc.nextDouble();
            sc.nextLine();
            persons[i] = new PersonAdd(personName, personKg, personHeight);
        }

        for(int i=0;i<persons.length;i++){
            double bmi = persons[i].getPersonKg() / (persons[i].getPersonHeight() * persons[i].getPersonHeight());
            persons[i].setBmi(bmi);
        }
        for(int i=0;i<persons.length;i++){
            if (persons[i].getBmi() < 18.5) {
                  persons[i].setRemark("Under weight");
            } else if (persons[i].getBmi() >= 18.5 && persons[i].getBmi() < 25) {
                persons[i].setRemark("Normal weight");
            } else if (persons[i].getBmi() >= 25 && persons[i].getBmi() < 30) {
                persons[i].setRemark("Over weight");
            } else {
                persons[i].setRemark("obese");
            }
        }
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                if (persons[j].getBmi() < persons[j + 1].getBmi()) {
                    PersonAdd temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        for(PersonAdd person:persons){
            System.out.println("Name: " + person.getPersonName() + ", BMI: " +person.getBmi()+", Remark: " +person.getRemark());
        }
    }
}
class PersonAdd{
    private String personName;
    private double personKg;
    private double personHeight;
    private double bmi;
    private String remark;
    PersonAdd(String personName,Double personKg,Double personHeight){
        this.personName=personName;
        this.personKg=personKg;
        this.personHeight=personHeight;
    }
    public String getPersonName() {
        return personName;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public double getPersonKg() {
        return personKg;
    }
    public void setPersonKg(double personKg) {
        this.personKg = personKg;
    }
    public double getPersonHeight() {
        return personHeight;
    }
    public void setPersonHeight(double personHeight) {
        this.personHeight = personHeight;
    }

    public double getBmi() {
        return bmi;
    }
    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}