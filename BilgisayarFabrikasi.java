public class BilgisayarFabrikasi{

        public static IBilgisayar Uret(String Marka, String Model, String CPU, int Ram, int Memory){

                    if(Marka == null){
                        System.out.println("Herhangi bir model tanimlanamadi!\n");
                        return null;
                    }		
                    if(Marka.equalsIgnoreCase("Hp")){
                        return new Hp(Marka, Model, CPU, Ram, Memory);
                    } else if(Marka.equalsIgnoreCase("Lenovo")){
                        return new Lenovo(Marka, Model, CPU, Ram, Memory); 
                    } else if(Marka.equalsIgnoreCase("MSI")){
                        return new MSI(Marka, Model, CPU, Ram, Memory);
                    } else {
                        throw new RuntimeException("Boyle bir bilgisayar modelimiz bulunmamakta!\n");    
                    }
        }
}