package com.comaru.apicob_id.util;

public class NossoNumeroUtil {

    private static final int[] WEIGHTS = {2, 3, 4, 5, 6, 7};
    private static final String DEFAULT_CARTEIRA = "09";

    private String calculateWithCarteira09(String nossoNumero) {
        return calcularDigitoVerificador(DEFAULT_CARTEIRA, nossoNumero);
    }

    private static String calcularDigitoVerificador(String carteira, String nossoNumero) {
        if (carteira == null) carteira = "";
        if (nossoNumero == null) nossoNumero = "";

        String combined = (carteira + nossoNumero).replaceAll("\\D", "");
        if (combined.isEmpty()) {
            throw new IllegalArgumentException("Carteira e Nosso Número devem conter dígitos.");
        }

        int sum = 0;
        int weightIndex = 0;
        for (int i = combined.length() - 1; i >= 0; i--) {
            int digit = Character.digit(combined.charAt(i), 10);
            sum += digit * WEIGHTS[weightIndex];
            weightIndex = (weightIndex + 1) % WEIGHTS.length;
        }

        int remainder = sum % 11;
        int dv = 11 - remainder;
        if (dv == 10) {
            return "P";
        }
        if (dv == 11) {
            dv = 0;
        }
        return String.valueOf(dv);
    }

    /**
     * Gera o Nosso Número (base 11 posições) e acrescenta o dígito verificador.
     * Formato base: P(1) + agência(4) + sequencial(6) = 11 dígitos. Retorna base + DV.
     *
     * @param agencia              código da agência (será formatado para 4 dígitos)
     * @param ultimoNossoNumero    último nosso número base (11 dígitos) obtido do banco, pode ser null
     * @return nosso número completo com dígito verificador (base 11 + 1 dígito)
     */
    public static String gerarNossoNumero(String agencia, int ultimoNossoNumero) {
        String produto = "1"; // padrão: 1 = Registrada

        String agenciaFmt = (agencia == null) ? "0000" : String.format("%4s", agencia).replace(' ', '0');
    
        int novoSeq = ultimoNossoNumero + 1;
        if (novoSeq > 999999) {
            throw new IllegalStateException("Sequencial excedeu o limite de 6 dígitos");
        }

        String seqFmt = String.format("%06d", novoSeq);
        String base = produto + agenciaFmt + seqFmt; // 11 dígitos

        String dv = calcularDigitoVerificador(DEFAULT_CARTEIRA, base);
        return base + dv;
    }
}
