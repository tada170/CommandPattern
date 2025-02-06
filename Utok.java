class Utok implements Command {
    private Hrac hrac;

    public Utok(Hrac hrac) {
        this.hrac = hrac;
    }

    @Override
    public void execute() {
        hrac.utoc();
    }

}
