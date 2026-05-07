public class Naga extends Musuh {
    public Naga() {
        super("Naga Bobar", 500);
    }



    // wajib ada : dipaksa java untuk mengoverride
    @Override
   public void suaraKhas(){
    System.out.println("roaaarrrr!!!");
   }
    public void serangPemain() {
        System.out.println(this.namaMusuh + "menyemburkan nafas api dari udara! player -50 hp");
    }
}
