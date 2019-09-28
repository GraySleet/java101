package com.mhisoft.matthew.learningjava.FinallyPackage;

public class FinallyWorks {
    static int count = 0;
    public static void main(String[] args){
        while(true){
            try{
                if(count++==0)
                    throw new Exception();
                System.out.println("No exception");

            }
            catch(Exception e){
                System.out.println("Exception thrown");
            } finally{
                System.out.println("in finally clause");
                if(count==2) break;
            }
        }
    }
}


