import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UsuarioSeguro usuario = new UsuarioSeguro();
        String nombre = "";
        do {
            nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
            if (nombre == null || nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, " El nombre no puede estar vacío, ni puede ser nulo.");
            }
        } while (nombre == null || nombre.trim().isEmpty());
        usuario.setNombreUsuario(nombre);
        String password = JOptionPane.showInputDialog("Ingresa tu contraseña");
        usuario.setPassword(password);
        if (usuario.estaInicializado()) {
            JOptionPane.showMessageDialog(null, "Tu usuario fue creado correctamente.");
            usuario.setPassword("nominuscula1");
            usuario.setPassword("MAYUSCULA1");
            usuario.setPassword("SoloLetras");
            String intento = JOptionPane.showInputDialog("Ingresa la contraseña para autentificarte");
            if (usuario.autenticar(intento)) {
                JOptionPane.showMessageDialog(null, " Acceso concedido");
            } else {
                JOptionPane.showMessageDialog(null, " Acceso denegado.");
            }

        } else {
            JOptionPane.showMessageDialog(null, " El usuario no fue inicializado correctamente.");
        }
    }
}