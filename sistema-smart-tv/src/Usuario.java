public class Usuario {
    public static void main(String[] arg) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVulume();
        smartTv.diminuirVulume();
        smartTv.diminuirVulume();
        smartTv.aumentarVulume();

        System.out.println("Canal atual ? :" + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual ? :" + smartTv.canal);

        System.out.println("vulume atual ? :" + smartTv.volume);


        System.out.println("TV ligada ? :" + smartTv.ligada);
        System.out.println("Canal atual ? :" + smartTv.canal);
        System.out.println("vulume atual ? :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("novo Status -> TV ligada ? :" + smartTv.ligada);
        smartTv.desligar();
        System.out.println("novo Status -> TV ligada ? :" + smartTv.ligada);

    }
}
