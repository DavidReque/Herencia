public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(17, "David Requeno", 9681500, 5000);

        cliente.mostrarDatos();
    }

}

 
    class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        public Persona (int edad, String nombre, int telefono) {
            this.edad = edad;
            this.telefono = telefono;
            this.nombre = nombre;
        }

        public int getEdad () {
            return edad;
        }

        public String getNombre () {
            return nombre;
        }

        public int getTelefono () {
            return telefono;
        }
    }

class Cliente extends Persona {
    private int credito;

    public Cliente (int edad, String nombre, int telefono, int credito) {
        super (edad, nombre, telefono);
        this.credito = credito;
    }
    public void mostrarDatos () {
           System.out.println("Nombre: "+getNombre()+
           "\nEdad: "+getEdad()+
           "\nTelefono: "+getTelefono()+
           "\nCredito: "+credito); 
        }
}

class Trabajador extends Persona {
    private int salario;

    public Trabajador (int edad, String nombre, int telefono, int credito, int salario) {
        super (edad, nombre, telefono);
        this.salario = salario;

}

}