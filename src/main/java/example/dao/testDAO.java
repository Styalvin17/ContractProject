package example.dao;

import net.paoding.rose.jade.annotation.DAO;
import net.paoding.rose.jade.annotation.SQL;

import java.util.List;

@DAO(catalog = "dataSource")
public interface testDAO {

//    public final String COLUMN = "id,chash,chain,from,to,input,hash,number,time,type,status";
//
//    @SQL("select * from user")
//    public List<UserInfo> queryUserInfo();
}