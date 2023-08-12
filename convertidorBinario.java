import java.util.Scanner;

class ConvertidorBinario {
    private String numeroBinario;

    public ConvertidorBinario(String numeroBinario) {
        this.numeroBinario = numeroBinario;
    }

    public int convertirADecimal() {
        int decimal = 0;
        int potencia = 0;

        for (int i = numeroBinario.length() - 1; i >= 0; i--) {
            if (numeroBinario.charAt(i) == '1') {
                decimal += Math.pow(2, potencia);
            }
            potencia++;
        }

        return decimal;
    }
}