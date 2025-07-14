package interfaceAndAbstract;

public class CrudMain {
    public static void main(String[] args) {
        Crud crud = new Crudimpl();
        crud.create();
        System.out.println("=====================");
        System.out.println(crud.read());
        System.out.println("=====================");
        boolean delete = crud.delete(3);
        System.out.println("=====================");
        System.out.println(delete);
        crud.update(7);

    }
}
