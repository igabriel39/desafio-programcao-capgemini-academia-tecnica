package desafioProgramacao;

public class Calculadora {

    private int totVisualizacao;
    private int totClick;
    private int totComp;
    private int investimentoTotal;

    public Calculadora(int valor){
        int totalVisu =0, totalClique =0, totalComp =0;
        int visualizaAnuncio = valor * 30;
        while (visualizaAnuncio >= 100) {
            totalVisu += visualizaAnuncio;
            int click = (int) (Math.floor(visualizaAnuncio / 100) * 12);
            totalClique += click;
            int comp;
            int compFinal;
            if (click >= 20) {
                comp = (int) (Math.floor(click / 20) * 3);
                compFinal = (int) (comp - (Math.floor(comp / 4)));
                totalComp += compFinal;
            } else {
                break;
            }
            visualizaAnuncio = compFinal * 40;
        }

        this.totVisualizacao = totalVisu;
        this.totClick = totalClique;
        this.totComp = totalComp;
        this.investimentoTotal = valor;
    }
}
