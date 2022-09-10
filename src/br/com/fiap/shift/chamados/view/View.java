package br.com.fiap.shift.chamados.view;

/**
 * Interface para views
 *
 * @param <T>
 */
public interface View<T> {
    void exibe(T t);

    /**
     * Limpando a tela do prompt
     * <p>
     * OBS: No console do IDE a limpeza não funciona, pois estamos em ambiente de desenvolvimento.
     */
    default void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        try {
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system

            if (operatingSystem.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    /**
     * Altera cor do texto
     *
     * @param texto
     * @param cor
     * @return
     * @see "https://en.wikipedia.org/wiki/ANSI_escape_code"
     */
    default String setCor(final String texto, final int cor) {
        return "\u001b[01;" + cor + "m" + texto + "\u001b[00m";
    }

}
