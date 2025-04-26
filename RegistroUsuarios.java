import java.util.Scanner;

public class RegistroUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registro de Usuario ===");

        System.out.print("Ingrese su nombre completo: ");
        String nombre = scanner.nextLine();
        if (!ValidadorUsuario.validarNombre(nombre)) {
            System.out.println("Nombre inválido. Debe iniciar con mayúscula y solo contener letras.");
            return;
        }

        System.out.print("Ingrese su correo electrónico: ");
        String correo = scanner.nextLine();
        if (!ValidadorUsuario.validarCorreo(correo)) {
            System.out.println("Correo inválido.");
            return;
        }

        String contraseña;
        do {
            System.out.print("Ingrese su contraseña: ");
            contraseña = scanner.nextLine();

            if (!ValidadorUsuario.validarContraseña(contraseña)) {
                System.out.println("Contraseña inválida. Debe tener al menos 8 caracteres, incluir mayúsculas, minúsculas, números y símbolos.");
            }

        } while (!ValidadorUsuario.validarContraseña(contraseña));

        Usuario nuevoUsuario = new Usuario(nombre, correo, contraseña);
        System.out.println("\nUsuario registrado con éxito:");
        System.out.println(nuevoUsuario);
    }
}

