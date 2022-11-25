package lesson03;

public interface UserService2 extends DAOAbstractCRUD<User>{
	
	User readByEmail(String email) throws DAOException;

	boolean updateByEmail(User t) throws DAOException;

}
