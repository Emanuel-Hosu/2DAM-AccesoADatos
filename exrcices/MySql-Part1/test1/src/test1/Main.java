package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    // Constantes de conexión
    private static final String URL = "jdbc:mysql://localhost:3306/mibasededatos?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "Cm071111";
    
    public static void main(String[] args) throws ClassNotFoundException {

        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer conexión
            Connection conexion = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexión establecida con éxito");
            
            // Crear Statement
            Statement stmt = conexion.createStatement();
            
            // SQL para crear la tabla departamento
            String createTableSQL = "CREATE TABLE IF NOT EXISTS departamento ("
                + "id_departamento INT AUTO_INCREMENT PRIMARY KEY,"
                + "nombre VARCHAR(50) NOT NULL,"
                + "ubicacion VARCHAR(100),"
                + "presupuesto DECIMAL(10,2),"
                + "jefe_departamento VARCHAR(50),"
                + "fecha_creacion DATE"
                + ")";
            
            // Ejecutar la creación de la tabla
            stmt.executeUpdate(createTableSQL);
            System.out.println("Tabla departamento creada correctamente");
            
            // Insertar algunos departamentos de ejemplo
            String[] insertDepartamentos = {
                "INSERT INTO departamento (nombre, ubicacion, presupuesto, jefe_departamento, fecha_creacion) " +
                "VALUES ('Recursos Humanos', 'Planta 1', 50000.00, 'María García', '2024-01-14')",
                
                "INSERT INTO departamento (nombre, ubicacion, presupuesto, jefe_departamento, fecha_creacion) " +
                "VALUES ('Desarrollo', 'Planta 2', 75000.00, 'Juan Pérez', '2024-01-14')",
                
                "INSERT INTO departamento (nombre, ubicacion, presupuesto, jefe_departamento, fecha_creacion) " +
                "VALUES ('Marketing', 'Planta 1', 45000.00, 'Ana López', '2024-01-14')"
            };
            
            // Ejecutar las inserciones
            for (String insert : insertDepartamentos) {
                try {
                    stmt.executeUpdate(insert);
                    System.out.println("Departamento insertado correctamente");
                } catch (SQLException e) {
                    System.out.println("Error al insertar departamento: " + e.getMessage());
                }
            }
            
            // Cerrar recursos
            stmt.close();
            conexion.close();
            System.out.println("Conexión cerrada");
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}