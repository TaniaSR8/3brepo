import javax.swing.*;

public class UsuarioSeguro {

    private String nombreUsuario;
    private String password;


    public String getNombreUsuario() {
        return nombreUsuario;
    }

//setters
    public void setNombreUsuario(String nombreUsuario) {
        if(nombreUsuario == null || nombreUsuario.isEmpty()){

            String nombre= JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario");
        }
        this.nombreUsuario = nombreUsuario;

    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password == null || password.length()<8){
            System.out.println("La contraseña debe teener como minimo 8 caracteres");
            return;
        }
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;

        for(char c: password.toCharArray()){
            if(Character.isSuperCase(c)){
                tieneMayuscula = true;

            }else if(Character.isDigit(c)){
                tieneMinuscula = true;
            }else if(Character.isLetter(c)){
                tieneDigito = true;
            }

        }if (!tieneMayuscula){
            System.out.println("La contraseña debe de tener mayuscul una por lo menos");
            return;
        }if (!tieneMinuscula){
            System.out.println("La conytraseña por lo menos debe de tener una minuscula");
            return;
        }if (!tieneDigito){
            return;
        }
        this.password = password;
    }


}


