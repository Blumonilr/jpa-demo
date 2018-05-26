# jpa-demo
demo for spring boot+jpa+hibernate+mysql

UserRespository @Query 的问题解决了……
出错原因在于hql与sql的不同……
解决办法：@Query(value="select * from users [where clause]",nativeQuery=true)..........sql
   或者：@Query("select u from User u [where clause]").................................hql

详细原因见：https://www.cnblogs.com/zhangliang88/p/5476340.html
