import javax.swing.JOptionPane;

public class UsuarioSeguro {

    private String nombreUsuario;
    private String password;
    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario != null && !nombreUsuario.trim().isEmpty()) {
            this.nombreUsuario = nombreUsuario;
        } else {
            JOptionPane.showMessageDialog(null, "El nombre del usuario no puede estar vacío ni ser nulo.");
        }
    }
    public void setPassword(String password) {
        if (password == null || password.length() < 8) {
            JOptionPane.showMessageDialog(null, "La contraseña debe congtar con 8 caracteres como minimo");
            return;
        }
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneDigito = true;
            }
        }
        if (!tieneMayuscula) {
            JOptionPane.showMessageDialog(null, " La contraseña debe tener al menos una letra mayuscula.");
            return;
        }
        if (!tieneMinuscula) {
            JOptionPane.showMessageDialog(null, " La contraseña debe tener al menos una letra minuscula.");
            return;
        }
        if (!tieneDigito) {
            JOptionPane.showMessageDialog(null, " La contraseña debe contener al menos un numero.");
            return;
        }
        this.password = password;
    }
    public boolean autenticar(String intentoPassword) {
        return this.password != null && this.password.equals(intentoPassword);
    }
    public boolean estaInicializado() {
        return nombreUsuario != null && !nombreUsuario.isEmpty() && password != null;
    }
}