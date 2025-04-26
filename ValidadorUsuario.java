import java.util.regex.Pattern;

public class ValidadorUsuario {
    
    public static boolean validarNombre(String nombre) {
        return Pattern.matches("^[A-ZÁÉÍÓÚÑ][a-záéíóúñ]+(\\s[A-ZÁÉÍÓÚÑ][a-záéíóúñ]+)*$", nombre);
    }

    public static boolean validarCorreo(String correo) {
        return Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$", correo);
    }

    public static boolean validarContraseña(String contraseña) {
        return contraseña.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+]).{8,}$");
    }
}

