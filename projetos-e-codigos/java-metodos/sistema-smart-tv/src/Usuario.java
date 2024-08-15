public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smarTv = new SmartTv();


        System.out.print("TV " + smarTv.ligado);
        System.out.print("Canal atual: " + smarTv.canal);
        System.out.print("Volume: " + smarTv.volume);

        smarTv.mudarDeCanal(13);
    }
}
