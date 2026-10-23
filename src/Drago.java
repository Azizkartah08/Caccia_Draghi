public class Drago implements Runnable {
    private String nome;
    int battiti;
    public Drago(int battiti, String nome) {
        this.battiti = battiti;
        this.nome = nome;
    }
    @Override
    public void run() {
        for(int i = 0; i < battiti; i++) {
            System.out.print(nome + " il drago sta facendo " + battiti + " battiti");
        } try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}