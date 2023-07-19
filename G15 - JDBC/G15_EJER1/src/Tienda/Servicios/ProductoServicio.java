package Tienda.Servicios;


import Tienda.Entidades.Fabricante;
import Tienda.Entidades.Producto;
import Tienda.Persistencia.ProductoDAO;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {
   
    private ProductoDAO prodDAO = new ProductoDAO(); 
    private FabricanteServicio fabSer = new FabricanteServicio();
    private ArrayList<Producto> productos = new ArrayList();
    private ArrayList<Fabricante> fabricantes = new ArrayList();
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    //a) Lista el nombre de todos los productos que hay en la tabla producto.
    
    public ArrayList<Producto> listarProd() throws Exception{
        try {
            productos = prodDAO.listarProd();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirLista () throws Exception{
        try {
            productos = listarProd();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos en la lista");
            } else {
                for (Producto aux : productos) {
                    System.out.println(aux);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    //b) Lista los nombres y los precios de todos los productos de la tabla producto.
    
     public ArrayList<Producto> listarNombreyPrecio() throws Exception{
        try {
            productos = prodDAO.listarNombyPrec();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
     
    public void imprimirNombrePrecio () throws Exception{
        try {
            productos = listarNombreyPrecio();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos en la lista");
            } else {
                for (Producto aux : productos) {
                    System.out.println("Nombre: " + aux.getNombre() + "|| Precio:" + aux.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    } 
    
    // Consulta con SQL desde main
    
     public void imprimirSQL(String sql) throws Exception{
        try {
            productos = prodDAO.listarSQL(sql);
            if (productos.isEmpty()) {
                throw new Exception("No hay productos en la lista");
            } else {
                for (Producto aux : productos) {
                    if (aux.getCodigo()!=0) {
                        System.out.print("||Codigo:" + aux.getCodigo()+ "||");
                    }
                    if (aux.getNombre()!=null) {
                        System.out.print("||Nombre: " + aux.getNombre()+ "||");
                    }
                    if (aux.getPrecio()!=0.00) {
                        System.out.print("||Precio:" + aux.getPrecio()+ "||");
                    }
                    if (aux.getCodigoFabricante()!=0) {
                        System.out.print("||Cod. Fabricante:" + aux.getCodigoFabricante()+ "||");
                    }
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
     
    public Producto datos(){
        
        System.out.println("Ingrese el nombre del producto");
        String nombre = sc.next();
        System.out.println("Ingrese el precio del producto");
        Double precio = sc.nextDouble();
        System.out.println("Ingrese el codigo del fabricante");
        int cod_fab = sc.nextInt();
        return new Producto(nombre,precio,cod_fab);
    } 
     
    public void agregarProducto () throws Exception{
        Producto prod = datos();
        try {
           prodDAO.guardarProducto(prod); 
        } catch (Exception e) {
            throw e;
        }
    } 
    
    //8-Editar un producto con datos a elección.
    public void modificar () throws Exception {
        
        try {
            int opc;
            do {
                System.out.println("Modificar producto: \n1-Por nombre \n2-Por codigo \n3-Salir");
                opc = sc.nextInt();
                while (opc < 1 || opc > 3) {
                System.out.println("El valor ingresado no corresponde a ninguna opción, intente nuevamente");
                opc = sc.nextInt();
                }
                switch (opc) {
                    case 1:
                        try {
                            modXNombre();
                        } catch (Exception e) {
                            throw e;
                        }
                    break;
                    case 2:
                        try {
                            modXID();
                        } catch (Exception e) {
                            throw e;
                        }
                    break;
                } 
            } while (opc!=3);
        } catch (Exception e) {
            throw e;
        }  
    }
    
    public void modXNombre () throws Exception{
        int codigo;
        String nombre;
        Double precio;
        int cod_fab;
        try {
            System.out.println("Ingrese el nombre");
            nombre = sc.next();
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%" + nombre + "%'";
            productos = prodDAO.listarSQL(sql);
            if (productos.size()==1) {
                System.out.println(productos.toString());
                System.out.println("Este es el producto que deseas modificar? (si/no)");
                String opc = sc.next();
                if (opc.equalsIgnoreCase("si")) {
                    nombre= productos.get(0).getNombre();
                    codigo = productos.get(0).getCodigo();
                    System.out.println("Deseas cambiar el precio?");
                    opc = sc.next();
                    if (opc.equalsIgnoreCase("si")) {
                        System.out.println("Ingrese el nuevo precio");
                        precio = sc.nextDouble();
                    } else {
                        precio = productos.get(0).getPrecio();
                        System.out.println("El precio se mantiene");
                    }
                    System.out.println("Deseas cambiar el codigo del fabricante?");
                    opc = sc.next();
                    if (opc.equalsIgnoreCase("si")) {
                        fabricantes = fabSer.codFab();
                        System.out.println("Ingrese el nuevo codigo");
                        boolean repetir = true;
                        do {
                            cod_fab = sc.nextInt(); 
                            for (Fabricante fab : fabricantes) {
                                if (fab.getCodigo()==cod_fab) {
                                    repetir=false;
                                } 
                            }
                            if (repetir) {
                                System.out.println("El codigo es invalido.Intente nuevamente");
                            }
                        } while (repetir);
                    } else {
                        cod_fab = productos.get(0).getCodigoFabricante();
                        System.out.println("El codigo del fabricante se mantiene");
                    }
                    
                    Producto prod = new Producto (codigo,nombre,precio,cod_fab);
                    prodDAO.modificarxID(prod);
                    System.out.println("Producto modificado correctamente");
                } else {
                    System.out.println("Deberas intentar nuevamente");
                }
            } else if (productos.size()>1) {
                System.out.println("Existen más de 2 productos con ese nombre");
                mostrarLista(productos);
                System.out.println("Intenta nuevamente por código o nombre más especifico");
            } else {
                System.out.println("Producto no encontrado por nombre. Intenta modificar por codigo.");
            }
            
        } catch (Exception e) {
            throw e;
        }    
    }
    
    public void modXID () throws Exception{
        int codigo;
        String nombre;
        Double precio;
        int cod_fab;
        try {
            System.out.println("Ingrese el codigo del producto");
            codigo = sc.nextInt();
            String sql = "SELECT * FROM producto where codigo = "+ codigo+"";
            productos = prodDAO.listarSQL(sql);
            if (productos.size()==1) {
                System.out.println(productos.toString());
                System.out.println("Este es el producto que deseas modificar? (si/no)");
                String opc = sc.next();
                if (opc.equalsIgnoreCase("si")) {
                    codigo = productos.get(0).getCodigo();
                    System.out.println("Deseas cambiar el nombre?");
                    opc = sc.next();
                    if (opc.equalsIgnoreCase("si")) {
                        System.out.println("Ingrese el nuevo nombre");
                        nombre = sc.next();
                    } else {
                        nombre = productos.get(0).getNombre();
                        System.out.println("El nombre se mantiene");
                    }
                    System.out.println("Deseas cambiar el precio?");
                    opc = sc.next();
                    if (opc.equalsIgnoreCase("si")) {
                        System.out.println("Ingrese el nuevo precio");
                        precio = sc.nextDouble();
                    } else {
                        precio = productos.get(0).getPrecio();
                        System.out.println("El precio se mantiene");
                    }
                    System.out.println("Deseas cambiar el codigo del fabricante?");
                    opc = sc.next();
                    if (opc.equalsIgnoreCase("si")) {
                        fabricantes = fabSer.codFab();
                        System.out.println("Ingrese el nuevo codigo");
                        boolean repetir = true;
                        do {
                            cod_fab = sc.nextInt(); 
                            for (Fabricante fab : fabricantes) {
                                if (fab.getCodigo()==cod_fab) {
                                    repetir=false;
                                } 
                            }
                            if (repetir) {
                                System.out.println("El codigo es invalido.Intente nuevamente");
                            }
                        } while (repetir);
                    } else {
                        cod_fab = productos.get(0).getCodigoFabricante();
                        System.out.println("El codigo de fabricante se mantiene");
                    }
                    Producto prod = new Producto (codigo,nombre,precio,cod_fab);
                    prodDAO.modificarxID(prod);
                } else {
                    System.out.println("Deberas intentar nuevamente");
                }
            } else if (productos.size()>1) {
                System.out.println("Existen más de 2 productos con ese nombre");
                mostrarLista(productos);
                System.out.println("Intenta nuevamente por código o nombre más especifico");
            } else {
                System.out.println("Codigo no encontrado.");
            }
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void mostrarLista(ArrayList<Producto> productos){
        for (Producto aux : productos) {
            System.out.println(aux);
        }
    }
    
         
}
