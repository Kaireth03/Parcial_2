import java.util.Scanner;

public class RegistroUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registro de Usuario ===");

        String nombre;
        do {
            System.out.print("Ingrese su nombre completo: ");
            nombre = scanner.nextLine();
            if (!ValidadorUsuario.validarNombre(nombre)) {
                System.out.println("Nombre inválido. Debe iniciar con mayúscula y solo contener letras y espacios.");
            }
        } while (!ValidadorUsuario.validarNombre(nombre));

        String correo;
        do {
            System.out.print("Ingrese su correo electrónico: ");
            correo = scanner.nextLine();
            if (!ValidadorUsuario.validarCorreo(correo)) {
                System.out.println("Correo invalido. Intente con un formato como usuario@dominio.com");
            }
        } while (!ValidadorUsuario.validarCorreo(correo));

        String contraseña;
        do {
            System.out.print("Ingrese su contraseña: ");
            contraseña = scanner.nextLine();
            if (!ValidadorUsuario.validarContraseña(contraseña)) {
                System.out.println("Contraseña invalida. Debe tener al menos 8 caracteres, incluir mayúsculas, minúsculas, números y símbolos.");
            }
        } while (!ValidadorUsuario.validarContraseña(contraseña));

        Usuario nuevoUsuario = new Usuario(nombre, correo, contraseña);
        System.out.println("\nUsuario registrado con exito:");
        System.out.println(nuevoUsuario);
    }
}


