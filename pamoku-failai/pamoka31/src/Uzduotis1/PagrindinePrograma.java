package Uzduotis1;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Apskritimas apskritimas = new Apskritimas();
        apskritimas.spindulys = 12.12;
        Apskritimas a2 = new Apskritimas(14.16);
        System.out.println("apskritimas.diametras = " + apskritimas.diametras());
        System.out.println("a2.diametras() = " + a2.diametras());
        apskritimas.padidintiApskritima(4);
        System.out.println(apskritimas);
        System.out.println("a2.ilgis() = " + a2.ilgis());
        System.out.println("apskritimas.ilgis() = " + apskritimas.ilgis());
        System.out.println("a2.plotas() = " + a2.plotas());
        System.out.println("apskritimas.plotas() = " + apskritimas.plotas());

    }
}
