/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construirsa;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class ConstruirSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("org.mariadb.jdbc.Driver");
           String URL = "jdbc:mariadb://localhost:3306/construirsa";
            String usuario="root";
            String password="";
            Connection con = DriverManager.getConnection(URL, usuario, password);
                      
//
//        String sql = "INSERT INTO empleado(dni,apellido,nombre,acceso,estado) VALUES"
//                  + "(321343212,'Rosales','Joaquin',1,1),"
//                   + "(432123231,'Jofre','Mario',1,0),"
//                  + "(382127321,'Contrera','Claudio',2,1)";
//        
//          PreparedStatement ps=con.prepareStatement(sql);
//           int filas= ps.executeUpdate();
//            if(filas>0){
//            
//               JOptionPane.showMessageDialog(null, "Empleados cargados con exito");
//           }


             //Agregando herramientas
//        String sql = "INSERT INTO herramienta(descripcion,estado,nombre,stock) VALUES"
//                + "('Pinza pico loro',1,'Joaquin',3),"
//                + "('Taladro electtrico',0,'Claudio',12)";
//        
//               PreparedStatement ps=con.prepareStatement(sql);
//               int filas= ps.executeUpdate();
//                if(filas>0){
//                    JOptionPane.showMessageDialog( null,"Herramientas cargadas con exito");
//               }
           
            //Listar todas las herramientas con Stock > 10
            
//            String sql="SELECT * FROM herramienta  WHERE herramienta.stock > 10";
//           PreparedStatement ps = con.prepareStatement(sql);
//           ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//              int Stock=rs.getInt("stock");
//               String descripcion=rs.getString("descripcion");
//              String nombre=rs.getString("nombre");              
//              boolean estado=rs.getBoolean("estado");
//                
//              System.out.println("descripcion" + descripcion);
//               System.out.println("nombre"+ nombre);
//                System.out.println("stock"+ Stock);
//               
//              
//           }
//           con.close();

//        String sql = "UPDATE empleado SET estado = false WHERE dni = 321343212";
//             PreparedStatement ps = con.prepareStatement(sql);
//             int fila = ps.executeUpdate();
//             if(fila>0){
//                 System.out.println("Empleado dado de baja con exito");
//             }
//             con.close();
        
             
        }catch(ClassNotFoundException ex){
           
            JOptionPane.showMessageDialog(null,"Error al cargar el driver");
        }catch(SQLException ex){
            
             JOptionPane.showMessageDialog(null,"Error SQL");
         
        }
        
        
      
        
        
        
            
                
    }
    
}
