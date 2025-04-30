public class ValidadorSenha {
    public boolean validar(String senha) {
        if (senha.length() < 8) return false;
        
        boolean temNumero = false;
        boolean temMaiuscula = false;
        
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) temNumero = true;
            if (Character.isUpperCase(c)) temMaiuscula = true;
        }
        
        return temNumero && temMaiuscula;
    }
}
