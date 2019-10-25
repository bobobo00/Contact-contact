import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName Contact
 * @Description TODO
 * @Auther danni
 * @Date 2019/10/24 21:24]
 * @Version 1.0
 **/

public class Contact {
    Map<String, User> map=new TreeMap<>();
    public void addPerson(String name, String telephone, String officetele)throws NameExistException{
        User user=new User(name,telephone,officetele);
        if(map.containsKey(name)){
            throw new NameExistException();
        }
        map.put(name,user);
    }

    public User searchPerson(String name){
        if(map.containsKey(name)){
            return map.get(name);
        }
           return null;

    }

    public void updatePerson(String name, String telephone, String officetele) {
          map.replace(name,new User(name,telephone,officetele));

    }

    public void deletPerson(String name)throws NullPointerPersonException {
        if(map.containsKey(name)){
            map.remove(name);
        }else{
            throw new NullPointerPersonException();
        }
    }
}
