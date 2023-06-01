public class Planetas extends Astros {

    private String orbitaSol, tieneSatelites;
    private Double distanciaSol;

    public Planetas(Double radioEcuatorial, String rotacionEje, Double masa, Double tempMedia, String gravedad,
            Double diametroMedio, Double periodoRotacionEje, Double periodoTraslacion, Double distanciaMedia,
            String nombreAstro, Double distanciaSol, String orbitaSol, String tieneSatelites) {
        super(radioEcuatorial, rotacionEje, masa, tempMedia, gravedad, diametroMedio, periodoRotacionEje,
                periodoTraslacion,
                distanciaMedia, nombreAstro);
        // TODO Auto-generated constructor stub
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = tieneSatelites;
        this.distanciaSol = distanciaSol;
    }

    public void muestraDatos(String nombreAstro) {
        System.out.println("");
        System.out.println("Nombre Astro: " + getNombreAstro());
        System.out.println("RadioEcuatorial: " + getRadioEcuatorial() + " Km");
        System.out.println("Rotacion Sobre su eje: " + getRotacionEje());
        System.out.println("Masa: " + getMasa() + " Kg");
        System.out.println("Temperatura Media: " + getTempMedia() + " grados");
        System.out.println("Gravedad: " + getGravedad());
        System.out.println("Diametro Medio: " + getDiametroMedio() + " Km");
        System.out.println("Periodo Rotacion sobre su eje: " + getPeriodoRotacionEje() + " horas");
        System.out.println("Periodo Traslacion: " + getPeriodoTraslacion() + " días");
        System.out.println("Distancia Media: " + getDistanciaMedia() + " Km");
        System.out.println("Distancia del sol: " + getDistanciaSol() + " Km");
        System.out.println("Orbita al sol: " + getOrbitaSol());
        System.out.println("Tiene Satelites: " + getTieneSatelites());
        System.out.println("");
    }

    @Override
    public Double getDiametroMedio() {
        // TODO Auto-generated method stub
        return super.getDiametroMedio();
    }

    @Override
    public Double getDistanciaMedia() {
        // TODO Auto-generated method stub
        return super.getDistanciaMedia();
    }

    @Override
    public String getGravedad() {
        // TODO Auto-generated method stub
        return super.getGravedad();
    }

    @Override
    public Double getMasa() {
        // TODO Auto-generated method stub
        return super.getMasa();
    }

    @Override
    public String getNombreAstro() {
        // TODO Auto-generated method stub
        return super.getNombreAstro();
    }

    @Override
    public Double getPeriodoRotacionEje() {
        // TODO Auto-generated method stub
        return super.getPeriodoRotacionEje();
    }

    @Override
    public Double getPeriodoTraslacion() {
        // TODO Auto-generated method stub
        return super.getPeriodoTraslacion();
    }

    @Override
    public Double getRadioEcuatorial() {
        // TODO Auto-generated method stub
        return super.getRadioEcuatorial();
    }

    @Override
    public String getRotacionEje() {
        // TODO Auto-generated method stub
        return super.getRotacionEje();
    }

    @Override
    public Double getTempMedia() {
        // TODO Auto-generated method stub
        return super.getTempMedia();
    }

    @Override
    public void setDiametroMedio(Double diametroMedio) {
        // TODO Auto-generated method stub
        super.setDiametroMedio(diametroMedio);
    }

    @Override
    public void setDistanciaMedia(Double distanciaMedia) {
        // TODO Auto-generated method stub
        super.setDistanciaMedia(distanciaMedia);
    }

    @Override
    public void setGravedad(String gravedad) {
        // TODO Auto-generated method stub
        super.setGravedad(gravedad);
    }

    @Override
    public void setMasa(Double masa) {
        // TODO Auto-generated method stub
        super.setMasa(masa);
    }

    @Override
    public void setNombreAstro(String nombreAstro) {
        // TODO Auto-generated method stub
        super.setNombreAstro(nombreAstro);
    }

    @Override
    public void setPeriodoRotacionEje(Double periodoRotacionEje) {
        // TODO Auto-generated method stub
        super.setPeriodoRotacionEje(periodoRotacionEje);
    }

    @Override
    public void setPeriodoTraslacion(Double periodoTraslacion) {
        // TODO Auto-generated method stub
        super.setPeriodoTraslacion(periodoTraslacion);
    }

    @Override
    public void setRadioEcuatorial(Double radioEcuatorial) {
        // TODO Auto-generated method stub
        super.setRadioEcuatorial(radioEcuatorial);
    }

    @Override
    public void setRotacionEje(String rotacionEje) {
        // TODO Auto-generated method stub
        super.setRotacionEje(rotacionEje);
    }

    @Override
    public void setTempMedia(Double tempMedia) {
        // TODO Auto-generated method stub
        super.setTempMedia(tempMedia);
    }

    public Double getDistanciaSol() {
        return this.distanciaSol;
    }

    public void setDistanciaSol(Double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public String getOrbitaSol() {
        return this.orbitaSol;
    }

    public void setOrbitaSol(String orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    public String getTieneSatelites() {
        return this.tieneSatelites;
    }

    public void setTieneSatelites(String tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }

}
