public class Main {
    public static void main(String args[])
    {

        Rol rol = new Rol();

        System.out.println("-----------DATOS------------");
        rol.agregarPermisoRol(new PermisoRol(new Rol(" PROFESOR"), new Permiso("Agregar")));
        rol.agregarPermisoRol(new PermisoRol(new Rol(" DECANA"), new Permiso("Editar")));
        rol.agregarPermisoRol(new PermisoRol(new Rol(" COORDINADOR"), new Permiso("Eliminar")));
        rol.agregarPermisoRol(new PermisoRol(new Rol(" SECRETARIA"),new Permiso("Seleccionar")));
        rol.listarPermisoRol();

        System.out.println("----------BUSCAR PERMISO---------- ");
        rol.buscarPermisoRol("Agregar");
        rol.ordenarPermisoRol();

        System.out.println("----------EDITAR--------");
        rol.modificarPermisoRol("Agregar",new PermisoRol(new Rol("INGENIERO"),new Permiso("Detalles")));
        rol.eliminarPermisoRol("Seleccionar");
    }
}