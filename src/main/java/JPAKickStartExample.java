import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.Arrays;
import java.util.List;

public class JPAKickStartExample {

    public static void main (String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("testPersistenceUnit");
        EntityManager entityManager = emf.createEntityManager();
        System.out.println("gangsta");
       /* entityManager.getTransaction().begin();

        MyObject myObject = new MyObject();
        myObject.setStr("one");
        entityManager.persist(myObject);

        myObject = new MyObject();
        myObject.setStr("two");
        entityManager.persist(myObject);

        entityManager.getTransaction().commit();*/

        /*findObjectById(entityManager);
        queryWithJPQL(entityManager);
        typedQueryWithJPQL(entityManager);
        criteriaQuery(entityManager);
        queryNative(entityManager);*/
    }

   /* private static void findObjectById (EntityManager entityManager) {
        System.out.println("----\nfinding object by id");
        MyObject o = entityManager.find(MyObject.class, 2L);
        System.out.println(o);
    }

    private static void queryWithJPQL (EntityManager entityManager) {
        System.out.println("----\nQuerying using JPQL");
        Query query = entityManager.createQuery("select t from MyObject t");
        List resultList1 = query.getResultList();
        System.out.println(resultList1);
    }

    private static void typedQueryWithJPQL (EntityManager entityManager) {
        System.out.println("----\nTyped Querying using JPQL");
        TypedQuery<MyObject> q =
                entityManager.createQuery("select t from MyObject t"
                        , MyObject.class);
        System.out.println(q.getResultList());
    }

    private static void queryNative (EntityManager entityManager) {
        System.out.println("----\nnative query");
        Query nativeQuery = entityManager.createNativeQuery("select * from MyObject");
        List resultList = nativeQuery.getResultList();
        for (Object o : resultList) {
            if (o.getClass().isArray()) {
                Object oa[] = (Object[]) o;
                System.out.println(Arrays.asList(oa));
            } else {
                System.out.println(o);
            }
        }
    }


    private static void criteriaQuery (EntityManager entityManager) {
        System.out.println("----\ncriteria query");
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Object> query = cb.createQuery();
        CriteriaQuery<Object> select = query.select(query.from(MyObject.class));

        TypedQuery<Object> typedQuery = entityManager.createQuery(select);
        System.out.println(typedQuery.getResultList());
    }*/
}