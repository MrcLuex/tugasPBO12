public class App {
    public static void main(String[] args) {

    //polymorphisme

        DataPelanggan newP = new Pelanggan();
 
    //exception 

    try {
        newP.inputPelanggan();
    } 
    catch (Exception e){
        System.out.println("Data tidak sesuai datatype");
    }

    //output
    
        newP.outp();

    }
}