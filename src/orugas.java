class orugas extends clsLocomocion{
    private int cantOrugas;

    public orugas (int cantOrugas) {
        this.cantOrugas = cantOrugas;
    }

    @Override
    public String elementos() {
        return cantOrugas + " Orugas.";
    }
}

