abstract class Astros {

    private String rotacionEje, gravedad, nombreAstro;
    private Double radioEcuatorial, masa, tempMedia, diametroMedio, periodoRotacionEje, periodoTraslacion,
            distanciaMedia;

    public Astros(Double radioEcuatorial, String rotacionEje, Double masa, Double tempMedia, String gravedad,
            Double diametroMedio, Double periodoRotacionEje, Double periodoTraslacion, Double distanciaMedia,
            String nombreAstro) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionEje = rotacionEje;
        this.masa = masa;
        this.tempMedia = tempMedia;
        this.gravedad = gravedad;

        this.diametroMedio = diametroMedio;
        this.periodoRotacionEje = periodoRotacionEje;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMedia = distanciaMedia;
        this.nombreAstro = nombreAstro;

    }

    public Double getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public void setRadioEcuatorial(Double radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }

    public String getRotacionEje() {
        return rotacionEje;
    }

    public void setRotacionEje(String rotacionEje) {
        this.rotacionEje = rotacionEje;
    }

    public Double getMasa() {
        return masa;
    }

    public void setMasa(Double masa) {
        this.masa = masa;
    }

    public Double getTempMedia() {
        return this.tempMedia;
    }

    public void setTempMedia(Double tempMedia) {
        this.tempMedia = tempMedia;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public Double getDiametroMedio() {
        return diametroMedio;
    }

    public void setDiametroMedio(Double diametroMedio) {
        this.diametroMedio = diametroMedio;
    }

    public Double getPeriodoRotacionEje() {
        return periodoRotacionEje;
    }

    public void setPeriodoRotacionEje(Double periodoRotacionEje) {
        this.periodoRotacionEje = periodoRotacionEje;
    }

    public Double getPeriodoTraslacion() {
        return periodoTraslacion;
    }

    public void setPeriodoTraslacion(Double periodoTraslacion) {
        this.periodoTraslacion = periodoTraslacion;
    }

    public Double getDistanciaMedia() {
        return distanciaMedia;
    }

    public void setDistanciaMedia(Double distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
    }

    public String getNombreAstro() {
        return nombreAstro;
    }

    public void setNombreAstro(String nombreAstro) {
        this.nombreAstro = nombreAstro;
    }

}
