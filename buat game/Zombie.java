public class Zombie extends Musuh {
    public Zombie() {
        // memanggil construktor kelas induk abstrak
        super("Zombie chill", 150);
    }

    // wajib ada : dipaksa java untuk mengoverride
    @Override
    public void suaraKhas(){
    System.out.println("ggrrr... brainss..");
   }
    public void serangPemain() {
        System.out.println(this.namaMusuh + "mengejar mencakar dan mengigit! player -20 hp");
    }
}
