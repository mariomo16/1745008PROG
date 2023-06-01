public class Satelites extends Astros {

    private String orbitaPlanetaria, planetaPertenece;
    private Double distanciaPlaneta;

    public Satelites(Double radioEcuatorial, String rotacionEje, Double masa, Double tempMedia, String gravedad,
            Double diametroMedio, Double periodoRotacionEje, Double periodoTraslacion, Double distanciaMedia,
            String nombreAstro, Double distanciaPlaneta, String orbitaPlanetaria, String planetaPertenece) {
        super(radioEcuatorial, rotacionEje, masa, tempMedia, gravedad, diametroMedio, periodoRotacionEje,
                periodoTraslacion,
                distanciaMedia, nombreAstro);
        // TODO Auto-generated constructor stub
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaPertenece = planetaPertenece;
        this.distanciaPlaneta = distanciaPlaneta;
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
        System.out.println("Distancia Planeta: " + getDistanciaPlaneta());
        System.out.println("Orbita Planetaria: " + getOrbitaPlanetaria());
        System.out.println("Planeta al que pertenece: " + getPlanetaPertenece());
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

    public void setDistanciaPlaneta(Double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public Double getDistanciaPlaneta() {
        return this.distanciaPlaneta;
    }

    public void setOrbitaPlanetaria(String orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public String getOrbitaPlanetaria() {
        return this.orbitaPlanetaria;
    }

    public String getPlanetaPertenece() {
        return this.planetaPertenece;
    }

    public void setPlanetaPertenece(String planetaPertenece) {
        this.planetaPertenece = planetaPertenece;
    }

}
