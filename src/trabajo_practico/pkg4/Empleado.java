package trabajo_practico.pkg4;
public class Empleado {
    int id;
    String nombre;
    String puesto;
    double salario;
    static int totalEmpleados = 0;
    
    // Constructor con 4 parametros
    public Empleado(int id, String nombre, String puesto, double salario){
        totalEmpleados++;
        this.setId(id);
        this.setNombre(nombre);
        this.setPuesto(puesto);
        this.setSalario(salario);
    }
    
    // Constructor con 2 parametros
    public Empleado(String nombre, String puesto){
        this(totalEmpleados, nombre, puesto, 150.0);
    }
    
    // Establece el id
    public void setId(int id){
        this.id = id;
    }
    
    // Establece el nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    // Establece el puesto
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    
    // Establece el salario
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    // Muestra el total de empleados
    static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    // Aumenta el salario en un porcentaje
    public void actualizarSalario(double porcentaje){
        this.salario += this.salario * (porcentaje / 100);
    }

    // Aumenta el salario en una cantidad fija
    public void actualizarSalario(int cantidadFija){
        this.salario += cantidadFija;
    }

    // Muestra los abributos del objeto instanciado
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
}
