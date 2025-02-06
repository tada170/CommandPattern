class Pohyb implements Command {
    private Hrac hrac;
    private String smer;

    public Pohyb(Hrac hrac, String smer) {
        this.hrac = hrac;
        this.smer = smer;
    }

    @Override
    public void execute() {
        hrac.pohyb(smer);
    }
}