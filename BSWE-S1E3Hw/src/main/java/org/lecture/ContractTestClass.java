package org.lecture;

public class ContractTestClass {

    public static void main(String[] args) {
        System.out.println(testUnder3Years() + ": Tested if Contract Runtime is under 3 years when initialized.");
        System.out.println(testSetStartUnder3Years() + ": Tested if Contact startYear is set to under 3 Years of Runtime.");
        System.out.println(testSetEndUnder3Years() + ": Tested if Contract endYear is set to under 3 years of Runtime.");
    }


    private static String testUnder3Years(){
      try{
          Contract c = new Contract(100, 2023);

      }catch (RuntimeException e){
          if(e.getMessage() == "ERR: Runtime for Contract under 3 Years!")
              return "TOK";
      }
      return "TNOK";
    }

    private static String testSetStartUnder3Years(){
        try{
            Contract c = new Contract(100, 2030);
            c.setStartYear(2029);

        }catch (RuntimeException e){
            if(e.getMessage() == "ERR: Runtime for Contract under 3 Years!")
                return "TOK";
        }
        return "TNOK";
    }

    private static String testSetEndUnder3Years(){
        try{
            Contract c = new Contract(100, 2030);
            c.setEndYear(2023);

        }catch (RuntimeException e){
            if(e.getMessage() == "ERR: Runtime for Contract under 3 Years!")
                return "TOK";
        }
        return "TNOK";
    }


}
