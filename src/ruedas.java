 class ruedas extends clsLocomocion {
    private int cantRuedas;
    private String traccion;

    public ruedas(int cantRuedas, String traccion) {
        this.cantRuedas = cantRuedas;
        this.traccion = traccion;
    }

    @Override
    public String elementos() {
        return cantRuedas + " ruedas, tracción " + traccion;
    }
}

