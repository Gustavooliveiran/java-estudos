import java.util.ArrayList;

public class CadastroUsuarios {

    public static void main(String[] args) {

        ArrayList<String> usuarios = new ArrayList<>();

        usuarios.add("Carlos");
        usuarios.add("Ana");
        usuarios.add("Lucas");

        System.out.println("Lista de usuários:");

        for (String usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
