package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        int result;
        if(numberTableToPrint>=0 && numberTableToPrint<11)
        for (int i = 1; i <=10 ; i++) {
            result=i*numberTableToPrint;
            System.out.println(i+" * 10 = " + result);

        }
        else  {
            System.out.println("Enter integer");

        }
    }
}
