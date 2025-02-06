class Interakce implements Command {
    private Hrac hrac;
    private String objekt;

    public Interakce(Hrac hrac, String objekt) {
        this.hrac = hrac;
        this.objekt = objekt;
    }

    @Override
    public void execute() {
        hrac.interagujSObjektem(objekt);
    }
}